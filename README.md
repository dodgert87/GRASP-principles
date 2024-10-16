# GRASP Principle: Creator

## Definition:

The **Creator** principle states that a class B should be responsible for creating an instance of class A if one or more of the following is true:

- B contains or aggregates A.
- B records A.
- B closely uses A.
- B has the initializing data for A.

## Explanation:

In object-oriented design, it is important to assign responsibility for creating objects to classes that have a natural connection to those objects. The **Creator** principle ensures that object creation is logically aligned with the system's design. By adhering to this principle, the class that creates an object has the required context and information, resulting in a design with better cohesion and reduced dependencies between classes.

## Example:

In our **Task Management System**, the `Project` class is responsible for creating instances of the `Task` and `Developer` classes. Since a project contains multiple tasks and developers, it makes sense for `Project` to be the **Creator** of those objects. This simplifies the design by keeping related responsibilities together.

Here’s how the **Creator** principle is applied:

```java
public class Project {
    private String name;
    private List<Task> tasks = new ArrayList<>();
    private List<Developer> developers = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    // Creator: Project creates Task instances
    public Task createTask(String title, String description, int order, boolean isCritical) {
        Task task = new Task(title, description, order, isCritical);
        tasks.add(task);
        return task;
    }

    // Creator: Project creates Developer instances
    public Developer addDeveloper(String name, String title, String department) {
        Developer developer = new Developer(name, title, department);
        developers.add(developer);
        return developer;
    }

    // Other project-related methods...
}
