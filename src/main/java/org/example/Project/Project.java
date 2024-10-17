package org.example.Project;

import org.example.Task.LowPriorityTask;
import org.example.Task.Task;
import org.example.Developer.Developer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Project {
    private String name;
    private List<Task> tasks = new ArrayList<>();
    private List<Developer> developers = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    // Creator: Project creates Task instances
    public void createTask(String title, String description, int order, boolean isCritical) {
        Task task = new LowPriorityTask(title, description, order, isCritical);
        tasks.add(task);
    }

    // Creator: Project creates Developer instances
    public Developer addDeveloper(String name, String title, String department) {
        Developer developer = new Developer(name, title, department);
        developers.add(developer);
        return developer;
    }

    public Calendar getTasks() {
        return null;
    }

    // Other project-related methods...
}