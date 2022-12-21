AureusOSIC Foundation Normal Exam
Getting Started
Fork this repository under your own account
Clone your forked repository to your computer
Create a .gitignore file so generated files won't be committed
Commit your progress frequently and with descriptive commit messages
All your answers and solutions should go in this repository
Take care of style guide
Take care of the naming of classes, fields, variables, files, etc.
Keep in mind
You can use any resource online, but please work individually

Don't just copy-paste your answers and solutions, you need to understand every line of your code

Don't push your work to GitHub until your mentor announces that the time is up

At the end of the exam push your solution to GitHub

Java
All of your classes should be in the com.gfa.exam package
You may use more packages to separate the exercises within the com.gfa.exam package
Use the correct class names, i.e. MatrixTranspose, WordFrequency, Factory, etc.
Make sure to declare all required classes and methods as public
Using of Stream is not allowed in this exam
At the end of the exam upload your solution to Gradescope too
GradeScope notes for Java
One hour before the end of the exam you can push your solution to Gradescope too
You may upload to GradeScope multiple times in the allocated time
You may upload your solution to GradeScope as a zip file
You can create the .zip archive (gradescope.zip) from your latest commit using the following commands:
# cd to the root of the git repository
cd `(git rev-parse --show-toplevel)`
# create a zip archive named gradescope.zip from the latest commit
git archive --format zip --output gradescope.zip HEAD
Exercises
Matrix transponse
Create a transposeMatrix function that takes a matrix as a parameter and returns the transpose of that matrix. The original matrix should remain the same. Keep in mind that the matrices might not be square-shaped. It could be 4x3, 6x1, etc... You can get some points if it works for square matrices but it needs to work for non-square matrices for full points.

Write at least 2 different unit test cases.

Example 1
Input

[
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
Output

[
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9]
]
Example 2
Input

[
  [5, 9, 3, 7],
  [3, 2, 1, 8]
]
Output

[
  [5, 3],
  [9, 2],
  [3, 1],
  [7, 8]
]
Word Frequency
Write a method/function outputWordsWithFrequency() which can read and parse a file. The method should take three parameters:

a path for the input filename
a frequency
a path for the output filename
It collects all of the words that appear the frequency amount of times in the input file. It shall write the selected words in alphabetical order separated by commas and spaces into the output file.

If there are no words present with the given frequency the output file should be empty.

The method/function should print Error happened during file manipulation with the following message: <message> if an error/exception happens during file manipulations.

<message> is the original message from the error/exception that happened

Example
Example file can be found here.

Example method/function call:

outputWordsWithFrequency('input.txt', 2, 'output.txt');
The output.txt contains this line:

apple, pear, pirate
Santa Factory
You are going to create a Santa's Toy Factory and help Santa bring the remaining toys to the poor children.

Toy
It has cost, color and owner.
When a toy is produced the owner should be null.
Note: the owner will be assigned later by Santa
Doll
It costs 25 credits and each instance can have a different color. The color must be set at creation.
DottedBall
It costs 10 credits and each instance can have a different color and size. Both color and size must be set at creation.
JumpingRope
It costs 15 credits and each instance can have a different color and size. Both color and size must be set at creation.
Factory
It has a balance of 200 credits by default.

It has a produce(color, size) method which produces a new Toy.

The Toy can be of any type which has size (choose randomly).
It shall return a toy if there is sufficient money for it.
Otherwise return null.
Update the balance accordingly.
It has a produce(color) method where you can produce a Doll.

It shall return a Doll only if there is sufficient money for it.
Otherwise return null.
Update the balance accordingly.
Santa
It has a bag as a list of toys. The bag should be empty when a new instance is created.

It has a children list with names representing all children in the word. The list is passed as a parameter to the constructor.

It has an addToyToBag(factory, color, size) method which calls one of the Factory's produce method at random.

When the one parameter produce() version is called, ignore the size parameter.
It has a bringToChildren() method which

Takes a list with the names of children e.g.: Lacika, Sanyika. This list represents the children who get presents when the method is called (this is a sub list of the children list). Imagine that Santa can transfer a limited amount of toys in one round.

Santa keeps bringing toys to children until the bag is empty or there are no more children left.

When Santa delivers a toy, the toy's owner is set (to a random child's name from the parameter list).

The owner should be removed from both of the children lists and the toy should be removed from the bag.

Command line exercise
Take a look at this directory structure:
todo-app-frontend
 ├──.git
 ├──node_modules
 ├──package.json
 ├──build
 ├──public
 │   ├──favicon.ico
 │   ├──index.js
 │   └──manifest.json
 └──src
     ├──App.css
     ├──App.js
     ├──App.test.js
     ├──app.js
     ├──index.css
     ├──index.html
     ├──logo.svg
     └──serviceWorker.js
Your task is to write commands in the correct order from the directory given below.

Do it with the smallest number of commands possible without chaining them together.

Assume that the following file is currently in the staging area:

src/App.css
src/App.js
src/app.js
Your current directory is todo-app-frontend/

Remove src/app.js from the staging area
Delete the src/app.js file
Move the src/index.html to public directory
Move the public/index.js to src directory
Create a .gitignore file
Add the following lines to the .gitignore file
node_modules
bower_components
Commit all the changes
Solution:

1. git restore --staged src/app.js
2. rm src/app.js
3. mv src/index.html public
4. mv public/index.js src
5. touch .gitignore
6. echo -e "node_modules \nbower_components" > .gitignore
7. git add.
	git commit -m"Removed file from staged area, deleted file, moved files, created .gitignore and wrote some line in it"
