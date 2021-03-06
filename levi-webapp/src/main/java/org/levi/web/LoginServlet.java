package org.levi.web;

import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.impl.identity.GroupImpl;
import org.levi.engine.impl.identity.UserImpl;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles the login action of the admin-console web app
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (!allowUser(username, password)) {
            response.sendRedirect("login.jsp?isLoginSuccess=false");
        } else {
            // Valid login. Make a note in the session object.
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("logged", "true");
            // Try redirecting the client to the page he first tried to access
            try {
                String target = (String) session.getAttribute("login.target");
                if (target != null) {
                    response.sendRedirect(target);
                    return;
                }
            } catch (Exception ignored) {
            }
            // Start Engine
            ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
            request.getSession().setAttribute("processEngine", engine);
            DBManager dbManager = new DBManagerImpl();
            request.getSession().setAttribute("dbManager", dbManager);
            /* Default User, Group Configuration */
            Group group = new GroupImpl();
            group.setGroupId("Administration");
            group.setGroupName("Administration");
            group.setGroupDescription("Handles administrative functions");
            dbManager.saveGroup(group);

            User user = new UserImpl();
            List<Group> userGroups = new ArrayList<Group>();
            if (dbManager.getUser(username) == null) {
                user.setUserId(username);
                user.setPassword(password);

                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getUser("admin") == null) {
                user = new UserImpl();
                user.setUserId("admin");
                user.setPassword("admin");
                userGroups = new ArrayList<Group>();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getUser("john") == null) {
                user = new UserImpl();
                user.setUserId("john");
                user.setPassword("john");
                userGroups = new ArrayList<Group>();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            // Couldn't redirect to the target. Redirect to the site's home page.

            UserBean userBean = dbManager.getUser(username);
            String userGroupsString = "";
            if (userBean.getUserGroups() != null && userBean.getUserGroups().size() > 0) {
                for (GroupBean grp : userBean.getUserGroups()) {
                    userGroupsString += grp.getGroupName() + " , ";
                }
            }
            session.setAttribute("userGroupList", userGroupsString.substring(0, userGroupsString.length() - 2));

            response.sendRedirect("index.jsp");

        }

    }

    protected boolean allowUser(String username, String password) {
        if (username.trim().equals("admin") && password.trim().equals("admin")) {
            return true;
        } else if (username.trim().equals("john") && password.trim().equals("john")) {
            return true;
        } else {
            return false;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
}