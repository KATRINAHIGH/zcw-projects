# AnimalsPetsOwners
* **Objective:** To implement a `PetsOwner` which manipulates composite `Pet` objects.

## Pet
* Ensure each of the test cases in the class [Pet]() successfully passes upon completion of each of the method stubs in the class [PetTest]().
    * `Pet()`
    * `Pet(String)`
    * `Pet(int)`
    * `Pet(String, int)`
    * `String getName()`
    * `Integer getAge()`
    * `void setOwner(PetOwner owner)`
    * `PetOwner getOwner()` 




<br><br><br><br><br>

### Part 1; Defining instance variables
* To create a programmatic representation of a `Pet`, begin by declaring an instance variable for each of the following properties:
	* `String name`
		* a collection of characters, representative of a name.
	* `Integer age`
		* an integer, representative of an age in years.
	* `PetOwner owner`
		* the owner of this `Pet`.















<br><br><br><br><br>

### Part 2; Defining construction
* Define a `Pet` constructor whose parameters are used to initialize its instance variables.
* A `Pet` can be constructed in 4 ways.
    1. `Pet()`
        * Upon [nullary construction](https://en.wikipedia.org/wiki/Nullary_constructor), pet has `age` of 0 and `name` of "".    
    2. `Pet(String)`
        * Upon construction, `name` field should be set to respective parameter value, pet has default age of 0.
    3. `Pet(int)`
        * Upon construction, `age` field should be set to respective parameter value, pet has default name of "".
    4. `Pet(String, int)`
        * `name` and `age` variables should set to respective parameter values.















<br><br><br><br><br>

### Part 3; Defining methods

* **Getters and Setters**
	* Define a [getter and setter](https://en.wikipedia.org/wiki/Mutator_method#Java_example) for each of the instance variables declared in the `Pet` class.
        * `String getName()`
        * `Integer getAge()`
        * `void setOwner()`
        * `PetOwner getOwner()`



















<br><br><br><br><br>

### Part 4; Pet elucidation

* **Dog**
    * Ensure `Dog` supports all methods of pet construction.
    * The mechanism by which a `Dog` speaks is by barking; ensure a dog's `speak` method returns `bark` as a string.
    
* **Cat**
    * Ensure `Cat` supports all methods of pet construction.
    * The mechanism by which a `Cat` speaks is by meowing; ensure a cat's `speak` method returns `meow` as a string.
    
    
    

<br><br><br><br><br>
### Part 5; PetOwner
* Ensure each of the test cases in the class [PetOwner]() successfully passes upon completion of each of the method stubs in the class [PetOwner]().
    * `PetOwner(String name, Pet... pets)`
    * `void addPet(Pet pet)`
    * `void removePet(Pet pet)`
    * `Boolean isOwnerOf(Pet pet)`
    * `Integer getYoungetPetAge()`
    * `Integer getOldestPetAge()`
    * `Double getAveragePetAge()`
    * `Integer getNumberOfPets()`
    * `String getName()`
    * `Pet[] getPets()`