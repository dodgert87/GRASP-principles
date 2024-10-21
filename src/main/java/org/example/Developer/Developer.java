package org.example.Developer;

import org.example.Task.Task;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String name;
    @SuppressWarnings("unused")
    private String title;
    @SuppressWarnings("unused")
    private String department;
    private List<Task> tasks = new ArrayList<>();

    public Developer(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }

    // High Cohesion: Methods related to developer's tasks
    public void assignTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    // Getters and Setters
}