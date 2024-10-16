package org.example.TaskManagerController;

import java.util.Scanner;

public class TaskManagerController {
    private Scanner scanner = new Scanner(System.in);
    private List<Project> projects = new ArrayList<>();
    private PersistenceManager persistenceManager = new PersistenceManager();

    // Controller: Handles system events
    public void start() {
        // Load projects from storage
        projects = persistenceManager.loadProjects();

        while (true) {
            System.out.println("1. List Projects");
            System.out.println("2. Create Project");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listProjects();
                    break;
                case 2:
                    createProject();
                    break;
                case 3:
                    persistenceManager.saveProjects(projects);
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // Methods for listing and creating projects
}
