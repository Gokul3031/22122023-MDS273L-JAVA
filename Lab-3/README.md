Name: Gokul J
Reg. No.: 22122023, 
Email: gokul.j@msds.christuniversity.in
Class: 2 MSDS A

lab3 Question:

Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.

lab3 description:

The code is a Java program that implements a student database management system. The system allows the user to collect and display the details of students.

The system has the following features:

Collect student details: The user can enter the name, register number, email, class, and department of a student.
Search student details: The system checks if the details for a student with the same name already exists and, if not, stores the details.
Display student details: The user can search for the details of a student by entering the name of the student. If the details are found, the system displays the details.
Exit: The user can exit the program by choosing the exit option.
The system uses a static array of strings, studentNames, to store the names of the students and a 2-dimensional array of strings, studentDetails, to store the details of the students. The studentCount variable keeps track of the number of students in the system. The searchStudent method searches for a student by name and returns the index of the student in the arrays.

The program implements a menu-driven interface and repeatedly displays the menu until the user chooses the exit option.
