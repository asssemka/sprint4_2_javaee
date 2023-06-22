package kz.narxoz.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.narxoz.db.DBManager;
import kz.narxoz.db.Tasks;

public class AddTaskServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    Long taskId = Long.parseLong(request.getParameter("id"));
    String taskName = request.getParameter("name");
    String taskDescription = request.getParameter("description");
    String taskDeadline = request.getParameter("deadline");

    Tasks task = new Tasks(taskId, taskName, taskDescription, taskDeadline);
    DBManager.addTask(task);

    response.sendRedirect("task-list.jsp");
  }
}

