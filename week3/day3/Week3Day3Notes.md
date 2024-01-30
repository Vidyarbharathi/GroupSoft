### Today's Agenda:
      
      > 10:30 to 11:15 -> Encapsulation
      > 11:15 to 11:30 -> Activity
      > 11:30 to 11:45 -> Live quiz
      > 11:45 to 12:30 -> List

### Encapsulation
1. **Definition:**
    - Encapsulation is a core concept in object-oriented programming (OOP) that involves bundling the data (variables) and the code (methods) that manipulates the data into a single unit, known as a class.
    - It restricts direct access to some of an object's components, which is a means of preventing direct interaction with and manipulation of internal data.
    - By doing this, encapsulation protects the integrity of the data and the functionality of the object.

2. **Benefits of Encapsulation:**
   - **Data Hiding:** Encapsulation allows sensitive data to be hidden from users. By making the variables of a class private, unauthorized access and modifications are prevented.
   - **Increased Flexibility and Maintenance:** With encapsulation, you can change one part of the code without affecting other parts. It allows the developer to implement/revise an implementation without affecting other parts of the code.
   - **Control of Data and Validation:** Encapsulation allows control over the data by using setter methods. This means data can be validated before being set, thus preventing incorrect or harmful data manipulation.

3. **Getter and Setter Methods:**
   - **What Are They?** Getter and setter are methods used to retrieve and modify the value of a private variable, respectively. They are part of the public interface of a class and allow controlled access to its private fields.
   - **Why Are They Used?** They are used to provide controlled access to private variables. A getter method returns the value of a private field, and a setter method sets or updates its value. This controlled access allows adding validation, logging, or other logic when data is accessed or modified.

4. **Differences between Public and Private Access Modifiers:**
   - **Public Access Modifier:** When a class member (variable or method) is declared as public, it can be accessed from any other class. It means that the member is exposed to all other classes for direct use.
   - **Private Access Modifier:** When a class member is declared as private, it can only be accessed within its own class. It is not visible or accessible from any other class, which is key to encapsulation. It ensures that the internal representation of the object is hidden from outside view. 




### Encapsulation Assessment
**Practical Coding Task**
   - Create a class named `Student`.
   - The class should have at least two private variables (e.g., `name` and `age`).
   - Provide getter and setter methods for each private variable.
   - Ensure that the setter methods include validation (e.g., `age` should not be negative).
   - Write a `main` method to create an instance of the `Student` class.
   - Set values to the instance using the setter methods.
   - Retrieve and print the values using the getter methods.
   - Demonstrate validation by attempting to set an invalid value.



### List Interface in Java

- **Definition**: The `List` interface in Java is part of the Java Collections Framework. It represents an ordered collection (also known as a sequence). Lists can contain duplicate elements and are dynamic in size, meaning they can grow or shrink as needed.
- **Why Use Lists**: Lists are used when you need an ordered collection that can change in size. This is particularly useful when you don't know the number of elements in advance, or when you need to perform frequent insertions and deletions.
- **ArrayList vs LinkedList**: While `ArrayList` is the most common implementation, providing fast access and efficient storage for large numbers of elements, `LinkedList` can be more efficient for certain use cases, especially where frequent insertion and deletion occur.

### Methods and Use Cases
1. **Creating Lists (`new ArrayList<>()`):**
   - **Usage:** To initialize a list.
   - **Real-time Use Case:** In a real-world scenario, you might initialize a list to store data such as employee names, product details, or any collection of similar items. For example, a list to store the names of participants in a workshop.

2. **Adding Items (`add()` method):**
   - **Usage:** To add elements to the list.
   - **Real-time Use Case:** This is used when you need to add new data to your collection. For example, adding new members to a project team or new items to a to-do list.

3. **Inserting at Specific Index (`add(index, element)`):**
   - **Usage:** To add an element at a specified position in the list.
   - **Real-time Use Case:** Useful in cases where the order is important, like adding a new task at a specific position in a task list or inserting a new chapter into a specific position in a book's table of contents.

4. **Printing the List (`System.out.println(list)`):**
   - **Usage:** To display the contents of the list.
   - **Real-time Use Case:** Displaying a list of items, such as a list of available products to a user, or printing a list of registered participants for an event.

5. **Adding All Elements from Another List (`addAll()`):**
   - **Usage:** To add all elements from one list into another.
   - **Real-time Use Case:** Merging two datasets, such as combining two lists of customers from different regions into a single list for a unified analysis.

6. **Finding the Size of the List (`size()` method):**
   - **Usage:** To get the number of elements in the list.
   - **Real-time Use Case:** Checking the number of entries in a database, like the number of students enrolled in a course or the number of items in stock.

7. **Accessing Elements (`get(index)`):**
   - **Usage:** To retrieve a specific element from the list based on its index.
   - **Real-time Use Case:** Fetching a specific data entry, such as retrieving a specific order detail from a list of orders.

8. **Removing Elements (`remove(index)` and `removeAll()`):**
   - **Usage:** `remove(index)` removes an element at a specific index, while `removeAll()` removes all elements that are present in another collection.
   - **Real-time Use Case:** `remove(index)` can be used for deleting a specific entry, like removing a discontinued product from a product list. `removeAll()` can be useful in filtering out data, like removing all outdated items from a current inventory list.

9. **Clearing the List (`clear()`):**
   - **Usage:** To remove all elements from the list, making it empty.
   - **Real-time Use Case:** Resetting data, such as clearing a user's shopping cart after they have completed the checkout process.

  
   