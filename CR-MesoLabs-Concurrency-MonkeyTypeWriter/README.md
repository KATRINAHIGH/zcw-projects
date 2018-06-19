# TC-Concurrency

## Monkey Typewriter
According to Wikipedia:

> The infinite monkey theorem states that a monkey hitting keys at random on a typewriter keyboard for an infinite 
amount of time will almost surely type a given text.

We don't have that kind of time, but what we do have are super smart monkeys.  These monkeys are able to copy text.

So, guess what.  We're starting a printing company powered entirely off of monkey typists.

### What to do!
Testing multithreaded applications is super difficult.  Even more so, there's a chance that (if you're not actually
testing things correctly) your tests will occasionally pass when they shouldn't (since a poorly threaded application
isn't guaranteed to mess anything up).  Instead, we're going to use the main method in `Monkey Typewriter` to see
exactly what happens when things are threaded incorrectly vs correctly.

### Part 1

Made for you is an abstract base class of `Copier` which has a constructor that takes a String and turns that into
an iterator.  This will allow us to traverse the text to be copied and pass it along to each monkey (thread).

Extend `Copier` in `UnsafeCopier`.  Then, write a `run` method that will have the monkey grab the next word and append
it to the copy.

Modify `MonkeyTypewriter` to create 5 monkeys (threads) using the `UnsafeCopier` and start them.

After the sleep, print out the results of the unsafely copied passage.

### Part 2

Finish the `SafeCopier` and then call that from the main method, in addition to the unsafe version.



