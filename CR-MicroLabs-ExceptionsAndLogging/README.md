
# ZCW-MicroLabs-ExceptionsAndLogging


# PhoneNumberFactory
* **Purpose** - to demonstrate basic exception handling and logging.
* **Objective** - to implement a `PhoneNumberFactory` class that generates `PhoneNumber` objects.
* The `PhoneNumber` class is a container for a `String` representation of a respective phone number.
* Note: Phone numbers are a composite of 3 affixes; `Area Code`, `Central Office Code`, and `Phone Line Code`.
	* `Area Code`  - the first 3 numeric values
	* `Central Office Code` - the 4th, 5th, and 6th numeric values.
	* `Phone Line Code` - the last 4 numeric values. 

* Below is a sample *instantation of* and *invokation on* `PhoneNumber`.
	
```Java
String stringRepresentation = "(302)-312-5555";
PhoneNumber phoneNumber = new PhoneNumber(stringRepresentation);
String areaCode = phoneNumber.getAreaCode();
String centralOfficeCode = phoneNumber.getCentralOfficeCode();
String phoneLineCode = phoneNumber.getPhoneLineCode();
```


# Part 1; Modify `createPhoneNumber`
* Upon instantiating a new `PhoneNumber` object, it is possible to receive a `InvalidPhoneNumberFormatException` if the `String` passed into the `PhoneNumber` constructor does not fit the format `(###)-###-####`.<br>
* `InvalidPhoneNumberFormatException` extends `IOException`, which is a `checked exception`.<br>
* Modify the `createPhoneNumber` method so that it throws any resulting `InvalidPhoneNumberFormatException`.
	* This will ensure that any method calling `createPhoneNumber` will have to handle the exception.



# Part 2; Implement `createPhoneNumberSafely`
* Using the `createPhoneNumber` method from `Part 1`, define the `createPhoneNumberSafely` method such that the input parameters, `areaCode`, `centralOfficeCode`, `phoneLineCode` are concatenated to create a `String` representation of the respective phone number.
* Use this `String` object to construct a new instance of `PhoneNumber` and return it.
* If the concatentation of the input parameters yields a `String` whose value does not match the format `(###)-###-####`, then our `PhoneNumber` will throw a `InvalidPhoneNumberFormatException`.
* If a `InvalidPhoneNumberFormatException` is thrown within this method, catch it and return `null`.


# Part 3; Implement `createRandomPhoneNumber`
* Using the `RandomNumberFactory`, generate a random `Area Code`, `Central Office Code`, and `Phone Line Code`. Pass these values as arguments of the `createPhoneNumberSafely` method from `Part 2` and return the resulting `PhoneNumber` object.


# Part 4; Implement `createRandomPhoneNumberArray`
* Using the `createRandomPhoneNumber` from `Part 3`, generate an array of `PhoneNumber` objects, whose length reflects the input argument.
	* For example `createRandomPhoneNumber(5)` should return an array of 5 `PhoneNumber` objects.


# Part 5; Add logging
* Add logging to the `createPhoneNumber` method from `Part 1`, which logs the message
	* `"Attempting to create a new PhoneNumber object with a value of (###)-###-####`
	* where `(###)-###-####` will be replaced with the respective input parameter.

* Add logging to the `createPhoneNumberSafely` method from `Part 2`, which logs the message
	* `(###)-###-#### is not a valid phone number`
	* Where `(###)-###-####` will be replaced with the respective input parameter.

	
# Part 6; Ensure all test cases pass
* Yeah this header says all that is needed...
