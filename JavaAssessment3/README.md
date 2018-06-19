# Assessment 3

## Preface
During this exam you are to parse the supplied json in the resources folder using Gson. You will need to research Gson yourself and implement it in order to get the tests in the exam passing.

For the User Management section you will be using JBCrypt to hash passwords and verify a password is correct against a user. Encryption is a new topic for you. There will be some details on what the exam is specifically looking for in this regard, but you will be expected to research bcrypt and password hashing to finish the user_management section. 

You may work on either section, however the Parsing Json section is recommended as the first part you complete as the topics in it will be used in more detail in User Management 

## Section 1 - Parsing Json

#### Directions:
under the package `parsing_json` there should be the following classes

1. Element
	* a simple POJO
2. ElementCollection
	* A Collection class for storing Elements
3. ElementCollectionInitializer
	* A class to generate an ElementCollection

##### Element
The Element class should be a POJO that only implements getters. You should refer to the json to see what the attribute types should be. for decimal places, use double and avoid using float.

##### ElementCollection
The Element collection should extend ArrayList<Element> and implement 3 methods. 

findByAtomicNumber will take an argument `int atomicNumber` and return the Element with number `atomicNumber`

findByName will take an argument `String name` and return the Element with name `name`

where will take arguments `String field` and `Object value`. If Element has an attribute with the name `field` then the method will go through each Element in the collection and return a new ElementCollection with all Elements who's field matches the Object value. If no attribute is called `field` then the method should simply return an empty ElementCollection.

##### ElementCollectionInitializer
The ElementCollectionInitializer class should implement a generate method that will load the json from the file `periodic_table.json` into an ElementCollection and return that ElementCollection.

## Section 2 - User Magement

#### Directions:
under the user_management section there should be 2 packages and 9 classes (6 of which are in the two packages)

1. User
	* a simple Pojo
2. UserCollection
	* A Collection class for storing Users
3. UserCollectionInitializer
	* A class to generate a UserCollection
4. security.Authenticator
	* A class to authenticate users against a password
5. security.Pasword
	* A class for securly storing passwords using JBcrypt
6. security.UserAuthenticationFailedException
7. validation.EmailNotAvailableException
8. validation.InvalidEmailException
9. validation.PasswordTooSimpleException

##### User
User is a POJO that implements all getters and setters. Refer to the json to see what attributes this will need. User should implement setPassword to be able to take either a String or a user_management.security.Password object. User should also implement two constructors. One constructor should take all the attributes as normal, and the other should take the same arguments except it should take password as a String. The constructor that takes password as a string should create a new Password object and set the user's password to that object.

User should override the toString method. This should return the user's name and email in this format `name - email`.

You will also need to override the equals(Object obj) method. This is because a password salt + hash is unlikely to happen twice so to see two passwords be the same you would have to see they both come from the same input. Because of this, we will assume that two users are equal if their names, emails, and ids are the same. This will simplify our lives and tests.

##### UserCollection
UserCollection should extend ArrayList<User> and implement 4 methods. `findById` and `findByEmail` should work the same way as `Element. findByAtomicNumber` and `Element.findByName`.

attemptLogin will take arguments `String email` and `String password` attempt to find the user and then see if their password matches the stored password (remember this is going to be a hashed password so you will have to check that the password matches the hash and the plain text password). If the user does not exist or their password does not match the hash, then the method should throw a security.UserAuthenticationFailedException. If the user is found and the password matches the hash, the method should return the user.

createUser will take the arguments `String name`, `String email`, and  `String password`. The following exceptions should be thrown in the cases listed under them

* validation.EmailNotAvailableException
	* The supplied email is taken by another user
* validation.InvalidEmailException
	* The email provided doesn't have a name
	* The email provided doesn't have a domain
	* The email provided doesn't have a tld
	* The email name contains non-word characters
	* The email domain contains non-word characters
* validation.PasswordTooSimpleException
	* The password provided has less than 8 characters
	* The password provided has no upper case letters
	* The password provided has no lower case letters
	* The password provided has no numbers
	* The password provided has none of the following characters: `!@#$%^&*()<>?`

If none of those exceptions are thrown, the method should find the next available id (all ids must be unique) and create a user with that id along with the supplied name email and password.

##### UserCollectionInitializer
UserCollectionInitializer should work the same as ElementCollectionInitializer but it should use the users.json file instead.

##### security.Authenticator
Authenticator should have one static method `authenticate`. This method will take arguments `User user` and `String passwordToCheck` then return a boolean. If the password matches the user's password, then return true, else return false.

##### security.Pasword
Password is a class that will hold hash passwords. This class should not under any circumstances store a password as plain text. Since we haven't gone over encryption yet, for this exam we are going to supply some psuedo code in the form of comments. Check the class itself for this. 

Bcrypt has a default workload of 12, so we are going to set a static value called workload and set that to 12. Password should also have a `String hash`

There should be one constructor that will take a `String password`, hash that password and store it in hash. 

hashPassword should be a static method that takes the arguemnt `String password_plaintext` returns a String. The method should create a new salt for this password, then hash the password using the generated salt. 

mathces should take an argument `String password_plaintext` and check that that password matches the hash.

getHash should return the hash. 

NOTE: DO NOT IMPLEMENT `setHash()`. If a user changes their password, their password should be replaced with a new Password. All hashes should be generated and never hard coded in.

##### Exceptions
There is no message the exceptions must return by default, but making the exceptions return nice messages with details on why your code failed will only help you work through these tests.