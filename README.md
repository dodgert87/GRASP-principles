# GRASP Principle: Polymorphism

## Definition:

The **Polymorphism** principle suggests that behavior should vary based on type, and this variation should be handled using polymorphic methods. This allows for dynamic method dispatch where different types of objects can be treated uniformly, but they can behave differently based on their actual class.

## Explanation:

Polymorphism allows objects of different classes to be treated as instances of a common superclass. This helps in reducing conditionals and enhances flexibility by allowing subclasses to provide specific implementations of methods while sharing a common interface or abstract class.

## Example:

In our **Task Management System**, we may have different types of tasks, such as `CriticalTask` and `NormalTask`. Both types of tasks share common attributes and behaviors but may have some specific logic or attributes unique to their type. By using polymorphism, we can treat all tasks as instances of a common `Task` class while allowing `CriticalTask` and `NormalTask` to implement their specific functionality.

Here’s how the **Polymorphism** principle is applied:

```java
public abstract class TaskTag {
    // Common attributes and methods
}

public class CriticalTask extends TaskTag {
    // Specific implementation for critical tasks
}

public class NormalTask extends TaskTag {
    // Specific implementation for normal tasks
}

You can find the Class file in **src/main/java/org/example/Task** 
