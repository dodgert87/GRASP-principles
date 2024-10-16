package org.example.PersistenceManager;

import org.example.DataAccess.DataAccess;
import org.example.Project.Project;

import java.util.List;

public class PersistenceManager {
    private DataAccess dataAccess;

    public PersistenceManager(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void saveProjects(List<Project> projects) {
        dataAccess.saveProjects(projects);
    }

    public List<Project> loadProjects() {
        return dataAccess.loadProjects();
    }
}
