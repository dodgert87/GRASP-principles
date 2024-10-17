package org.example.Task;

import org.example.Developer.Developer;

public class Task {
    private int order;
    private String title;
    private String description;
    private boolean isCritical;
    private boolean isFinished;
    private Developer holder;

    public Task(String title, String description, int order, boolean isCritical) {
        this.order = order;
        this.title = title;
        this.description = description;
        this.isCritical = isCritical;
        this.isFinished = false;
        this.holder = null;
    }

    // Information Expert: Task manages its status
    public void markAsFinished() {
        this.isFinished = true;
    }
    public void markAsOpen() {
        this.isFinished = false;
    }


    public void setHolder(Developer developer) {
    }

    public void setFinished(boolean isFinished) {
    }

    public String getTitle() {
        return title;
    }

    // Getters and Setters
}

