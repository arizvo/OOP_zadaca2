# OOP Homework 2

Exercise 2

Create 2 classes Classroom and Students.

Classroom class:

- contains a list of students
- has 1 constructor, without parameters creating an empty classroom
- addStudent - adds a student to the underlying list
- isPresent(String name) - checks if a student with provided name is present
- printClassroom() - prints the classroom (the list of students)

Student class:

- 2 attributes: name and age
- 2 constructors:
    - 1 parameter (String name), setting the age to 15
    - 2 parameters setting the attributes
- 1 method:
    - toString() returning String representation of Student - name, age

Task 1

Create the class Bookshelf. The bookshelf class holds Books (class) in a list of Books.

Book:

- Attributes:
    - title - String
    - ISBN - long
    - author - String

- Constructor:
    - 3 parameters, setting the values of attributes

- Method:
    - toString() - returning a String in the format title, author (ISBN)

Bookshelf:

- 1 Attribute being a list of Books
- Constructor without parameters, creating an empty BookShelf
- Methods:
    - containsBook(String title) - returning boolean depending if the shelf contains a Book with the provided title
    - containsBook(long ISBN) - returning boolean depending if the shelf contains a Book with the provided ISBN
    - printBookshelf() - prints all Books from the bookshelf

Task 2

Create the class Robot. The Robot moves on a plane similar to a coordinate system.

- It has 2 constructors:
    - Without parameters - the Robot starts at position (0,0)
    - With 2 parameters - initialises the Robot at position (x,y)
- The Robot has couple of methods:
    - moveSouth() - moves the Robot to the south, meaning it will decrease the y.position by 1
    - moveNorth() - moves the Robot to the south, meaning it will increase the y.position by 1
    - moveEast() - moves the Robot to the south, meaning it will increase the x.position by 1
    - moveWest() - moves the Robot to the south, meaning it will decrease the x.position by 1
    - getPosition() - return current position
    - double getDistance() - returns the euclidean distance from the initial position 
    - The distance is calculated as sqrt((x0 - x1)2 + (y0 - y1)2), where (x0, y0) is the initial position and (x1, y1) being the current position. The distance is a double.
    - getMoves() - return the number of moves the Robot performed
    - printLastPosition(int n) - prints the n last position starting from the last (backwards)  if n > number of moves, print all moves
    - Example of print:

      (2,5)

      (1,5)

      (1,4)
