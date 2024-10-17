package org.example.DataAccess;

import org.example.Project.Project;

import java.util.List;

public interface DataAccess {
    void saveProjects(List<Project> projects);
    List<Project> loadProjects();
}