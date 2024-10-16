package org.example.Task;

import org.example.Project.Project;

public class TaskService {
    // Pure Fabrication: Handles business logic for tasks
    public void addTaskToProject(Project project, String title, String description, int order, boolean isCritical) {
        project.createTask(title, description, order, isCritical);
    }

    public void deleteTaskFromProject(Project project, Task task) {
        project.getTasks().remove(task);
    }

    public void updateTaskStatus(Task task, boolean isFinished) {
        task.setFinished(isFinished);
    }
}
