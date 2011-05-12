package org.levi.persist.hibernate.users.hobj;

import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.identity.UserImpl;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 11, 2011
 * Time: 8:07:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class GroupDaoImpl extends HObject implements Group{
    private String groupId;
    private String groupName;
    private String groupDescription;
    private List<UserDaoImpl> members = new ArrayList<UserDaoImpl>();

    @Id
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return this.groupDescription;
    }

    public void setGroupDescription(String description) {
        this.groupDescription = description;
    }

    @ManyToMany
    @JoinTable(name = "USERGROUP", joinColumns = {@JoinColumn(name = "groupId")}, inverseJoinColumns = {@JoinColumn(name = "userId")})
    public List<UserDaoImpl> getMembers() {
        return members;
    }

    public void setMembers(List<UserDaoImpl> members) {
        this.members = members;
    }
}
