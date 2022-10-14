package com.revature.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.servlets.UserServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import java.time.LocalDateTime;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[LOG] - Servlet context was initialized at " + LocalDateTime.now());

        //We can also programmatically define/register our servlets with the container here
        ObjectMapper mapper = new ObjectMapper();
        UserServlet userServlet = new UserServlet(mapper);

        //Now register it with the context itself
        ServletContext context = sce.getServletContext();
        ServletRegistration.Dynamic registeredServlet = context.addServlet("UserServlet", userServlet);
        //Now I can affect the fields that I wanted to before
        registeredServlet.addMapping("/users");
        registeredServlet.setLoadOnStartup(3);
        registeredServlet.setInitParameter("users-servlet-key", "user-servlet-value");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[LOG] - Servlet context was destroyed at " + LocalDateTime.now());
    }
}
