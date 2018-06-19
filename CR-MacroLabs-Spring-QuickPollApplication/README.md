# Poll Application
* **Purpose**
	* to demonstrate the basic functionality of the [Spring Framework](https://spring.io/)
	* to demonstrate API testing via [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en)

# Part 1 - Domain Implementation

* _Domain objects_ are the backbone for an application and contain the [business logic](https://en.wikipedia.org/wiki/Business_logic).
* Create a sub package of `io.zipcoder.tc_spring_poll_application` named `domain`.


## Part 1.1 - Create class `Option`

* Create an `Option` class in the `domain` sub-package.
* `Option` class signature is annotated with `@Entity`
* `Option` has an `id` instance variable of type `Long`
	* `id` should be `annotated` with
		* `@Id`
			* denotes primary key of this entity
		* `@GeneratedValue`
			* configures the way of increment of the specified `column(field)`
		* `@Column(name = "OPTION_ID")`
			* specifies mapped column for a persistent property or field
			* without `@Column` specified, the framework assumes the field's variable-name is the persistent property name.

* `Option` has a `value` instance variable of type `String`
	* `value` should be `annotated` with
		* `@Column(name = "OPTION_VALUE")`

* Create a `getter` and `setter` for each of the respective instance variables.


## Part 1.2 - Create class `Poll`

* Create a `Poll` class in the `domain` sub-package.
* `Poll` class signature is annotated with `@Entity`
* `Poll` has an `id` instance variable of type `Long`
	* `id` should be `annotated` with
		* `@Id`
		* `@GeneratedValue`
		* `Column(name = "POLL_ID")`

* `Poll` has a `question` instance variable of type `String`
	* `question` should be `annotated` with
		* `@Column(name = "QUESTION")`

* `Poll` has an `options` instance variable of type `Set` of `Option`
	* `options` should be `annotated` with
		* `@OneToMany(cascade = CascadeType.ALL)`
		* `@JoinColumn(name = "POLL_ID")`
		* `@OrderBy`

* Create a `getter` and `setter` for each of the respective instance variables.


## Part 1.3 - Create class `Vote`

* Create a `Vote` class in the `domain` sub-package.
* `Vote` class signature is annotated with `@Entity`
* `Vote` has an `id` instance variable of type `Long`
	* `id` should be `annotated` with
		* `@Id`
		* `@GeneratedValue`
		* `Column(name = "VOTE_ID")`

* `Vote` has a `option` instance variable of type `Option`
	* `option` should be `annotated` with
		* `@ManyToOne`
		* `@JoinColumn(name = "OPTION_ID")`

* Create a `getter` and `setter` for each of the respective instance variables.


# Part 2 - Repository Implementation

* _Repositories_ or [Data Access Objects (DAO)](https://en.wikipedia.org/wiki/Data_access_object), provide an abstraction for interacting with _datastores_.
* Typically DAOs include an interface that provides a set of finder methods such as `findById`, `findAll`, for retrieving data, and methods to persist and delete data.
* It is customary to have one `Repository` per `domain` object.
* Create a sub-package of `io.zipcoder.tc_spring_poll_application` named `repositories`.


## Part 2.1 - Create interface `OptionRepository`

* Create an `OptionRepository` interface in the `repositories` subpackage.
* `OptionRepository` is a subclass of `CrudRepository<Option, Long>`


## Part 2.2 - Create interface `PollRepository`

* Create a `PollRepository` interface in the `repositories` subpackage.
* `PollRepository` is a subclass of `CrudRepository<Poll, Long>`


## Part 2.3 - Create interface `VoteRepository`

* Create a `VoteRepository` interface in the `repositories` subpackage.
* `VoteRepository` is a subclass of `CrudRepository<Vote, Long>`

# Part 3 - Controller Implementation

* _Controllers_ provides all of the necessary [endpoints](https://en.wikipedia.org/wiki/Web_API#Endpoints) to access and manipulate respective domain objects.
	*  REST resources are identified using URI endpoints.
* Create a sub package of `io.zipcoder.tc_spring_poll_application` named `controller`.


## Part 3.1 - Create class `PollController`

* Create a `PollController` class in the `controller` sub package.
	* `PollController` signature should be `annotated` with `@RestController`

* `PollController` has a `pollRepository` instance variable of type `PollRepository`
	* `pollRepository` should be `annotated` with `@Inject`


### Part 3.1.1 - Create `GET` request method

* The method definition below supplies a `GET` request on the `/polls` endpoint which provides a collection of all of the polls available in the QuickPolls application. Copy and paste this into your `PollController` class.

```java
@RequestMapping(value="/polls", method= RequestMethod.GET)
public ResponseEntity<Iterable<Poll>> getAllPolls() {
    Iterable<Poll> allPolls = pollRepository.findAll();
    return new ResponseEntity<>(allPolls, HttpStatus.OK);
}
```

* The method above begins with reading all of the polls using the `PollRepository`.
* We then create an instance of `ResponseEntity` and pass in `Poll` data and the `HttpStatus.OK` status value.
* The `Poll` data becomes part of the response body and `OK` (code 200) becomes the response status code.



### Part 3.1.2 - Testing via Postman

* Ensure that the `start-class` tag in your `pom.xml` encapsulates `io.zipcoder.springdemo.QuickPollApplication`
* Open a command line and navigate to the project's root directory and run this command:
	* `mvn spring-boot:run`
* Launch the [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) app and enter the URI `http://localhost:8080/polls` and hit Send.
* Because we don’t have any polls created yet, this command should result in an empty collection.
* If your application cannot run because something is occupying a port, use this command with the respective port number specified:
	* ``kill -kill `lsof -t -i tcp:8080` ``



### Part 3.1.3 - Create `POST` request method

* We accomplish the capability to add new polls to the `PollController` by implementing the `POST` verb functionality in a `createPoll` method:

```java
@RequestMapping(value="/polls", method=RequestMethod.POST)
public ResponseEntity<?> createPoll(@RequestBody Poll poll) {
        poll = pollRepository.save(poll);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
}
```

* Take note that the method
	* has a parameter of type `@RequestBody Poll poll`
		* `@RequestBody` tells Spring that the entire request body needs to be converted to an instance of Poll
	* delegates the `Poll` persistence to `PollRepository`’s save method
		* `poll = pollRepository.save(poll);`



### Part 3.1.4 - Modify `createPoll`

* Best practice is to convey the URI to the newly created resource using the Location HTTP header via Spring's `ServletUriComponentsBuilder` utility class. This will ensure that the client has some way of knowing the URI of the newly created Poll.

```java
URI newPollUri = ServletUriComponentsBuilder
	.fromCurrentRequest()
	.path("/{id}")
	.buildAndExpand(poll.getId())
	.toUri();
```

* Modify the `createPoll` method so that it returns a `ResponseEntity` which takes an argument of a `new HttpHeaders()` whose _location_ has been _set_ to the above `newPollUri` via the `setLocation` method.



### Part 3.1.5 - Create `GET` request method

* The code snippet below enables us to access an individual poll.
* The _value attribute_ in the `@RequestMapping` takes a URI template `/polls/{pollId}`.
* The placeholder `{pollId}` along with `@PathVarible` annotation allows Spring to examine the request URI path and extract the `pollId` parameter value.
* Inside the method, we use the `PollRepository`’s `findOne` finder method to read the poll and pass it as part of a `ResponseEntity`.

```java
@RequestMapping(value="/polls/{pollId}", method=RequestMethod.GET)
public ResponseEntity<?> getPoll(@PathVariable Long pollId) {
	Poll p = pollRepository.findOne(pollId);
	return new ResponseEntity<> (p, HttpStatus.OK);
}
```


### Part 3.1.6 - Create `UPDATE` request method

* The code snippet below enables us to update a poll.

```java
@RequestMapping(value="/polls/{pollId}", method=RequestMethod.PUT)
public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
        // Save the entity
        Poll p = pollRepository.save(poll);
        return new ResponseEntity<>(HttpStatus.OK);
}
```


### Part 3.1.7 - Create `DELETE` request method.

* The code snippet below enables us to delete a poll.

```java
@RequestMapping(value="/polls/{pollId}", method=RequestMethod.DELETE)
public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        pollRepository.delete(pollId);
        return new ResponseEntity<>(HttpStatus.OK);
}
```


### Part 3.1.8 - Test Poll Creating Capabilities

* Restart the QuickPoll application.
* Use Postman to execute a `POST` to `http://localhost:8080/polls/` whose request body is the `JSON` object below.
* You can modify the request body in Postman by navigating to the `Body` tab, selecting the `raw` radio button, and selecting the `JSON` option from the text format dropdown.

```JSON
{
	"id": 1,
	"question": "What's the best netflix original?",
	"options": [
	    { "value": "Black Mirror" },
	    { "value": "Stranger Things" },
	    { "value": "Orange is the New Black"},
	    { "value": "The Get Down" }
	]
}
```
* Ensure the the data has been persisted by executing a `GET` to `http://localhost:8080/polls/1`
* Upon execution, you should receive this message body.

```json
{
    "id": 1,
    "question": "What's the best netflix original?",
    "options": [
        {
            "id": 1
        },
        {
            "id": 2
        },
        {
            "id": 3
        },
        {
            "id": 4
        }
    ]
}
```


## Part 3.2 - Create class `VoteController`

* Following the principles used to create `PollController`, we implement the `VoteController` class.
* Below is the code for the `VoteController` class along with the functionality to create a vote.
* The `VoteController` uses an injected instance of `VoteRepository` to perform `CRUD` operations on Vote instances.

```java
@RestController
public class VoteController {
    @Inject
    private VoteRepository voteRepository;

    @RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.POST)
    public ResponseEntity<?> createVote(@PathVariable Long pollId, @RequestBody Vote
            vote) {
        vote = voteRepository.save(vote);
        // Set the headers for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(ServletUriComponentsBuilder.
                fromCurrentRequest().path("/{id}").buildAndExpand(vote.getId()).toUri());
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
}
```

### Part 3.2.1 - Testing `VoteController`

* To test the voting capabilities, `POST` a new Vote to the `/polls/1/votes` endpoint with the option object expressed in `JSON` below.
* On successful request execution, you will see a Location response header with value http://localhost:8080/polls/1/votes/1.

```JSON
{
    "option": { "id": 1, "value": "Black Mirror" }
}
```


### Part 3.2.2 - Modify `VoteRepository`

* The method `findAll` in the `VoteRepository` retrieves all votes in a Database rather than a given poll.
* To ensure we can get votes for a given poll, we must add the code below to our `VoteRepository`.

```java
public interface VoteRepository extends CrudRepository<Vote, Long> {
    @Query(value = "SELECT v.* " +
            "FROM Option o, Vote v " +
            "WHERE o.POLL_ID = ?1 " +
            "AND v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
    public Iterable<Vote> findVotesByPoll(Long pollId);
}
```

* The custom finder method `findVotesByPoll` takes the `ID` of the `Poll` as its parameter.
* The `@Query` annotation on this method takes a native SQL query along with the `nativeQuery` flag set to `true`.
* At runtime, Spring Data JPA replaces the `?1` placeholder with the passed-in `pollId` parameter value.


### Part 3.2.3 - Modify `VoteController`

* Create a `getAllVotes` method in the `VoteController`


```java
@RequestMapping(value="/polls/votes", method=RequestMethod.GET)
public Iterable<Vote> getAllVotes() {
	return voteRepository.findAll();
}
```

* Create a `getVote` method in the `VoteController`

```java
@RequestMapping(value="/polls/{pollId}/votes", method=RequestMethod.GET)
public Iterable<Vote> getVote(@PathVariable Long pollId) {
	return voteRepository.findById(pollId);
}
```


# Part 4 - Data Transfer Object (DTO) Implementation

* The final piece remaining for us is the implementation of the ComputeResult resource.
* Because we don’t have any domain objects that can directly help generate this resource representation, we implement two Data Transfer Objects or DTOs—OptionCount and VoteResult
* Create a sub package of `java` named `dtos`


## Part 4.1 - Create class `OptionCount`

* The `OptionCount` DTO contains the `ID` of the option and a count of votes casted for that option.

```java
public class OptionCount {
    private Long optionId;
    private int count;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
```


## Part 4.2 - Create class `VoteResult`

* The `VoteResult` DTO contains the total votes cast and a collection of `OptionCount` instances.

```java
import java.util.Collection;
public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }
}
```


## Part 4.3 - Create class `ComputeResultController`

* Following the principles used in creating the `PollController` and `VoteController`, we create a new `ComputeResultController` class

```java
@RestController
public class ComputeResultController {
    @Inject
    private VoteRepository voteRepository;

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findVotesByPoll(pollId);

        //TODO: Implement algorithm to count votes
        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }
```


* We inject an instance of `VoteRepository` into the controller, which is used to retrieve votes for a given poll.
* The `computeResult` method takes `pollId` as its parameter.
* The `@RequestParam` annotation instructs Spring to retrieve the `pollId` value from a HTTP query parameter.
* The computed results are sent to the client using a newly created instance of `ResponseEntity`.


## Part 4.4 - Test via Postman

* Start/restart the `QuickPoll` application.
* Using the earlier Postman requests, create a poll and cast votes on its options.
* Ensure a JSON file with a `status` of `200` is returned by executing a `GET` request of `http://localhost:8080/computeresult?pollId=1` via Postman


# Part 5 - Error Handling

## Part 5.1 - Create `ResourceNotFoundException`

- Create a `exception` package inside of `io.zipcoder.springdemo.QuickPollApplication`
- Create a `ResourceNotFoundException` class that extends `RuntimeException`. We'll use this to signal when a requested resource is not found.
- Annotate the `ResourceNotFoundException` class with `@ResponseStatus(HttpStatus.NOT_FOUND)`. This informs Spring that any request mapping that throws a `ResourceNotFoundException` should result in a `404 NOT FOUND` http status.
- Implement three constructors
  -  A no-arg constructor
  -  A constructor that takes a `String message` and passes it to the superclass constructor
  -  A constructor that takes `String message` and `Throwable cause` and passes both to the superclass constructor


## Part 5.2 - Verify polls

Create a void method in `PollController` called `verifyPoll` that checks if a specific poll id exists and throws a `ResourceNotFoundException` if not. Use this in any method that searches for or updates an existing poll (eg: Get, Put, and Delete methods).

**Note**: This means that trying to submit a PUT request for a resource that doesn't exist will not implicitly create it; it should throw a 404 instead.

## Part 5.3 - Create custom Error Responses

Spring provides some built-in exception handling and error response, but we'll customize it a bit here. Create an `ErrorDetail` class in a new `io.zipcoder.tc_spring_poll_application.dto.error` package to hold relevant information any time an error occurs.

Fields (Don't forget to provide getters and setters):

- `String title`: a brief title of the error condition, eg: "Validation Failure" or "Internal Server Error"
- `int status`: the HTTP status code for the current request; redundant but useful for client-side error handling
- `String detail`: A short, human-readable description of the error that may be presented to a user
- `long timeStamp`: the time in milliseconds when the error occurred
- `String developerMessage`: detailed information such as exception class name or a stack trace useful for developers to debug


## Part 5.4 - Create a `@ControllerAdvice`

In this section we add custom handling for the exceptions we created before. A `@ControllerAdvice` is an AOP feature that wraps a controller and adds some functionality when needed. In this case we are adding functionality only when an exception is thrown.

- Create RestExceptionHandler class annotated with `@ControllerAdvice`
- Create a handler method with the header shown below
- Populate an ErrorDetail object in the method, and return a ResponseEntity containing the ErrorDetail and an HTTP `NOT_FOUND` status
  - Use java.util's `new Date().getTime()` for the timestamp
  - Provide the detail and developer messages from the `ResourceNotFoundException`

```java
@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {...}
```



## Part 5.4 - Validating domain entities

Now it's time to make sure that all objects persisted to the database actually contain valid values. Use the `org.hibernate.validator.constraints.NotEmpty` and `javax.validation.constraints.Size` and `javax.validation.Valid` annotations for validation.

- In the `Poll` class:
  - `options` should be `@Size(min=2, max = 6)`
  - `question` should be `@NotEmpty`
- To enforce these validations, add `@Valid` annotations to Poll objects in `RequestMapping`-annotated controller methods (there should be 2)

## Part 5.5 - Customizing validation errors

In order to customize validation errors we'll need a class for error information. Create a `ValidationError` class in `io.zipcoder.tc_spring_poll_application.dto.error` with the following fields and appropriate getters and setters:

- `String code`
- `String message`

We also need a new field in the `ErrorDetail` class to hold errors. There may be multiple validation errors associated with a request, sometimes more than one of the same type, so this field will be a collection, specifically a `Map<String, List<ValidationError>> errors` field.


## Part 5.6 - Create a validation error handler

- add below handler to `RestExceptionHandler`

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<?>
handleValidationError(  MethodArgumentNotValidException manve,
						HttpServletRequest request){...}
```

In this handler we need to do the following:

- Create the ErrorDetail object (similar to before)
- Get the list of field validation errors
- For each field error, add it to the appropriate list in the ErrorDetail (see below)
- Return a `ResponseEntity` containing the error detail and the appropriate HTTP status code (`400 Bad Request`)

```java
List<FieldError> fieldErrors =  manve.getBindingResult().getFieldErrors();
for(FieldError fe : fieldErrors) {

	List<ValidationError> validationErrorList = errorDetail.getErrors().get(fe.getField());
	if(validationErrorList == null) {
		validationErrorList = new ArrayList<>();
		errorDetail.getErrors().put(fe.getField(), validationErrorList);
	}
	ValidationError validationError = new ValidationError();
	validationError.setCode(fe.getCode());
	validationError.setMessage(messageSource.getMessage(fe, null));
	validationErrorList.add(validationError);
}
```

## Part 5.7 - Externalize strings in a messages.properties file

Commonly used strings in your Java program can be removed from the source code and placed in a separate file. This is called externalizing, and is useful for allowing changes to text displayed without impacting actual program logic. One example of where this is done is in internationalization, the practice of providing multilingual support in an application, allowing users to use an application in their native language.

There are two steps needed here to externalize and standardize the validation error messages:

- Create a `messages.properties` file in the `src/main/resources` directory with the given properties below
  - `messages.properties` is a key-value file stored in plain text. Your IDE may have a table-based view or show the contents as text
  - `.properties` files are a common idiom in Java applications; they contain additional information the application uses that doesn't impact the actual source code.
- Use an autowired `MessageSource` object in the `RestExceptionHandler` to set the message on ValidationError objects (ie: `setMessage(messageSource.getMessage(fe,null));` )
  - This object will be autowired (or injected) the same way your `CRUDRepository` instances are.

**`messages.properties` content**:

```
NotEmpty.poll.question=Question is a required field
Size.poll.options=Options must be greater than {2} and less than {1}
```


# Part 6 - Pagination

* To optimize performance, it is important to limit the amount of data returned, especially in the case of a mobile client.
* REST services have the ability to give clients access large datasets in manageable chunks, by splitting the data into discrete pages or _paging data_. 
* For this lab, we will approach this by implementing the _page number pagination pattern_.


### Get Data From Page 

* For example, a client wanting a blog post in page 3 of a hypothetical blog service can use a `GET` method resembling the following:
`http://blog.example.com/posts?page=3`


### Limit Data Retrieved From Page

* It is possible for the client to override the default page size by passing in a page-size parameter:
`http://blog.example.com/posts?page=3&size=20`


### Pagination Data

* Pagination-specific information includes
	* total number of records
	* total number of pages
	* current page number
	* page size
* In the above blog-scenario, one would expect a response body with pagination information closely resembling the `JSON` object below.

```JSON
{
"data": [
         ... Blog Data
    ],
    "totalPages": 9,
    "currentPageNumber": 2,
    "pageSize": 10,
    "totalRecords": 90
}
```

* Read more about REST pagination in Spring by clicking [here](https://dzone.com/articles/rest-pagination-spring).



## Part 6.1 - Load Dummy Poll Data

* Create a `src/main/resource/import.sql` file with _DML statements_ for populating the database upon bootstrap. The `import.sql` should insert at least 15 polls, each with 3 or more options.
	* Below is an example of `SQL` statements for creating a single poll with only one option.
	
		* Poll Creation
		
			```sql
			insert into poll (poll_id, question) values (1, 'What is your favorite color?');
			```
		* Option Creation
	
			```sql
			insert into option (option_id, option_value, poll_id) values (1, 'Red', 1);
			``` 
	
* Restart your application.
* Use Postman to ensure database is populated by `import.sql`.


## Part 6.2 - Spring's Built-in Pagination

* Make use of Spring's built-in page number pagination support by researching `org.springframework.data.repository.PagingAndSortingRepository`.
* Modify respective `Controller` methods to handle `Pageable` arguments.
* Send a `GET` request to `http://localhost:8080/polls?page=0&size=2` via Postman.
* Ensure the response is a `JSON` object with pagination-specific information.
