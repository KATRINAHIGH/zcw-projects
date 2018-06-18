# Holding Objects Lab:

Fork and clone this repository to complete your lab. Submit each part with a Pull Request for a separate branch.

## Unit Tests

You are expected to write unit tests for your code. Be sure to write the tests before implementing the functionality being tested. Tests must be thorough and address all possible paths through each method.

## Submission

Your completed lab must be submitted via GitHub. Labs are not complete unless they include UML diagrams of all implemented classes, as well as unit tests for all features.

## Instructions:

### Part I:

Create a PhoneBook class that holds names and phone numbers. You can use an associative data type (one which stores items as keys paired with values). (Hint: You should use a sorted map).

Your PhoneBook class should have the following method
  * lookup(String name) -  allows you to look up a person's phone number based on their name
  * add(String name, String phoneNumber) - add entry
  * remove(String name) - remove entry
  * display() - list all entries (names an phone numbers) in alphabetical order

    ```java
      PhoneBook phoneBook = new PhoneBook();
      phoneBook.add("Zebra", "111-222-333");
      phoneBook.add("Dog", "222-444-4444");
      phoneBook.display(); 
      
      /*
       Calling display this should print out the entries like this
       Dog 222-444-4444
       Zebra 111-222-333
      */
      
    ```

### Part II:

Add a `reverseLookup()` method to PhoneBook. This method should allow you to look up names by the phone number associated with them.

### Part III: 

Some people have more than one phone number. Refactor your PhoneBook class to map names to lists of phone numbers. You should modify your add() and remove() methods to handle adding or removing individual numbers, and create a removeRecord method for removing an entire entry from your PhoneBook.
