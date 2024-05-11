# Java-Party-Member

# Exercise A - Fix the Party!

1. Download the file Party - Errors.zip from the Week 6 module in Canvas.  Unzip the file on your network drive - it should unzip into a folder called Party - Errors.
Inside the Party folder there is a BlueJ package called Party, and 4 java files, one for each class in the project: Party, Australian, French & Italian.

2.  Compile the Party class, and fix any compile errors. What was the problem?
3. Create a Party by creating a new Party object in BlueJ (right click on the Party class and select new Party()).  Study the code to see what is happening inside the constructor of class Party and answer these questions:
	- How many people are at the party?
	- How many different nationalities are at the party? What are they?
	- What is the name of the two Australians? What is their favourite food?

# Exercise B – Add to the Party

1. The solutions to exercises from the lecture have been implemented for the Australian and Party class.  You now need to implement the same changes for the other nationalities.
In the French and Italian classes:
	-  add a private class attribute for favourite food
	- add a method public void displayFood() that will display the persons favourite food
-  change the constructor so that it has an extra parameter for the persons favourite food
In the Party class:
-  modify the calls to the French & Italian constructors in class Party so that the favourite food is now an argument HINT: when creating a person we enter BOTH their name and favourite food
-  add method calls to allDisplayFood() in class Party so that the French and Italian people also share what they like to eat the most.	

2. Add a new attribute to the Australian, French & Italian classes called colour. This attribute will be initialised in the Constructor with a value passed in as an argument to the constructor (HINT: create another parameter in the constructor).

3. Add a method called displayColour() in the Australian, French & Italian classes that displays the favourite colour for the person. 

4. Add a new private method in the Party class called allDisplayColour() so that all people share their favourite colour.
