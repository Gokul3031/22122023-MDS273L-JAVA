Name: Gokul J
Reg. No.: 22122023, 
Email: gokul.j@msds.christuniversity.in
Class: 2 MSDS A

Lab-5:

Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row

Plain:  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

Cypher: X Y Z A B C D E F G H I J K L M N O P Q R S T U V W

Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.

lab-5 description:

*The above code is a Java program that demonstrates a simple encryption and decryption algorithm using a substitution cipher. The program prompts the user to enter a message, then encrypts and decrypts the message using the substitution cipher.

*The substitution cipher used in this program replaces each letter in the original message with a corresponding letter in the cipher alphabet. For example, the letter 'A' is replaced with the letter 'X', 'B' with 'Y', and so on. The cipher alphabet used in this program is simply a rotation of the standard alphabet.

*The program consists of a main method and two additional methods for encrypting and decrypting messages. The main method prompts the user to enter a message, calls the encrypt method to encrypt the message, and then calls the decrypt method to decrypt the encrypted message. The encrypted and decrypted messages are then printed to the console.

*The encrypt and decrypt methods are similar in structure, but perform the reverse operation. The encrypt method takes an input message, loops through each character in the message, and replaces each letter with its corresponding letter in the cipher alphabet. The resulting encrypted message is returned. The decrypt method performs the reverse operation, looping through each character in the encrypted message and replacing each letter with its corresponding letter in the original alphabet.

*In the modified version of the program, the code has been updated to include a user menu with two options for encrypting and decrypting a message. The program prompts the user to select an option, then prompts them to enter a message, and then displays the encrypted or decrypted message depending on the user's choice. The program will continue to prompt the user until they choose to exit the program.

