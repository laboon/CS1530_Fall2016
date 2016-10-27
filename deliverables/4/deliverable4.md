## CS 1530 - Software Engineering
### Fall Semester 2016

### DUE DATE: 10 Nov 2016

### Deliverable 4

For the fourth sprint, each group will continue implementing user stories, fixing defects, and other action items.  You will continue to perform code reviews before any code is merged into the baseline.  However, a monkey wrench has been thrown into the works - the customer has decided that they have changed their mind and has some different ideas of how the game should be played.  Note that this is the first sprint where __functionality__ will directly count as part of your grade.  There are four specific pieces of functionality which must work for this sprint (listed in the __Grading__ section).

Once again, if someone in a group reports a work disparity, I will assume that the git commit history holds the truth and will investigate. At this point, I will grade people separately based on what I see in the git commit history.  For particularly egregious cases, I will discuss with any affected group members individually.  Remember that I will be able to see who committed what to the repository so please commit under your own username! For this reason, you should probably commit the final reports as well (although I will still expect a printed out copy).

If I see nothing from you in the git commit history for a sprint, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

### Additional Features

Both of these stories __must__ be implemented this sprint.

The customer has decided that they want the ability to "flip" the chessboard - that is, view the board from the perspective of the black player (with black pieces on the bottom) OR the perspective of the white player (with the white pieces on the bottom of the screen).  

Additionally, the customer thinks that "black" and "white" are boring colors for chess pieces.  They want some way (how, exactly, is up to you) to change the colors of the pieces to other color schemes (for example, have the "white" pieces be yellow and the "black" pieces be blue, to make a Pitt-themed chess game).  This can be done via a color wheel, RGB values, or a drop-down list of common colors.

It is up to you to determine the specific user interface for these.  The number of story points that they will require will depend on your current codebase.  During the sprint planning session, you may want to review the code and only then make an estimate.

__Additional User Stories:__

As a chess player,  
I want the ability to flip the board,  
So that I can view the game from the perspective of the other player.  
  
As a chess player,  
I want the ability to change the colors of my pieces,  
So that I can play the game with a pleasing color scheme.  

### Format

For the third sprint, you will turn in:

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
1. The date that it is due (10 NOV 2015)
1. The title "CS 1530 - SPRINT 4 DELIVERABLE"

### Grading

Group Grading:

1. Listing of Completed User Stories: 10% of grade
1. Description of Sprint: 10% of grade
1. Listing of Defects: 10% of grade
1. Functionality: 30% of grade
  * Can move chess pieces legally
  * Turns are taken (white, then black, then white, etc.)
  * Can flip chess board
  * Can change colors of chess pieces
1. Code and Tests: 40% of grade

Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information:

1. Reproduction Steps (or reference unit test that caught failure)
1. Expected Behavior
1. Observed Behavior

### Other

Please feel free to email me or come to office hours to discuss any problems you have.
