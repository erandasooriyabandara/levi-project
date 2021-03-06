<%@ page import="org.levi.engine.db.DBManager" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.TaskBean" %>
<%@ page import="java.util.List" %>
<%@ page import="org.levi.engine.utils.LeviUtils" %>

<%--
  Created by IntelliJ IDEA.
  UserBean: umashanthi
  Date: Mar 29, 2011
  Time: 9:55:15 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Levi - The Native BPMN2.0 Execution Engine</title>
    <meta name="keywords" content=""/>
    <meta name="Premium Series" content=""/>
    <link href="default.css" rel="stylesheet" type="text/css" media="screen"/>

</head>

<body>

<script type="text/javascript">
    function displayForm(taskId, processInstanceId,formPath) {
        popwidth = 600
        popheight = 600
        function getpos() {
            leftpos = 10;// (detectexist(window.screenLeft)) ? screenLeft + document.body.clientWidth / 2 - popwidth / 2 : detectexist(window.screenX) ? screenX + innerWidth / 2 - popwidth / 2 : 0
            toppos = 10;// (detectexist(window.screenTop)) ? screenTop + document.body.clientHeight / 2 - popheight / 2 : detectexist(window.screenY) ? screenY + innerHeight / 2 - popheight / 2 : 0
            if (window.opera) {
                leftpos -= screenLeft
                toppos -= screenTop
            }
        }

        getpos()
        formWindow = window.open("vel?taskId=" + taskId + "&processInstanceId="+processInstanceId+"&formPath=" + formPath, "", "location=0,status=0,scrollbars=1,width=600,height=600");
        formWindow.moveTo(leftpos, toppos);
    }
    function claimTask(username, taskId, processInstanceId,submitFormName) {
        var form = document.getElementById(submitFormName);
        form.method = "post";
        form.action = "taskAction?action=claimTask&taskId=" + taskId + "&username=" + username + "&processInstanceId=" + processInstanceId;
        form.submit();
    }
</script>
<!-- start header -->
<div id="header">

    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>


        <p>The Native BPMN 2.0 Execution Engine</p>
        <%
            if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
        <div id="name">You are logged in as <span>
               <% out.print(session.getAttribute("username").toString()); %> </span>as a member of <span><%
            out.print(session.getAttribute("userGroupList").toString()); %></span></div>
        <%}%>

    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="tasks">Tasks</a></li>
            <li><a href="processes">Processes</a></li>
            <%if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true") && session.getAttribute("username").equals("admin")) {%>
            <li><a href="usrmng">User Management</a></li>
            <%} %>
            <li></li>
            <li></li>
            <li>
                <% if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
                <a href="logout">Logout</a></li>

            <%} else { %>
            <a href="login.jsp">Login</a></li>
            <% }%>
        </ul>
    </div>

</div>
<!-- end header -->
<div id="body">
    <div>

        &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </div>
    <table>
        <% if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {
        %>
        <tr>
            <h3><a href="tasks">My Tasks </a></h3></tr>
        <tr>
            <%

                // display tasks for this user
                assert request.getSession().getAttribute("userTaskList") != null;
                List<TaskBean> userTaskList = (List<TaskBean>) request.getSession().getAttribute("userTaskList");
                assert userTaskList != null;
                if (userTaskList.size() > 0) {
                    for (TaskBean task : userTaskList) { %>


            <%--<form action="" method="post">--%>
            <td>
                <%=task.getTaskName()%>
            </td>
            <td>
                <% if (task.isHasUserForm()) {
                    String taskId = task.getTaskId();
                    String taskFormName = task.getFormName();
                    String taskFromPath = task.getFromPath(); %>

                <input type="button" value="Start Form"
                       onclick="displayForm('<%=LeviUtils.getNotProcessId(taskId)%>','<%=LeviUtils.getNotTaskId(taskId)%>','<%=taskFromPath%>'); return false">

                <%
                } else {
                    String taskId = task.getTaskId();
                    String taskFormName = task.getFormName();
                    String taskFromPath = task.getFromPath();
                %>
                <input type="button" value="Start Task"
                       onclick="displayForm('<%=LeviUtils.getNotProcessId(taskId)%>','<%=LeviUtils.getNotTaskId(taskId)%>','<%=taskFromPath%>'); return false">
                <%}%>
            </td>
            <%
                    }
                }
            %>
        </tr>
    </table>
    <table>
        <br>
        <br>
        <tr>
            <h3><a href="tasks?unassigned=true">Unassigned Tasks </a></h3>
        </tr>
        <%
            //         if (request.getParameter("unassigned") != null && request.getParameter("unassigned").equals("true")) {
            // display unassigned tasks
            assert request.getSession().getAttribute("unassignedTasks") != null;
            List<TaskBean> unassignedTaskList = (List<TaskBean>) request.getSession().getAttribute("unassignedTasks");
            if (unassignedTaskList.size() > 0) {
                for (TaskBean unassignedTask : unassignedTaskList) { %>

        <tr>
            <form id="<%=unassignedTask.getTaskId()+"Form"%>" action="" method="post">
                <td>
                    <%=unassignedTask.getTaskName()%>
                </td>
                <td>
                    <input type="button" value="Claim Task" id="<%=unassignedTask.getTaskName()+"Button"%>"
                           onclick="claimTask('<%=session.getAttribute("username")%>','<%=LeviUtils.getNotProcessId(unassignedTask.getTaskId())%>','<%=LeviUtils.getNotTaskId(unassignedTask.getTaskId())%>','<%=unassignedTask.getTaskId()+"Form"%>');return false">
                </td>
            </form>
        </tr>
        <%
                }
            }

            //     } else { %>

        <% } else {

            response.sendRedirect("login.jsp?error=not-logged");
        }%>
    </table>


</div>
<div id="footer">
    <p class="copyright">&copy;&nbsp;&nbsp;Levi&nbsp;&bull;&nbsp;

    <p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a>
    </p>
</div>
</body>
</html>