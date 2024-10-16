# GRASP Principle: Pure Fabrication

## Definition:

The **Pure Fabrication** principle assigns a highly cohesive set of responsibilities to a class that does not represent a concept from the problem domain. This artificial class exists solely to support the design of the system, often improving modularity, reuse, or the separation of concerns.

## Explanation:

Sometimes, creating a class that doesn’t directly represent a problem domain entity can help reduce coupling or increase cohesion. Such a class, called a **Pure Fabrication**, is a design pattern that groups responsibilities into one place for reasons like maintaining low coupling or facilitating reuse. This class is not a representation of any real-world concept in the domain, but it is essential for the system’s architecture.

## Example:

In our **Task Management System**, the `PersistenceManager` class is a **Pure Fabrication**. It is responsible for handling the saving and loading of data, but it is not part of the core domain model (projects, tasks, developers). It is created solely to manage persistence and keep the domain classes focused on their responsibilities without being burdened by data storage logic.

Here’s how the **Pure Fabrication** principle is applied:

```java
public class PersistenceManager {
    // Pure Fabrication: Handles saving and loading data

    // Methods for file operations or database interactions
   
}


You can find the Class file in **src/main/java/org/example/Task** 
