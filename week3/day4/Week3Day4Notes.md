### Today's Agenda:
   
    > 10:30 to 10:45 -> List Recap
    > 10:45 to 11:00 -> List - Problem solving
    > 11:00 to 11:15 -> Activity
    > 11:15 to 11:30 -> Problem solving
    > 11:30 to 12:15 -> Set
    > 12:15 to 12:30 -> Activity

### Assessment
1. Load Amazon.in
2. Search for mobiles in the search bar
    driver.findElement(By.id("")).sendKeys("mobiles",keys.Enter);
3. Print all the mobile prices from the resulting webpage
       List<WebElement> prices= driver.findElements(By.xpath("//span[@class='a-price-whole']"));


### Collection: `Set`

#### Definition:
 - The `Set` interface in Java is a part of the Java Collections Framework. 
 - It represents a collection that cannot contain duplicate elements. 

#### Properties of `Set`:
1. **No Duplicate Elements**: Ensures that each element in the `Set` is unique.
2. **Unordered Collection**: Except for some specific implementations like `LinkedHashSet` or `TreeSet`, the `Set` does not guarantee the order of its elements.

#### Implementation Classes:
1. **HashSet**:
   - Maintains a random order
2. **LinkedHashSet**:
   - Maintains insertion order of elements. 
3. **TreeSet**:
   - Maintains sorted order 

#### Why There is No `get()` in `Set`:
The `Set` interface does not have a `get()` method, and this is by design, due to the following reasons:
1. **Uniqueness Over Indexing**: The `Set` is designed to ensure uniqueness rather than maintain an index-based system like `List`. Elements in a `Set` are not accessed by an index.
2. **Undefined Ordering**: In most implementations of `Set`, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.











   
      