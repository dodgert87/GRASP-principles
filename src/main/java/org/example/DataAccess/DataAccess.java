package org.example.DataAccess;

public interface DataAccess {
    void saveProjects(List<Project> projects);
    List<Project> loadProjects();
}
