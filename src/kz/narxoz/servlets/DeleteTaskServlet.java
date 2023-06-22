package kz.narxoz.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.narxoz.db.DBManager;

import java.io.IOException;

public class DeleteTaskServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    Long taskId = Long.parseLong(request.getParameter("id"));

    DBManager.deleteTask(taskId);

    response.sendRedirect("task-list.jsp");
  }
}
