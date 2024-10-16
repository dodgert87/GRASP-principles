package org.example.Developer;

import java.util.ArrayList;

public class Developer {
    private String name;
    private String title;
    private String department;
    private List<Task> tasks = new ArrayList<>();

    // High Cohesion: Methods related to developer's tasks
    public void assignTask(Task task) {
        tasks.add(task);
        task.setHolder(this);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    // Getters and Setters
}
