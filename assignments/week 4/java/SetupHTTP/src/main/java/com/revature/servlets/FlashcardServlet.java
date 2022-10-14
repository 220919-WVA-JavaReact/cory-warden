package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Flashcard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/flashcard", loadOnStartup =  2, initParams = @WebInitParam(name = "flashcard-servlet-key", value = "flashcard-servlet-value"))
public class FlashcardServlet extends HttpServlet {

    //bad practice since we need to create an OM every servlet
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - Flashcard Servlet Instantiated");
        System.out.println("[LOG] - Init param flashcard-servlet-key: " + this.getServletConfig().getInitParameter("flashcard-servlet-key"));
        System.out.println("[LOG] - Context param test-context-key: " + this.getServletContext().getInitParameter("test-context-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //from database
        Flashcard card = new Flashcard(11, "What does OOP stand for?", "Object Oriented Programming");
        String json = mapper.writeValueAsString(card);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }
}
