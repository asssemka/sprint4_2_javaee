package kz.narxoz.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.narxoz.db.DBManager;
import kz.narxoz.db.Tasks;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



@WebServlet(value = "/home.html")
public class HomeServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");
    ArrayList<Tasks> tasks =DBManager.getAllTasks();

    request.setAttribute("tasks",tasks);
    request.getRequestDispatcher("task-list.jsp").forward(request,response);


  }
}
