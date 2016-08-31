# Lecture 2 - The Software Development Life Cycle

## Problems in Software Development

```
A manager went to the Master Programmer and showed him the requirements document for a new application. The manager asked the Master: "How long will it take to design this system if I assign five programmers to it?"

"It will take one year," said the Master promptly.

"But we need this system immediately or even sooner! How long will it take if I assign ten programmers to it?"

The Master Programmer frowned. "In that case, it will take two years."

"And what if I assign a hundred programmers to it?"

The Master Programmer shrugged. "Then the design will never be completed," he said.
   -The Tao of Programming (http://www.mit.edu/~xela/tao.html)
```

The big problem - estimating.  Brooks complained about in the early 70s and we're still bad at estimating.  

Why?  Every program is BRAND-NEW.  If we knew what the problems were, we'd have already written the darn program!  One bridge is more similar to another bridge than two randomly-chosen programs are.

It's kind of heart-warming that Brooks thought that some day estimating would be on "a sounder basis."

### The Iron Triangle of Project Management (aka the Triple Contraint)

```
  SCOPE & QUALITY
       /\
      /  \
     /    \
COST ------ SCHEDULE
```

* SCOPE -> Features that are included in the project
* QUALITY -> Is the program performant, bug-free, etc?
* COST -> How much does it cost to develop (in terms of team members and other resources)?
* SCHEDULE -> How long will it take?

You may have heard this as "Good, fast, cheap - pick two" or "Grades, social life, sleep: pick two"

Design it quickly and to a high standard, but it will be expensive.
Design it quickly and cheaply, but it will be of low quality and/or be missing features.
Design it well and cheaply, but it will take a long time.

One of the benefits of current SaaS systems -> can adjust scope and schedule more easily in many circumstances.

### Software Development is Not Linear

Let's say you're washing clothes.  It takes 1/2 hour to wash a load and 1/2 to dry.  Can you buy ten washing machines and ten dryers and get clothes washed and dry in only half an hour?

Of course not.

"Adding manpower to a late software project makes it later" -Brooks's Law

Why?  Time for training, time for integrating into workflow, extra mistakes made by new developers, extra communication time (which grows exponentially), removal of people originally working on these projects for these things!

Software takes time, and often an unknown amount of time.


## The Software Life Cycle

```
(Training) 
  -> Analysis
    -> Requirements 
      -> Design 
        -> Development
          -> Integration and Test 
            -> Release 
              -> Maintenance
```

## Possible Additions 
1. External Acceptance or Evaluations 
2. Regulatory Checks
3. Deployment / DevOps
4. External integration
5. EOL Preparation
6. Customer Support

### Analysis

Determining the needs of the customer/user

### Design

Developing a preliminary idea of how the system should work and should be constructed

Paper prototyping

### Development

Where the code is written - what most people think of when they think "software development"

### Integration and Test

Ensuring that the software works as designed, works with external systems, works together as a cohesive whole, does not fall down on the job

Verification - ensuring that the software works right

Validation - ensuring that you wrote the right software

### Release

Sending the system out into the world

This will mean different things for different systems - e.g., releasing a video game on a cartridge/CD or uploading code to a server

### Maintenance

Adding additional features, fixing bugs, etc. after initial release

## What kinds of problems do you see with this system?
1. Not very flexible
2. Hard to "loop back"
3. Pushes testing to the end
4. Lots more problems...

Different paradigms have been sprung up to address these (next class!)

## Who all is involved in software development?
1. Systems Engineers
2. Project Managers
3. Product Managers
4. Quality Assurance
5. UI/UX Designers
6. System Administrators 
7. Customer Support
8. Database administrators
9. Software Developers, too, I suppose...

## Other Stakeholders
1. Management
2. Users
3. Customers
4. Regulatory agencies

__The software developer is an essential piece of software development, but not the only part__.

## Top-Down vs Bottom-up Design

### Top-Down: Developing a System from The Big To The Small

Break down a system into smaller and smaller pieces

A form of methodological reductionism

Individual elements are black boxes

Example: Mars Curiousity codebase

#### Pros: 
1. Lots of understanding of system beforehand.
2. Go down fewer "dark roads"
3. Things are well-defined BEFORE implementation starts

### Bottom-up: Developing a System from the Small

Piece together small systems to make up larger systems

A kind of emergentism

Example: Unix command line utilities

#### Pros: 
1. Flexible
2. Understandable
3. Code is often reusable by design

## Hybrid Development

Most modern software combines top-down and bottom-up approaches
