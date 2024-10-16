# GRASP Principle: Protected Variations

## Definition:

The **Protected Variations** principle identifies points of predicted variation in a system and creates a stable interface around them. This protects other parts of the system from changes that might occur due to varying implementations or evolving requirements.

## Explanation:

The **Protected Variations** principle is essential for designing flexible and maintainable systems. By identifying areas that are likely to change (such as different data storage mechanisms) and encapsulating them behind a stable interface, we prevent those changes from affecting the rest of the system. This reduces the ripple effect of changes, allowing the system to adapt without introducing bugs or causing extensive rewrites.

## Example:

In our **Task Management System**, we may need to support different data storage mechanisms, such as a file system or a database. To achieve this flexibility, we use the **Protected Variations** principle by defining a `DataAccess` interface. This interface is stable, meaning the rest of the system interacts with it, while the underlying implementations (file system or database) can change without affecting the rest of the codebase.

Here’s how the **Protected Variations** principle is applied:

```java
public interface DataAccess {
    void saveProjects(List<Project> projects);
    List<Project> loadProjects();
}

public class FileDataAccess implements DataAccess {
    // Implementation using file system
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
    // Implementation using a database
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

You can find the Class file in **src/main/java/org/example/DataAccess** 
