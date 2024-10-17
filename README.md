# GRASP Principle: Indirection

## Definition:

The **Indirection** principle assigns responsibilities to intermediate objects that mediate between other components or services to achieve low coupling. By introducing an intermediary, we reduce the direct dependencies between classes, making the system more modular and flexible.

## Explanation:

Indirection introduces an intermediate class to decouple high-level modules from low-level modules. This helps to reduce direct dependencies and allows changes in one part of the system without affecting other parts. By using indirection, we can improve modularity, reusability, and flexibility in our design.

## Example:

In our **Task Management System**, we use the `PersistenceManager` to mediate between the controller and the data access implementations (`FileDataAccess` or `DatabaseDataAccess`). The controller doesn't directly interact with the file system or the database; instead, it relies on the `PersistenceManager` to handle data operations. This intermediary service handles the persistence logic, promoting low coupling between the controller and the data storage systems.

Here’s how the **Indirection** principle is applied:

```java
public interface DataAccess {
    // Indirection: Interface for handling data operations
    void saveProjects(List<Project> projects);
    List<Project> loadProjects();
}

public class FileDataAccess implements DataAccess {
    // Implementation for file system data access
    @Override
    public void saveProjects(List<Project> projects) {
        // Save projects to file system
    }

    @Override
    public List<Project> loadProjects() {
        // Load projects from file system
        return new ArrayList<>();
    }
}

public class DatabaseDataAccess implements DataAccess {
    // Implementation for database data access
    @Override
    public void saveProjects(List<Project> projects) {
        // Save projects to database
    }

    @Override
    public List<Project> loadProjects() {
        // Load projects from database
        return new ArrayList<>();
    }
}

public class PersistenceManager {
    private DataAccess dataAccess;

    // Indirection: Mediates between the controller and data storage
    public PersistenceManager(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void saveProjects(List<Project> projects) {
        dataAccess.saveProjects(projects);
    }

    public List<Project> loadProjects() {
        return dataAccess.loadProjects();
    }
}

You can find the Class file in **src/main/java/org/example/DataAccess** 
