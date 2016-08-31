# Lecture 5 - Agile/Scrum and Requirements Elicitation

## Agile / Scrum

* Scrum is an agile methology with a heavy focus on being iterative and incremental

* What do we mean by Agile?
  * Individuals and interactions over processes and tools
  * Working software over comprehensive documentation
  * Customer collaboration over contract negotiation
  * Responding to change over following a plan

* What do we mean by scrum?
  * Scrum comes from Rugby - team of people who work together to move forward
  * Been around since 1995

* The "atomic unit" in Scrum is the User Story
  * User stories are kind of like requirements, but focused from the user perspective
  * Connextra template
    * As a ROLE
    * I want FEATURE
    * So that RESULT
  * Allows us to not only see what they want, but __why__
  * Gives us further flexibility if what they say they want is difficult/impossible, but can do something else that gives them the same result

* First, develop the Product Backlog
  * User stories that you want in the final system
  * Should be prioritized
  * Note - other items may be added to the product backlog (such as "defect fixes") later!  "Items" belong in the product backlog, not just user stories.  However, we should usually start with all user stories (and that is what I would like to see)

* Project divided into sprints, subdivided into days
  * Usually 2 - 3 weeks long (ours will be 2)
  * At beginning, take user stories from product backlog you want to get accomplished this sprint, put in the sprint backlog (Sprint planning).
    * Apply points - usually 1-2-4-8-16, where 16 is the entire sprint for one developer or pair of developers, 1 is tiny (typo fix)
    * However, assume all tasks will take at least four hours
    * However, try to avoid very large point user stories (if you have a 16-point story, in most cases you should break up the user story)
    * Developers work in tandem with QA to write/test/release(merge)
  * After the first sprint, you should include a sprint retrospective, to think about what you've done right and wrong, and how you can do it better (kaizen - "continuous improvement")
  * Standups - usually daily and very short
    * What have I done in the last 24 hours?
    * What do I plan to do in the next 24 hours?
    * Do I need any help or have any blockers?
    * You can probably do this 3x/week or something, probably not necessary for every day
  * At the end of which, you have __complete__ software
  * Complete means tested, documented, integrated... that user story is done!
  * __Definition of Done__ - what does it mean to say that we're done?

* Advanced Topics

* Backlog refinement (a/k/a backlog grooming)
  * Look through product backlog, determine quality of user stories and other items, determine if still necessary, re-prioritize, etc.

* Display method - kanban
  * Easy way to display sprint status
  * Consists of board with user stories / items on post-its or similar
    * Different phases of task completion
      * Not Started
      * In Progress
      * Completed
    * Could be different, e.g. Analysis, Tested, Verified

* Spikes
  * Operate outside of sprints
  * Used for testing code or concepts, should NOT be merged in

* Burndown charts
  * Show how far along you are in a sprint
  * At start of sprint, sum up points of everything in sprint backlog; each day, do so for all items not yet completed (it's all or nothing)

## Eliciting Requirements

* Figuring out users' wants and needs and converting them into requirements (or in our case, user stories)

* Sometimes called 'requirements gathering'
  * I prefer eliciting because you need to draw them out, they're not just sitting around waiting to be picked up

* All sorts of ways to get them
  * Questionnaires
  * User observation
  * Workshops
  * Brainstorming
  * Role Playing
  * Prototyping
  * Interviews

* We will focus on the last two.  These are proven effective and if you have few customers, much better than spending time on a survey.

* Interview
  * Determine the actual business need
  * Identify people to talk to
  * Determine technical environment
  * Determine domain constraints
  * Avoid ambiguity
  * Try to get interviewee to say "obvious" things - you as a non-domain-expert may not know about them
  * User scenarios - if I do X, what do you want to happen?
  * Be sure to get functional and non-functional aspects of the system
  * Prioritization - what's important?  What's a "nice-to-have"?  What's superfluous?

* Requirements will change.  Bet on it.  Communication is difficult, especially cross-domain.

* Paper prototyping - using drawings as the UI and humans as the "interface"
