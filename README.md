# GRASP Principle: High Cohesion

## Definition:

The **High Cohesion** principle states that responsibilities should be assigned so that cohesion remains high. Cohesion is a measure of how strongly related and focused the responsibilities of a class are. A class with high cohesion has responsibilities that are closely related and contributes to a well-organized, understandable, and maintainable system.

## Explanation:

High cohesion helps to make a system more modular, easier to understand, and simpler to maintain. When classes focus on a single purpose and manage only related functionality, they are easier to work with and modify without affecting unrelated parts of the system. High cohesion also prevents a class from becoming too complex by having unrelated tasks, which can make it difficult to maintain and evolve.

## Example:

In our **Task Management System**, the `Task` class handles task-related operations such as managing task status and details. Similarly, the `Developer` class is focused on managing developer-related data and the tasks assigned to that developer. This clear separation of responsibilities ensures that each class is cohesive and manages only the data and behaviors directly related to its purpose.

Here’s how the **High Cohesion** principle is applied:

```java
public class Developer {
    private String name;
    private String title;
    private String department;
    private List<Task> tasks = new ArrayList<>();

    // High Cohesion: Methods related to developer's tasks
    public void assignTask(Task task) {
        tasks.add(task);
        task.setHolder(this);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    // Getters and Setters
}


You can find the Class file in **src/main/java/org/example/Developer** 
