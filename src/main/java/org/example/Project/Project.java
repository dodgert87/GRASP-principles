package org.example.Project;

import java.util.ArrayList;

public class Project {
    private String name;
    private List<Task> tasks = new ArrayList<>();
    private List<Developer> developers = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    // Creator: Project creates Task instances
    public Task createTask(String title, String description, int order, boolean isCritical) {
        Task task = new Task(title, description, order, isCritical);
        tasks.add(task);
        return task;
    }

    // Creator: Project creates Developer instances
    public Developer addDeveloper(String name, String title, String department) {
        Developer developer = new Developer(name, title, department);
        developers.add(developer);
        return developer;
    }
}