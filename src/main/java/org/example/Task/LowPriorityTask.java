package org.example.Task;

public class LowPriorityTask extends Task {

    public LowPriorityTask(String title, String description, int order) {
        super(title, description, order);
    }

    @Override
    public String getPriority() {
        return "Low Priority";
    }
}