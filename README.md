# GRASP Principle: Controller

## Definition:

The **Controller** principle assigns the responsibility for handling a system event to a class representing one of these choices:

- Represents the overall system.
- Represents a use case scenario.

The controller is responsible for receiving input and coordinating actions between different parts of the system.

## Explanation:

The **Controller** principle is important for separating user interface concerns from the core logic of the application. A controller class intercepts system events (such as user inputs), interprets them, and delegates the work to the appropriate classes, thereby managing the flow of control.

## Example:

In our **Task Management System**, the `TaskManagerController` class handles user inputs and coordinates actions between the models (e.g., `Project`, `Task`, `Developer`) and views (the terminal in this case). This ensures that the system logic is separated from the user interface, keeping the application flexible and maintainable.

Here’s how the **Controller** principle is applied:

```java
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
You can find the Class file in **src/main/java/org/example/TaskManagerController** 
