package app.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RoomServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>RoomController :Servlet</h1>");
  }
}
