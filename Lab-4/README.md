Name: Gokul J
Reg. No.: 22122023, 
Email: gokul.j@msds.christuniversity.in
Class: 2 MSDS A

Lab-4 Question:

Write a JAVA Menu driven program that does the following:
You can ONLY have the below variables as global variables
Account Number
Account Holder Name
Account Balance
You MUST have the below as functions
To initialize the customer
To deposit money
To withdraw money
To print the transactions
To print account summary
Your menu will have the following operations once the customer is created
To deposit money
To withdraw money
To print the transactions
To print account summary

lab description:

This is a Java program that simulates a simple banking system. It defines a class lab4 which has instance variables for account number, account holder name, and account balance. The class also has an ArrayList to keep track of the transaction history.

The class has four methods:

deposit(double amount) - Allows the user to deposit money into the account. If the amount is greater than 0, it adds the amount to the balance, adds a "Deposit" transaction to the transaction history, and prints a success message. If the amount is less than or equal to 0, it prints an error message.

withdraw(double amount) - Allows the user to withdraw money from the account. If the balance is greater than or equal to the amount and the amount is greater than 0, it subtracts the amount from the balance, adds a "Withdraw" transaction to the transaction history, and prints a success message. If the balance is less than the amount or the amount is less than or equal to 0, it prints an error message.

printTransactionHistory() - Prints the transaction history to the console.

printAccountSummary() - Prints the account summary to the console, which includes the account number, account holder name, and current balance.

The main method initializes a Scanner to get user input for the account number, account holder name, and initial balance. It then creates an instance of the lab4 class using these values. The program then enters a loop that displays a menu of options for the user to choose from: deposit money, withdraw money, print transaction history, print account summary, or exit the program. The program uses a switch statement to perform the appropriate action based on the user's choice. The loop continues until the user chooses to exit the program.

