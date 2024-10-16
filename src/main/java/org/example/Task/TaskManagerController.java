package org.example.Task;

import org.example.Developer.DeveloperService;
import org.example.PersistenceManager.PersistenceManager;
import org.example.Project.Project;

import java.util.List;
import java.util.Scanner;

public class TaskManagerController {
    private Scanner scanner;
    private List<Project> projects;
    private PersistenceManager persistenceManager;
    private TaskService taskService;
    private DeveloperService developerService;

    public TaskManagerController(PersistenceManager persistenceManager) {
        this.scanner = new Scanner(System.in);
        this.persistenceManager = persistenceManager;
        this.projects = persistenceManager.loadProjects();
        this.taskService = new TaskService();
        this.developerService = new DeveloperService();
    }



    public void start() {
        // Controller: Manages the flow of the application
        while (true) {
            System.out.println("1. List Projects");
            System.out.println("2. Create Project");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    listProjects();
                    break;
                case 2:
                    createProject();
                    break;
                case 3:
                    persistenceManager.saveProjects(projects);
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Methods for listing and creating projects, managing tasks and developers
    private void createProject() {
        //todo
    }

    private void listProjects() {
        //todo
    }
}