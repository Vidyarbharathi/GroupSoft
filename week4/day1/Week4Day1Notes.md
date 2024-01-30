### Today's Agenda
     > 10:30 to 11:45 -> Map
     > 11:45 to 12:00 -> Activity
     > 12:00 to 12:30 -> Constructor

# Map:

1. **Map Interface**: 
    - `Map` is an interface and cannot be instantiated. Instead, you can use one of its implementations like  - - `HashMap`, `TreeMap`, or `LinkedHashMap`.

2. **Key-Value Pair**: 
    - Each entry in a `Map` contains a key and a corresponding value. Each key can map to at most one value.

3. **Implementations**:
   - **HashMap**: It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. The data is not ordered, and it does not guarantee any specific order of the entries.
   - **TreeMap**: It is a map implementation that keeps its entries sorted.
   - **LinkedHashMap**: It maintains the insertion order of the elements.

4. **Methods**:
   - `put(key, value)`: Inserts the specified value with the specified key in the map.
   - `get(key)`: Returns the value to which the specified key is mapped.
   - `remove(key)`: Removes the mapping for a key from this map if it is present.
   - `containsKey(key)`: Returns `true` if this map contains a mapping for the specified key.
   - `keySet()`: Returns a `Set`  of the keys contained in this map.
   - `values()`: Returns a `Collection`  of the values contained in this map.
   - `entrySet()`: Returns a `Set`  of the mappings contained in this map.


    