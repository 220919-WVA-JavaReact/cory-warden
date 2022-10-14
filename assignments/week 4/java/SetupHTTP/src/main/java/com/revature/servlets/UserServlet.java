package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.AppUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private final ObjectMapper mapper;
    public UserServlet(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - User Servlet Instantiated");
        System.out.println("[LOG] - Init param user-servlet-key: " + this.getServletConfig().getInitParameter("user-servlet-key"));
        System.out.println("[LOG] - Context param test-context-key: " + this.getServletContext().getInitParameter("test-context-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[LOG] - Sanity Servlet received a GET req at " + LocalDateTime.now());
        //When doing POST req, we parsed a json string into a java object. Now, do the reverse: java obj -> json string
        AppUser someUser = new AppUser(2, "Jane", "Doe", "jdoe@gmail.com", "jdoe", "test");

        //convert java obj into a json string

        String jsonify = mapper.writeValueAsString(someUser);
        //resp.setHeader("Content-Type", "application/json");
        resp.setContentType("application/json");
        resp.setStatus(200); //default return status
        resp.getWriter().write(jsonify);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //POST reqs are used for creation of data in an app.
        System.out.println("[LOG] - Sanity Servlet received a POST req at " + LocalDateTime.now());

        //to print from input stream:
//        BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
        AppUser newUser = mapper.readValue(req.getInputStream(), AppUser.class);
        System.out.println(newUser);

        resp.setStatus(204);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
