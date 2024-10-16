# GRASP Principle: Step-by-Step Implementation Plan

## Step 1: Define the Domain Models

### Task

- **Attributes**:
  - `int order`
  - `String title`
  - `String description`
  - `boolean isCritical`
  - `boolean isFinished`
  - `Developer holder`

- **Methods**:
  - `markAsFinished()`: Marks the task as finished.
  - `markAsOpen()`: Marks the task as open.
  - Getters and setters for all attributes.

### Developer

- **Attributes**:
  - `String name`
  - `String title`
  - `String department`
  - `List<Task> tasks`

- **Methods**:
  - `assignTask(Task task)`: Assigns a task to the developer.
  - `getTasks()`: Returns the list of tasks assigned to the developer.
  - Getters and setters for all attributes.

### Project

- **Attributes**:
  - `String name`
  - `List<Task> tasks`
  - `List<Developer> developers`

- **Methods**:
  - `createTask(...)`: Creates and adds a new task to the project.
  - `addDeveloper(...)`: Adds a developer to the project.
  - Getters and setters for all attributes.

---

## Step 2: Implement the Controller

### TaskManagerController

This controller manages user input and coordinates actions between the domain models (Project, Task, Developer) and services.

- **Methods**:
  - `start()`: The main method to run the application, handles user input in a loop.
  - `listProjects()`: Lists all available projects.
  - `selectProject()`: Selects a project for further management.
  - `manageTasks()`: Manages tasks within a selected project.
  - `manageDevelopers()`: Manages developers within a selected project.

---

## Step 3: Create Service Classes

### TaskService

The service class for handling task-related business logic.

- **Methods**:
  - `addTaskToProject(Project project, ...)`: Adds a task to a project.
  - `deleteTask(Project project, Task task)`: Deletes a task from a project.
  - `updateTaskStatus(Task task, boolean isFinished)`: Updates the task status (open or finished).

### DeveloperService

The service class for handling developer-related business logic.

- **Methods**:
  - `addDeveloperToProject(Project project, Developer developer)`: Adds a developer to a project.
  - `assignTaskToDeveloper(Developer developer, Task task)`: Assigns a task to a developer.

---

## Step 4: Implement Persistence with Protected Variations

### DataAccess Interface

Defines a stable interface for data operations that can be implemented with different storage mechanisms (file system or database).

- **Methods**:
  - `saveProjects(List<Project> projects)`: Saves a list of projects.
  - `List<Project> loadProjects()`: Loads a list of projects.

### FileDataAccess and DatabaseDataAccess

Concrete implementations of the `DataAccess` interface.

- **FileDataAccess**: Implements data storage using the file system.
- **DatabaseDataAccess**: Implements data storage using a database.

### PersistenceManager

This class uses `DataAccess` to save and load data. It abstracts away the specific implementation, allowing for flexibility in storage mechanisms.

---

## Step 5: Use Polymorphism Where Appropriate

- Define abstract classes or interfaces if you introduce different types of tasks (e.g., `CriticalTask`, `NormalTask`) or developers (e.g., `FullTimeDeveloper`, `FreelancerDeveloper`) in the future.
- This ensures flexibility and reduces code duplication.

---

## Step 6: Assemble the Application

- Write the `main` method to instantiate the `TaskManagerController` and call `start()` to launch the application.
- Ensure the services and persistence components are properly initialized and injected into the controller.
