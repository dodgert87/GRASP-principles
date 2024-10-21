package org.example.Task;

import org.example.Developer.Developer;

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

    // Information Expert: Task manages its status
    public void markAsFinished() {
        this.isFinished = true;
    }

    public void markAsOpen() {
        this.isFinished = false;
    }

    public void setFinished(boolean isFinished) {
    }

    public String getTitle() {
        return title;
    }

    // Getters and Setters
}
