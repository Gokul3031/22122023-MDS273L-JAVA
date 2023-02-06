Name: Gokul J
Reg. No.: 22122023, 
Email: gokul.j@msds.christuniversity.in
Class: 2 MSDS A

lab-2 Question:

You are supposed to create a menu-driven program that has the following menu options:
Enter a name
Search for a name
Remove a name
Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.
Constraints:
The names collected must be stored in an array with a max length of 1024.
The names in the array should be UNIQUE; no duplicate entries are expected!
Provide necessary validations that the user enters only valid names that are not going to be repeated.
Removing a name should not create empty space inside the array!
Format your results properly!!

lab Description:

This is a Java program that implements a simple name management system. It allows the user to enter, search, and remove names from a list of names stored in an array called "names". The program uses a while loop to continuously present a menu to the user until they choose to exit. The menu consists of 4 options: 
1. Enter name,
2. Search name,
3. Remove name, and
4. Exit.

The program uses a Scanner object to read user input. When the user selects option 1, the program prompts the user to enter a name, then checks if the name already exists in the list using the "isNameExists" method. If the name already exists, the program prints a message saying so, otherwise, the name is added to the list. When the user selects option 2, the program prompts the user to enter a name to search for and uses a for loop to search the list for a match. If a match is found, the program prints the position of the name in the list, otherwise, it prints a message saying the name was not found. When the user selects option 3, the program prompts the user to enter a name to remove, then uses a for loop to search the list for a match. If a match is found, the program removes the name from the list, otherwise, it prints a message saying the name was not found.

