package org.example.Task;

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
