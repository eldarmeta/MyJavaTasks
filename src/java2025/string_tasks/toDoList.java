package java2025.string_tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    viewTasks(tasks);
                    break;
                case "2":
                    addTask(tasks, scanner);
                    break;
                case "3":
                    removeTask(tasks, scanner);
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    public static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
    }

    public static void removeTask(ArrayList<String> tasks, Scanner scanner) {
        viewTasks(tasks);
        if (tasks.isEmpty()) return;

        System.out.print("Enter the number of the task to remove: ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 1 && index <= tasks.size()) {
                String removed = tasks.remove(index - 1);
                System.out.println("Removed task: " + removed);
            } else {
                System.out.println("Invalid task number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}