package org.example.Task;

public class TaskService {
    // Indirection: Mediates between controller and task model
    public void addTaskToProject(Project project, String title, String description, int order, boolean isCritical) {
        project.createTask(title, description, order, isCritical);
    }

    // Other task-related operations
}
