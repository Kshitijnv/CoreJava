package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.FuncitonalityOfTaskManager.*;
import com.core.classes.TaskManager;

public class TestTaskManager {

	public static void main(String[] args) {
		/*
		 * a. Add New Task         b. Delete a task   c. Update task status           d.
		 * Display all pending tasks     e. Display all pending tasks for today        
		 *   f.  Display all tasks sorted by taskDate  
		 */
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit =false;
			Map<Integer,TaskManager> mapTask = new HashMap<>();
			while(!exit) {
			try {
					System.out.println("1. Add New Task\n"
							+ "2. Delete a task\n"
							+ "3. Update task status\n"
							+ "4. Display all pending tasks\n"
							+ "5. Display all pending tasks for today\n"
							+ "6. Display all tasks sorted by taskDate\n"
							+ "0. Exit");
					switch (sc.nextInt()) {
					case 1:
						addNewTask(mapTask,sc);
						
						break;
					case 2:
						deleteTask(mapTask,sc);
						break;
					case 3:
						updateTaskStatus(mapTask,sc);
						break;
					case 4:
						displayAllPendingTasks(mapTask);
						break;
					case 5:
						displayAllPendingTasksForToday(mapTask);
						break;
					case 6:
						displayAllTasksSorted(mapTask);
						break;
					case 0:
						exit=true;
						System.out.println("Thanks, Exiting!!!");
						break;
					default:
						System.out.println("Invalid Choice!!!!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
					System.out.println("Please Try again!!!");
			}
			}
		}
	}

}
