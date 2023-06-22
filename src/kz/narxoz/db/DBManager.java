package kz.narxoz.db;

import java.util.ArrayList;

public class DBManager {
  private static ArrayList<Tasks> tasksList = new ArrayList<Tasks>();

  public static void addTask(Tasks task) {
    tasksList.add(task);
  }

  public static Tasks getTask(Long id) {
    for (Tasks task : tasksList) {
      if (task.getId().equals(id)) {
        return task;
      }
    }
    return null;
  }

  public static ArrayList<Tasks> getAllTasks() {
    return tasksList;
  }

  public static void deleteTask(Long id) {
    Tasks taskToRemove = null;
    for (Tasks task : tasksList) {
      if (task.getId().equals(id)) {
        taskToRemove = task;
        break;
      }
    }
    if (taskToRemove != null) {
      tasksList.remove(taskToRemove);
    }
  }
}
