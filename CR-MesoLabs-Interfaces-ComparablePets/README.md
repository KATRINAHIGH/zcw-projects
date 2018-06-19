# Polymorphism Lab 1 -- Extended for Interfaces

## Objectives

1. Students will practice basic polymorphic program design in this lab.
2. After completing this lab students should be familiar with running tests against their code to confirm it is functioning properly.


## Overview

In this lab you will practice creating a simple Java program designed to make use of polymorphic design.

## Unit Test

Select a partner; You will each write tests for the requirements below, but your partner must develop against your tests and vice versa. Be sure to use the `io.zipcoder.pets` package for your Pet classes to allow tests to execute properly.

**Hint:** *An easy way to achieve this is for each partner to set up a GitHub repository for this lab, and add the other partner as a collaborator with write access (in the repository settings).*

## Instructions

### Part 1: 

Create a program that asks the user how many pets they have. Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name. For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.

### Part 2: 

Create a Pet class, and a subclass for each type of pet that you want your program to support. Your classes should follow the following requirements:

- You must support at least three types of pets.
- Dog must be one of the types you support.
- Cat must be one of the types you support.
- The Pet class must have a `speak` method that each subclass overrides.
- The Pet class must have a `name` field with setters and getters.

Use the tests provided as examples to write your own tests for other supported types of pets.

### Part 3:

Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user lists and at the end of the program print out a list of their names and what they say when they speak.

## Interfaces

Begin this lab by rewriting your UML according to the updated features. New unit tests will also be required.

### Part 1:

Starting from your completed polymorphism lab, add the `java.lang.Comparable` interface to your pet classes. Implement this interface so that `Arrays.sort()` or `Collections.sort()` (both existing static methods) will sort lists of your objects by name, breaking ties by class type.

### Part 2: 

Create a new implementation of `java.util.Comparator` that will sort pet objects by type, breaking ties by name.
