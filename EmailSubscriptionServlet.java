package com.subscription;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmailSubscriptionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get email from form input
        String email = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (email != null && email.contains("@")) {
            out.println("<html><body>");
            out.println("<h2>Subscription Successful!</h2>");
            out.println("<p>Thank you for subscribing with: <b>" + email + "</b></p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid Email!</h2>");
            out.println("<p>Please enter a valid email address.</p>");
            out.println("</body></html>");
        }
    }
}
