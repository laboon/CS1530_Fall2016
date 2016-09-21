# Unit Testing and TDD

## What is Unit Testing?

* Unit testing involves testing the smalles coherent units of code, e.g. functions, methods, classes, etc.
  * Testing that a sort method works correctly
  * Testing that an exception is thrown properly
  * Testing that results and side effects are correct

* Unit testing usually done by developers
  * Why? 
    * Need intimate knowledge of code
    * Used to check work
    * Fast turnaround
    * Developers can learn about edge cases
  * How?
    * Traditional -> Write some code, then write some tests
    * Test-first -> Write some tests, write some code
    * TDD -> Write failing test, write code to make it pass, refactor

* Example in English
  * If I create two linked lists and compare them with the equality operator, they *should* be equal 
  * Whenever you see the "should", think ASSERTION.  An assertion is something that must be true for the test to pass.

* We are going convert this into actual code, so that our tests can be run in an autoamated fashion.  We will use JUnit.

* Example in JUnit style
```java
@Test
public void testEqualEmptyLinkedList() {
    LinkedList<Integer> ll1 = new LinkedList<Integer>();
    LinkedList<Integer> ll2 = new LinkedList<Integer>();
    assertEquals(ll1, ll2);
}
```

Sample LinkedList code and tests under sample_code directory

## Some Useful Assertions to Know
* assertEquals / assertNotEquals
* assertSame / assertNotSame
* assertTrue / assertFalse
* assertNull / assertNotNul
* assertArrayEquals

## Advanced Unit Testing
* Test doubles
  * Fake objects you can use in your test

* Stubs
  * Fake methods or functions

* Expectation / Verification
  * Verify that a method has been called 0, 1, or n times

* Why use these techniques?
  * Ensure you are only testing the code under test
  * Isolate failures in code

# Test-Driven Development

* Code quality is everyone's responsibility - managers, developers, testers

* Concepts of TDD
  * Write failing tests first, before any code
  * Write only code that makes the tests pass
  * Write only tests that test the code
  * A very short turnaround cycle
  * Refactoring early and often

* The Key Concept 
  * Red -> Green -> Refactor (repeat)
  * Red - write tests that immediately fail
  * Green - Write code to make tests pass
  * Refactor - Fix up code to make it better
  * The Golden Rule - "Never write new functionality without a failing test."
  * "First make it green, then make it clean"

* The best way to do this:
  * Acceptance test -> multiple unit tests underneath

* KISS -> Keep it simple, stupid

* Fake it 'til you make it -> Methods do not have to be completed, but tests need to pass, in each iteration

* YAGNI -> You ain't gonna need it.  Don't throw in extra code or do more design than necessary.

# Baking Quality Into The System

* External quality: Quality of system as seen by the user (is it functional? reliable? usable?)  
  * Manual testing and acceptance testing can catch this more easily.
  * Unit testing or code inspection, much harder.

* Internal quality.  Quality of system as seen by development team.
  * Unit testing or code inspection can catch this more easily.
  * Acceptance testing and manual testing, much harder.

# Proper Object-Oriented Design

* Note - we will be discussing these more later in the semester in the lectures on Object-Oriented Analysis and Design.  Consider this a sneak peek!

* Coupling - Classes are coupled if a change in one class means a change in another.  
  * Can often be ameliorated via the Law of Demeter! (Tell, don't ask)

Example of highly coupled code:

```
DogFactorySingleton.getDogInstance("Fido").getFace().getJawMuscleSet().contractMuscles(7, 13);
```

Example of loosely coupled code.  Note how much is hidden.  "Tell" the dog to bite, don't ask for the face so that you can ask for the jaw muscles so that you can tell THEM what to do.

```
dog.bite("Person");
```


* Cohesion - Classes whose methods/attributes form a meaningful unit are cohesive.  

Example of highly cohesive class:

```java
public class Bird {
  public void chirp() { ... }
  public void fly(int xLocation, int yLocation) { ... }
  public String getBirdType() { ... }
  public int getNumTimesChirped() { ... }
}

```

Example of a low cohesion class:

```java
public class Stuff {
  public void printOutGrades() { ... }
  public int multiplyTwoIntegers(int first, int second) { ... }
  public char drinkSodaPop(String sodaType) { ... }
}
```
