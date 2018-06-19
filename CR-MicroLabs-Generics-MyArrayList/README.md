# Generics Lab

Fork this repository and commit your code to your fork. You should have many commits, not just one for the whole project. Submit your code with a pull request.

## Description

In this lab you'll practice using generics in Java to implement your own versions of ArrayList, Set, and Map from scratch.

## Requirements

As always, you are required to produce UML and unit tests as well as your code to solve these problems. You should be following proper test driven development practices and have UML that outlines your planned implementation *before* you implement the code.

## Instructions

### Part 1:

Implement your own version of an ArrayList (we'll call it MyArrayList), with the following features:

- MyArrayList must be a generic type, which can store any other type of object
- MyArrayList must not use List, ArrayList or any other collection type in its implementation, only Arrays (The purpose of this is to practice designing your own generic class from the ground up, so that you can appreciate their complexities and usefulness)
- MyArrayList must have `add()`, `get()`, `remove()`, `set()`, `clear()`, `isEmpty()`, `contains()` and other methods to provide the same basic functionality described in the [ArrayList documentation](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)
- `add()` should be overridden to add an element to the end of the Array, or to add the element to a specified index in the array.
- MyArrayList must have a no-argument constructor (`MyArrayList()`) to initialize a new instance, it should also have a one-argument constructor (`MyArrayList(int)`) that takes an int and starts the list off at the specified size.
- MyArrayList should automatically resize and maintain its order.

### Part 2:

Implement your own version of a Set (let's call it MySet ... seeing a pattern here?), with the following features:

- MySet must be a generic type, which can store any other type of object
- An instance of MySet must contain no duplicates
- MySet must not use List, ArrayList, or any other built-in collection types in its implementation. You may use Arrays, and you may use your implementation of MyArrayList (if it helps -- you don't have to use it)
- MySet must have all of the methods listed on the [Java Set documentation](https://docs.oracle.com/javase/7/docs/api/java/util/Set.html)

### Part 3 (Challenge):

Implement your own version of a Map (MyMap) as a generic type that can map any key type to any value type.

MyMap should implement all of the methods and behavior described in the [Java Map documentation](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html).
