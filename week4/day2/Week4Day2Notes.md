### Today's Agenda:
       > 10:30 to 11:00 -> Constructor
       > 11:00 to 11:30 -> this
       > 11:30 to 11:45 -> Break
       > 11:45 to 12:15 -> static
       > 12:15 to 12:30 -> final


### Constructor :

#### Definition:
 - A constructor is a special type of method used to initialize newly created objects. 
 - It is called automatically at the time of object creation and can be used to set initial values for object attributes.

#### Types:
1. **Default Constructor**: 
   - Automatically provided by the compiler if no constructors are defined.
   - Initializes member variables to default values (0, null, false, etc.).
   - Has no parameters.

2. **Parameterized Constructor**:
   - Defined by the programmer.
   - Allows passing parameters to set initial values for object attributes.
   - Helps in creating objects with specific states.

#### Constructor Overloading:
   - Refers to defining multiple constructors within the same class with different parameters.
   - Enables creating objects in different ways, depending on the information available at object creation.

#### Constructor Chaining:
  - The process of calling one constructor from another constructor within the same class.
  - Achieved using `this()` .
  - `this()` is used for calling a constructor from another overloaded constructor in the same class.




### `static` Keyword

**Definition:**
- The `static` keyword in Java is used to indicate that a particular member (variable or method) belongs to a class, rather than to instances of the class. This means that the static member is shared among all instances of the class.

**Usage:**
- **Static Variables**: Also known as class variables, they are declared with the `static` modifier in a class, but outside a method, constructor, or a block. There is only one copy of a static variable per class, irrespective of how many objects are created from it.
- **Static Methods**: Similar to static variables, static methods also belong to the class instead of the object. They can be invoked without the need for creating an instance of the class.

**Purpose:**
- The primary purpose is to manage the memory. 
- It makes your program memory efficient (i.e., it saves memory).



### `final` Keyword

**Definition:**
- The `final` keyword in Java is used to apply restrictions on classes, methods, and variables. A final class cannot be subclassed, a final method cannot be overridden, and a final variable’s value cannot be changed once it is assigned.

**Usage:**
- **Final Variables**: When a variable is declared with the final keyword, its value can’t be modified, essentially making it a constant. This can be a primitive data type or an object reference.
- **Final Methods**: When a method is declared final, it cannot be overridden by inheriting classes.
- **Final Classes**: When a class is declared final, it cannot be subclassed. This is often done for reasons of security and efficiency.

**Purpose:**
- Ensuring security: By preventing methods from being overridden or classes from being inherited, the final keyword can be used to ensure that a certain implementation remains unchanged.
- Design immutability: The final keyword is crucial for the creation of immutable objects in Java which is a popular practice in multithreading environments for thread safety.


### `this` Keyword

**Definition:**
- `this` is a reference variable in Java that refers to the current object, the object whose method or constructor is being called.

**Usage:**
- **Referencing Instance Variables**: `this` is used to refer to the current class instance variable. This is particularly useful in situations where method parameters or local variables have the same name as instance variables.
- **Invoking Instance Methods**: `this` can be used to invoke current class methods (implicitly).
- **Returning the Current Class Instance**: `this` can be used to return the current class instance.
- **Passing as an Argument in Method Call or Constructor**: It can be passed as an argument in the method call or constructors.
- **Constructor Chaining**: Within a constructor, `this` can be used to invoke another constructor in the same class.

**Purpose:**
- Helps in eliminating the confusion between class attributes and parameters with the same names, by using `this` keyword to refer to the class instance variable.
- Enhances the readability of the code and makes it easier to understand and maintain.





### Explicit Wait 

#### Definition:
  - Explicit Wait in Selenium is a concept used to wait for a certain condition to occur before proceeding further in the code. 
  - Unlike Implicit Wait, which sets a universal waiting period, Explicit Wait is applied for a specific element or condition and waits for a specified maximum time.

#### Usage:
 - Waits for a specific condition to be met, such as the visibility of an element or the element being clickable, etc.

#### Syntax:
 - The syntax for Explicit Wait in Selenium-Java involves creating an instance of `WebDriverWait` and using it with an `ExpectedCondition`.

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
wait.until(ExpectedConditions.visiblityOf(element));
```
#### ExpectedConditions:
Some commonly used `ExpectedConditions` are:
- `elementToBeClickable`: Waits until an element is clickable.
- `visibilityOfElementLocated`: Waits for an element to be visible on the page.
- `presenceOfElementLocated`: Waits for an element to be present on the DOM.
- `alertIsPresent`: Waits for an alert to be present.

#### Timeout Exception:
 - By default, Selenium polls (checks) for the condition every 500 milliseconds.
 - If the condition specified in the Explicit Wait is not met within the timeout period, a `TimeoutException` is thrown. 
 - This exception indicates that the element was not found or the condition was not met in the given time.
