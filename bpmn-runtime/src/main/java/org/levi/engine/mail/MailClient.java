package org.levi.engine.mail;

/**
 * Created by IntelliJ IDEA.
 * UserBean: keheliya
 * Date: Apr 18, 2011
 * Time: 7:54:50 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */

import org.apache.commons.collections.iterators.ArrayListIterator;
import org.levi.engine.utils.LeviUtils;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class MailClient
        extends Authenticator {
    public static final int SHOW_MESSAGES = 1;
    public static final int CLEAR_MESSAGES = 2;
    public static final int SHOW_AND_CLEAR =
            SHOW_MESSAGES + CLEAR_MESSAGES;

    protected String from;
    protected Session session;
    protected PasswordAuthentication authentication;

    public MailClient(String user, String host) {
        this(user, host, false);
    }

    public MailClient(String user, String host, boolean debug) {
        from = user + '@' + host;
        authentication = new PasswordAuthentication(user, user);
        Properties props = new Properties();
        props.put("mail.user", user);
        props.put("mail.host", host);
        props.put("mail.debug", debug ? "true" : "false");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        session = Session.getInstance(props, this);
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return authentication;
    }

    public void sendMessage(
            String to, String subject, String content)
            throws MessagingException {
        System.out.println("SENDING message from " + from + " to " + to);
        System.out.println();
        MimeMessage msg = new MimeMessage(session);

        // System.out.println(msg.getFrom()[0]);
        //msg.addFrom(from);
        //  new Address[]();
        msg.addRecipients(Message.RecipientType.TO, to);
        msg.setSubject(subject);
        msg.setText(content);
        msg.setSentDate(new Date());
        Transport.send(msg);
    }

    public void checkInbox(int mode)
            throws MessagingException, IOException {
        if (mode == 0) return;
        boolean show = (mode & SHOW_MESSAGES) > 0;
        boolean clear = (mode & CLEAR_MESSAGES) > 0;
        String action =
                (show ? "Show" : "") +
                        (show && clear ? " and " : "") +
                        (clear ? "Clear" : "");
        System.out.println(action + " INBOX for " + from);
        Store store = session.getStore();
        store.connect();
        Folder root = store.getDefaultFolder();
        Folder inbox = root.getFolder("inbox");
        inbox.open(Folder.READ_WRITE);
        Message[] msgs = inbox.getMessages();
        if (msgs.length == 0 && show) {
            System.out.println("No messages in inbox");
        }
        for (Message msg1 : msgs) {
            MimeMessage msg = (MimeMessage) msg1;
            if (show) {
                // System.out.println("    From: " + msg.getFrom()[0]);
                System.out.println(" Subject: " + msg.getSubject());
                System.out.println(" Content: " + msg.getContent());
            }
            if (clear) {
                msg.setFlag(Flags.Flag.DELETED, true);
            }
        }
        inbox.close(true);
        store.close();
        System.out.println();
    }

    public Map<String,String> getMessages(int mode) throws MessagingException, IOException {
        Map<String,String> messageList = LeviUtils.newHashMap();
        if (mode == 0) {
            return messageList;
        }
        boolean show = (mode & SHOW_MESSAGES) > 0;
        boolean clear = (mode & CLEAR_MESSAGES) > 0;
        String action =
                (show ? "Show" : "") +
                        (show && clear ? " and " : "") +
                        (clear ? "Clear" : "");
        //System.out.println(action + " INBOX for " + from);
        Store store = session.getStore();
        store.connect();
        Folder root = store.getDefaultFolder();
        Folder inbox = root.getFolder("inbox");
        inbox.open(Folder.READ_WRITE);
        Message[] msgs = inbox.getMessages();
        if (msgs.length == 0 && show) {
               return messageList;
        }
        int id=0;
        for (Message msg1 : msgs) {
            MimeMessage msg = (MimeMessage) msg1;
            if (show) {
                id++;
               messageList.put(id+"",msg.getContent().toString());
            }
            if (clear) {
                msg.setFlag(Flags.Flag.DELETED, true);
            }
        }
        inbox.close(true);
        store.close();
        return messageList;
    }
}
