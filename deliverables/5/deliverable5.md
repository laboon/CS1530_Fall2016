## CS 1530 - Software Engineering
### Fall Semester 2016

### DUE DATE: 01 DEC 2016

### Deliverable 5

For the final sprint, each group will continue implementing user stories, fixing defects, and other action items.  You will continue to perform code reviews before any code is merged into the baseline.  Note that in this final sprint, __functionality__ will count as a much larger part of your grade.  There are specific pieces of functionality which must work for this sprint (listed in the __Grading__ section), while ensuring that the previous pieces of functionality were not broken.

There is one additional piece of functionality - a threaded kibitzer - which is necessary to implement.

Once again, if someone in a group reports a work disparity, I will assume that the git commit history holds the truth and will investigate. At this point, I will grade people separately based on what I see in the git commit history.  For particularly egregious cases, I will discuss with any affected group members individually.  Remember that I will be able to see who committed what to the repository so please commit under your own username! For this reason, you should probably commit the final reports as well (although I will still expect a printed out copy).

If I see nothing from you in the git commit history for a sprint, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

### Additional Feature - the Threaded Kibitzer

In chess, there is a tradition of avoiding kibitzing (providing unwanted advice to the player and/or discussing the game near where people are playing).  Kibitzing is a great way to get thrown out of any "official" over-the-board chess tournament.  However, in many less-formal chess games, such as with the infamous "chess hustlers" in Washington Square in New York, kibitzing is common.  If you'd like to see an example, here is Grandmaster Maurice Ashley playing a Washington Square chess player: https://www.youtube.com/watch?v=U5vnpOp0U_g

In order to train ourselves to play in such an environment, we are going to implement an automated kibitzer.  This will provide random advice and comments to the user in a text box.  This textbox will refresh at random intervals (anywhere from 1 to 5 seconds) with random chess-related commentary.

You should start a separate thread which will update this textbox.  This thread should start at the same time as the game.  It will stop updating the textbox when the game is over, and start again when a new game is started.  The specific commentary is up to you.

As a chess player,  
I want an automated kibitzer,  
So that I can pretend I am in a noisy environment  

### Format

For the final sprint, you will turn in:

1. A cover page, in the format described below
2. An approximately one or two page description of what was accomplished this sprint. This can (but is not limited to) cover details such as:
  1. How teams communicated
  1. What disagreements arose
  1. How problems were resolved
  1. Changes in process since first sprint
  1. Interactions with customer
  1. Challenges writing the code or tests
  1. Design patterns or architectural patterns used
  1. Anything else that might be of interest
3. User stories and other action items completed this sprint
4. a *link to the code on GitHub*
6. A list of any defects found by testing, and how they were discovered and fixed (or if not fixed, why you decided not to prioritize them). This can include defects found by unit testing or system testing by QA (or other methods, such as issues found by the customer). If no defects were found, then please write a paper on how you have developed a way to develop software without making any mistakes, because I would be happy to read it!

Each of these sections shall be CLEARLY MARKED (i.e. they should each have titles and start on their own page).

Code should be submitted as pull requests on GitHub.  Remember that another member of the team - *not* the person who wrote the code - should review the code for performance issues, illegibility, test coverage, poor design, lack of commenting, poor algorithm choice, etc. 

Remember that your main goal is to deliver a working version of the software (i.e., can be compiled and executed on any individual member's computer).  Think about that when planning and prioritizing!

If I have any questions on the code, I may ask *any* individual member to show me the code running on their computer.  Therefore, if anyone has a problem running the current version of the code, that fact needs to be included as a defect.  Failure to have a working version of the project at end of sprint may mean a drastically lower score for the individual component of the project.

#### Format for cover page:

The cover page should include:

1. The name of the project
1. The names of the people in the group, and their git usernames
1. The date that it is due (1 DEC 2016)
1. The title "CS 1530 - SPRINT 5 DELIVERABLE"

### Presentation

You must give an approximately 10 minute presentation on your project.  This may be done by the entire group, one person, or some subset of the entire group.

This presentation must include the following:

1. A live demonstration of your project
2. A discussion of which features you instantiated or ignored, and why
3. Challenges faced during the creation of the project

Other than ensuring that you include those three topics, the presentation can cover whatever you think is most likely to be of interest to other students.  For example, you may wish to include a video, or discuss the architecture of the system, or perform an interpretive dance on how the threads in your program communicate.  The presentation is relatively informal.

Your group may go on either the FIRST or SECOND day of presentations (Thu 01 Dec or Tue 06 Dec).  I will pseudorandomly select which group will go on which day.  Thus, be prepared to give a presentation on the first day!

### Grading

Remember that this the final sprint, and so it is worth 20% of your final grade (as opposed to other sprints which were worth 10%).

Group Grading:

1. Listing of Completed User Stories: 5% of grade
1. Description of Sprint: 5% of grade
1. Listing of Defects: 5% of grade
1. Functionality: 45% of grade
  * All of the functionality from the previous sprint, PLUS
  * Threaded kibitzer
  * Any additional functionality you have decided to implement
1. Code and Tests: 25% of grade
1. Presentation: 15% of grade

Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information.  Please list them EXPLICITLY.

1. Reproduction Steps (or reference unit test that caught failure)
1. Expected Behavior
1. Observed Behavior

### Other

Please feel free to email me or come to office hours to discuss any problems you have.
