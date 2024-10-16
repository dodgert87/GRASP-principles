package org.example.DataAccess;

import java.util.ArrayList;

public class DatabaseDataAccess implements DataAccess {
    // Implementation using a database
    @Override
    public void saveProjects(List<Project> projects) {
        // Save projects to database
    }

    @Override
    public List<Project> loadProjects() {
        // Load projects from database
        return new ArrayList<>();
    }
}