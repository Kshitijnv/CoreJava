package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.core.classes.TaskManager;
import com.core.classes.TaskStatus;

public class FuncitonalityOfTaskManager {

	public static void addNewTask(Map<Integer, TaskManager> mapTask, Scanner sc)
			throws InputMismatchException, DateTimeParseException {
		System.out.println("Enter the taskName, description, taskDate");
		String name = sc.next();
		String desc = sc.next();
		String d = sc.next();
		LocalDate date = LocalDate.parse(d);
		TaskManager task = new TaskManager(name, desc, date);
		mapTask.put(task.getTaskId(), task);
	}

	public static void deleteTask(Map<Integer, TaskManager> mapTask, Scanner sc) throws InputMismatchException {
		System.out.println("Enter the task id:");
		int id = sc.nextInt();
		if (mapTask.containsKey(id)) {
			mapTask.get(id).setActive(false);
			System.out.println("Task with ID " + id + " is deleted successfully");
		} else
			System.out.println("No task with ID " + id + " in the task manager");
	}

	public static void updateTaskStatus(Map<Integer, TaskManager> mapTask, Scanner sc)
			throws IllegalArgumentException, InputMismatchException {
		System.out.println("Enter the task id:");
		int id = sc.nextInt();
		if (mapTask.containsKey(id)) {
			System.out.println("What's your task status? Inprogress or Completed");
			TaskStatus status = TaskStatus.valueOf(sc.next().toUpperCase());
			mapTask.get(id).setStatus(status);
			System.out.println("Task with ID " + id + " has now " + status.name());
		} else
			System.out.println("No task with ID " + id + " in the task manager");
	}

	public static void displayAllPendingTasks(Map<Integer, TaskManager> mapTask) {
		for (TaskManager task : mapTask.values()) {
			if (task.getStatus() == TaskStatus.PENDING) {
				System.out.println(task);
			}
		}
	}

	public static void displayAllPendingTasksForToday(Map<Integer, TaskManager> mapTask) {
		for (TaskManager task : mapTask.values()) {
			if (task.getStatus() == TaskStatus.PENDING && task.getTaskDate().equals(LocalDate.now())) {
				System.out.println(task);
			}
		}
	}

	public static void displayAllTasksSorted(Map<Integer, TaskManager> mapTask) {
		mapTask.values().stream().sorted((i1, i2) -> i1.getTaskDate().compareTo(i2.getTaskDate()))
				.forEach(task -> System.out.println(task));
	}
}
