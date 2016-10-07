# Software Engineering Methodologies?

* What do we mean by this? - Defining a system of software development into distinct phases, responsibilities, and deliverables.  This allows better planning, management, and arguably better software.

* These are numerous, but I think it's more important to have deep knowledge of one as opposed to broad knowledge of many.  That being said, you should know the basics, especially the terms: cowboy, waterfall, spiral, prototyping, iterative and incremental, agile

* There are __lightweight__ and __heavyweight__ methodologies.
  * Lightweight have few rules, more flexibility, less documentation
  * Heavyweight have more rules, less flexibility, more documentation

## Cowboy Coding

* Lack of any sort of formal (or even informal) software project management

* Lack of estimation, testing, integration

* Think "hackathon"

* Lots of benefits though..
  * Fast
  * Flexible
  * Efficient for small projects

* Also drawbacks
  * Tends to use "quick and dirty" solutions, a.k.a. kluges or hacks
  * Often leads to technical debt
  * Not good for writing code without defects
  * Very difficult to write large software systems in this style

## Waterfall

* Lots of design up-front - ensure:
  * Stable understanding of customer needs before requirements
  * Stable requirements before design
  * Stable design before development
  * Stable development before testing
  * Stable testing before release

* Also called "BDUF" - Big Design Up Front

* Very documentation heavy

* Very "wall-friendly" - lots of throwing stuff "over the wall".
  * This seems like a drawback, but may be good for very large projects/companies where it is difficult to communicate
  * Remember communication is o(n^2)

* Usually "gated" -> you can't move on to the next phase without some sort of formal review (gateway)

* When to use waterfall?
  * Requirements are or can be well-understood and specified
  * System has a specific end goal, after which changes are unlikely and/or minimal

* Variant: Incremental Development
  * Imagine software splits up into lots of mini-waterfalls.  
  * Each is entirely complete before moving on to the next.
  * Usually still BDUF to determine the various mini-waterfalls

## Spiral

* "Loop around in a spiral"
  * Each trip traverses four quadrants
    * Determine objectives
    * Identify and Resolve Risks
    * Development and Test
    * Plan next iteration

* Allows more precise estimating (since less far in the future)

* Drawbacks
  * Extra time and effort
  * Not as much dedided up-front

## Iterative and Incremental

* Basic idea:
  * Iterative - System is developed through repeated cycles
  * Incremental - Small pieces of the software are done during each iteration

* Increments can be large or small

* Benefits
  * Get smaller pieces working right
  * Can be flexible

* Drawbacks
  * Often difficult to plan ahead
  * Difficult in projects that are overlapping or do not split up well


## RAD (Rapid Application Development) / Prototyping

* Goal: fast development, delivery of a quality system at a low price

* Key idea - ensure that there are prototypes available which can be developed upon at each gateway

* Goal is to ensure that you meet the business need; software design qua design is secondary

* Iteratively produce software

* Projects are timeboxed - idea is if project deadline slips, reduce features or eliminate requirements to meet deadline, instead of extending project (remember the Iron Triangle of Project Management)

* Still produces documentation

* Benefits
  * More flexible
  * More in-line with what the business wants

* Drawbacks
  * Focus less on technical aspects, more on business aspects
  * Not as useful if all aspects are/should be known up-front

## Agile

* An incremental development methodology focused on satisfying the user
  * Focus on communication (dev to dev, dev to others, everything)
  * "Information radiators" - think of uptime indicators
  * Focus on face-to-face interaction instead of documentation

* "User stories" instead of requirements

* Maintenance is ongoing; pace of development is maintanable indefinitely

* Simplicity - what you don't do is as important as what you do do (YAGNI principle)

* Working code at end of every iteration!

* Benefits
  * Very flexible, very good for work on tight timelines without rigid deadlines
  * Kaizen - "continuous improvement" baked into the system for the most part
  * Focus on user means you focus on end goal ("How does this help kids learn math?")

* Drawbacks
  * Less up-front understanding of system, can go down blind alleys
  * More heavyweight than some, although still very lightweight
  * Adaptive vs prescriptive schedule estimation

## CMMI

* The Capability Maturity Model Integration (successor to CMM, which was software-specific)

* Appraises  how your company follows processes - NOT a process in and of itself!

* Maturity Levels
  * Initial - Processes are unpredictable, ad hoc (where you start)
  * Managed - Processes is defined and characterized for projects (CMM term: Repeatable).  The proces is at least documented.
  * Defined - Processes is defined and characterized for the organization.
  * Quantitatively Defined - Processes measured and controlled (CMM term: Managed).  There are metrics that can allow one to know how well the processes are working.
  * Optimizing - Focus is on process improvement

# Our Paradigm - Agile with TDD

* Note - "Agile" is a very argued-over term!  See the Agile Manifesto for the original - this has been modified/specified/etc. into lots of different processes.

* There are various forms forms of agile development - Adaptive Software Development, XP (Extreme Programming), FDD (Feature-Driven Development), Crystal Clear, Disciplined Agile, etc. etc.

* Our paradigm will be a very specific kind of agile, Agile/Scrum with TDD
  * Projects grouped into User Stories (kind of lightweight requirements)
  * User Stories entered into backlog
  * Scheduled around sprints.
  * Decide what to work on at beginning of the sprint
  * Working version of software at the end of __each__ sprint!

* Test-driven Development
  * Write tests first, then code to make tests pass
  * We will talk more in-depth during the next class

* Benefits
  * Ensures that some sort of working software is released
  * Allows flexibility but backed by security of tests
  * Provides a framework without binding us rigidly to it

* Drawbacks
  * Sometimes difficult to plan far ahead
  * More heavyweight than some processes, even other agile processes
  * Software design risks becoming a "big ball of mud"
