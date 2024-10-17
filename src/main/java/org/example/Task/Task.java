package org.example.Task;

import org.example.Developer.Developer;

// Abstract class for priority tasks
public abstract class Task {
    protected int order;
    protected String title;
    protected String description;
    protected boolean isFinished;

    public Task(String title, String description, int order) {
        this.title = title;
        this.description = description;
        this.order = order;
        this.isFinished = false;
    }
    public abstract String getPriority();


    // Getters and Setters
}
