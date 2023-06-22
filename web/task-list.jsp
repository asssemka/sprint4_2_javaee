<%@ page import="kz.narxoz.db.Tasks" %>
<%@ page import="kz.narxoz.db.DBManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task List</title>
</head>
<body>
<h1>Task List</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Deadline</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Tasks> tasksList = DBManager.getAllTasks();
        for (Tasks task : tasksList) {
    %>
    <tr>
        <td><%= task.getId() %></td>
        <td><%= task.getName() %></td>
        <td><%= task.getDescription() %></td>
        <td><%= task.getDeadlineDate() %></td>
        <td>
            <a href="delete-task?id=<%= task.getId() %>">Delete</a>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>
