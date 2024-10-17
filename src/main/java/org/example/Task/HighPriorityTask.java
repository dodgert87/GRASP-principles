package org.example.Task;


public class HighPriorityTask extends Task {

    public HighPriorityTask(String title, String description, int order, boolean isCritical) {
        super(title, description, order);
    }

    @Override
    public String getPriority() {
        return "High Priority";
    }
}