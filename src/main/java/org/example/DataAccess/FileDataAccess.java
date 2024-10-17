package org.example.DataAccess;

import org.example.Project.Project;

import java.util.ArrayList;
import java.util.List;

public class FileDataAccess implements DataAccess {
    // Implementation using file system
    @Override
    public void saveProjects(List<Project> projects) {
        // Save projects to file system
    }

    @Override
    public List<Project> loadProjects() {
        // Load projects from file system
        return new ArrayList<>();
    }
}