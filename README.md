# GRASP Principle: Indirection

## Definition:

The **Indirection** principle assigns responsibilities to intermediate objects that mediate between other components or services to achieve low coupling. By introducing an intermediary, we reduce the direct dependencies between classes, making the system more modular and flexible.

## Explanation:

Indirection introduces an intermediate class to decouple high-level modules from low-level modules. This helps to reduce direct dependencies and allows changes in one part of the system without affecting other parts. By using indirection, we can improve modularity, reusability, and flexibility in our design.

## Example:

In our **Task Management System**, we use service classes like `TaskService` to mediate between the controller and the domain models (`Project`, `Task`). The controller doesn't directly interact with the `Project` or `Task` objects for adding tasks, and instead, it delegates this responsibility to the `TaskService`. This intermediary service handles the task creation, promoting low coupling between the controller and model.

Here’s how the **Indirection** principle is applied:

```java
public class TaskService {
    // Indirection: Mediates between controller and task model
    public void addTaskToProject(Project project, String title, String description, int order, boolean isCritical) {
        project.createTask(title, description, order, isCritical);
    }

    // Other task-related operations
}


You can find the Class file in **src/main/java/org/example/Task** 
