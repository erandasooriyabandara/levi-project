package org.levi.web;

import org.levi.engine.ProcessEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Handles user logouts and invalidates the browser session
 */
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        // Stop the process engine
        ProcessEngine engine=(ProcessEngine)request.getSession().getAttribute("processEngine");
        engine.stop();
        request.getSession().removeAttribute("logged");
        request.getSession().removeAttribute("username");
        request.getSession().invalidate();
        response.sendRedirect("index.jsp");
    }
}
