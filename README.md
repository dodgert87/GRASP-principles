# GRASP Principle: Information Expert

## Definition:

The **Information Expert** principle states that responsibility should be assigned to the class that has the necessary information to fulfill it. This ensures that the system is designed around the classes that know the most about the task at hand.

## Explanation:

The **Information Expert** principle helps in distributing responsibilities to the class that already holds the data or the logic needed to execute a task. This reduces dependencies and keeps the system cohesive by preventing unrelated classes from manipulating data they don’t own or understand.

## Example:

In our **Task Management System**, the `Task` class is responsible for managing its own status and details. Since `Task` knows whether it is finished or open, it makes sense to assign the responsibility for marking the task as open or finished to the `Task` class. Similarly, the `Developer` class knows which tasks are assigned to it and manages them accordingly.

Here’s how the **Information Expert** principle is applied:

```java
public class Task {
    private int order;
    private String title;
    private String description;
    private boolean isCritical;
    private boolean isFinished;
    private Developer holder;

    // Information Expert: Task manages its status
    public void markAsFinished() {
        this.isFinished = true;
    }

    public void markAsOpen() {
        this.isFinished = false;
    }

    // Getters and Setters
}

You can find the Class file in **src/main/java/org/example/Task** 
