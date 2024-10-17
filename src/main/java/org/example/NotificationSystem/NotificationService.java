package org.example.NotificationSystem;

import org.example.Developer.Developer;
import org.example.Task.Task;

public class NotificationService {
    // Pure Fabrication: Handles sending notifications to developers

    // Method to notify a developer about a task
    public void sendTaskNotification(Developer developer, Task task) {
        // Example: Send a notification to the developer
        System.out.println("Notification sent to " + developer.getName() +
                " about task: " + task.getTitle());
    }
}