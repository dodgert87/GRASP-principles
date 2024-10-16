package org.example;

import org.example.DataAccess.DataAccess;
import org.example.DataAccess.FileDataAccess;
import org.example.PersistenceManager.PersistenceManager;
import org.example.Task.TaskManagerController;

public class Main {
    public static void main(String[] args) {
        // Protected Variations: Can switch between different data access implementations
        DataAccess dataAccess = new FileDataAccess();
        PersistenceManager persistenceManager = new PersistenceManager(dataAccess);

        TaskManagerController controller = new TaskManagerController(persistenceManager);
        controller.start();
    }
}