# Engineering with TDD

* Remember the Red-Green-Refactor loop
  * We can make an inner loop and an outer loop
    * Outer loop - acceptance tests (feature-level)
    * Inner loop - unit tests (method-level)

```java
Project p = new Project(); // includes Walking Skeleton
for (int j=0; j < NUM_FEATURES; j++) {
    at = writeFailingTest(FEATURE_LEVEL);
    for (int k=0; k < NUM_METHODS_IN_FEATURE; k++) {
      Test t = writeFailingTest(UNIT_LEVEL);
      Code c = writeCodeToMakeTestPass(t);
      Code rc = refactorCode(c);
      addCodeToProject(rc, p);
    }
    if (p.test(at) == true) { continue; } else { moreRGFLoops(); }
}
```

* So how to start out?
  * Build a walking skeleton
  * Included in this is Building/Deploying/Testing - it just doesn't DO anything
  * Allows you to focus on basic structure of the application without worrying too much about functionality
  * Note that YAGNI does NOT mean "never think about the future"
  * Deployment doesn't need to do anything, just print out "hello, world!" or something of that nature
  * Tests don't need to be working, just running

* Why?
  * You want to build with all of this in mind!  Much easier now than later!
  * Early, continuous testing
  * Checking end-to-end
  * Concentrate on overall structure
  * Doesn't need to do anything!
  * Many popular frameworks are popular due to walking skeleton functionality 
    * Rails
  * Is not BDUF (it's more like JALDUF (Just A Little Design Up Front)
  * Allows system to grow organically
  * Exposes uncertainty early - much better than figuring it out last minute

* Let's Start Writing Tests!
  * First -> start with a simple success case
  * Write tests you want to read
  * Tests should ALWAYS fail first!  Avoid tautological tests
  * Think of inputs/outputs
  * Unit tests will be checking methods - but think of them checking BEHAVIOR
  * How many?
    * This is kind of like asking "What is the best color?"
    * It will vary TREMENDOUSLY by domain
    * Good heuristic for this class: at least one test per method, additional tests for failure cases - ideally one test per "kind of expected input-output mapping".  Technically "one test per equivalence class" if you are interested
    * This is a great thing to discuss during sprint retrospectives / planning!

* Object-Oriented Style (not to be confused with Gangnam Style) 
  * A wristwatch 
    * Inputs (move time forward, move time back)
    * Outputs (hour hand, minute hand, second hand)
    * Business logic (lots of gears and whatnot)
  * Encapsulated - you can't say "move balance spring" or "stop gear"
    * Provides simple interface, avoid causing problems
  * Information Hiding - you don't even know those things exist!
    * Allows you to work at higher abstraction
  * Remember that calling a method IS literally calling it!  You are "sending a message" with some parameters
  * Postel's Principle - Be liberal in what you accept, and conservative in what you send

  