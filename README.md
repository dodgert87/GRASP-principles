# GRASP Principle: Polymorphism

## Definition:

The **Polymorphism** principle suggests that behavior should vary based on type, and this variation should be handled using polymorphic methods. This allows for dynamic method dispatch where different types of objects can be treated uniformly, but they can behave differently based on their actual class.

## Explanation:

Polymorphism allows objects of different classes to be treated as instances of a common superclass or interface. This helps reduce conditionals and enhances flexibility by allowing subclasses to provide specific implementations of methods while sharing a common interface or abstract class.

## Example:

In our **Task Management System**, we may have tasks with different levels of priority, such as `HighPriorityTask` and `LowPriorityTask`. Both types of tasks share common attributes and behaviors but may have specific logic for how their priority affects task scheduling or notifications. By using polymorphism, we can treat all tasks as instances of a common `Task` class while allowing priority-specific tasks to implement their functionality.

Here’s how the **Polymorphism** principle is applied:

```java
// Abstract class for priority tasks
public abstract class Task {
    protected int order;
    protected String title;
    protected String description;
    protected boolean isFinished;
    protected Developer holder;

    public Task(String title, String description, int order) {
        this.title = title;
        this.description = description;
        this.order = order;
        this.isFinished = false;
        this.holder = null;
    }

    public abstract String getPriority();

    public void markAsFinished() {
        this.isFinished = true;
    }

    public void markAsOpen() {
        this.isFinished = false;
    }

    // Getters and Setters
}

// High priority task implementation
public class HighPriorityTask extends Task {

    public HighPriorityTask(String title, String description, int order) {
        super(title, description, order);
    }

    @Override
    public String getPriority() {
        return "High Priority";
    }
}

// Low priority task implementation
public class LowPriorityTask extends Task {

    public LowPriorityTask(String title, String description, int order) {
        super(title, description, order);
    }

    @Override
    public String getPriority() {
        return "Low Priority";
    }
}
