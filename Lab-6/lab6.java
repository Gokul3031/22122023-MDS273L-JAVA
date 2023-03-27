import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public int regNo;
    public String name;
    public String email;
    public String phone;
    public String className;
    public String department;

    public Student(int regNo, String name, String email, String phone, String className, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + className);
        System.out.println("Department: " + department);
    }

    @Override
    public String toString() {
        return regNo + "\n" + name + "\n" + email + "\n" + phone + "\n" + className + "\n" + department;
    }
}

public class lab6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Update the details of a student");
            System.out.println("4. Display all students");
            System.out.println("5. Save the details of each student to a file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's registration number: ");
                    int regNo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter the student's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the student's email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter the student's phone number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter the student's class: ");
                    String className = scanner.nextLine();

                    System.out.print("Enter the student's department: ");
                    String department = scanner.nextLine();

                    Student student = new Student(regNo, name, email, phone, className, department);
                    students.add(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("1. Search by name");
                    System.out.println("2. Search by registration number");
                    System.out.print("Enter your choice: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    switch (searchChoice) {
                        case 1:
                            System.out.print("Enter the student's name: ");
                            String searchName = scanner.nextLine();

                            for (Student s : students) {
                                if (s.name.equalsIgnoreCase(searchName)) {
                                    s.printDetails();
                                    found = true;
                                }
                            }

                            if (!found) {
                                System.out.println("Student not found.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter the student's registration number: ");
                            int searchRegNo = scanner.nextInt();
                            scanner.nextLine();

                            for (Student s : students) {
                                if (s.regNo == searchRegNo) {
                                    s.printDetails();
                                    found = true;
                                }
                            }

                            if (!found) {
                                System.out.println("Student not found.");
                            }
                            break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                break;
            case 3:
                System.out.println("1. Update by name");
                System.out.println("2. Update by registration number");
                System.out.print("Enter your choice: ");
                int updateChoice = scanner.nextInt();
                scanner.nextLine();

                found = false;

                switch (updateChoice) {
                    case 1:
                        System.out.print("Enter the student's name: ");
                        String updateName = scanner.nextLine();

                        for (Student s : students) {
                            if (s.name.equalsIgnoreCase(updateName)) {
                                System.out.print("Enter the new registration number: ");
                                s.regNo = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Enter the new name: ");
                                s.name = scanner.nextLine();

                                System.out.print("Enter the new email: ");
                                s.email = scanner.nextLine();

                                System.out.print("Enter the new phone number: ");
                                s.phone = scanner.nextLine();

                                System.out.print("Enter the new class: ");
                                s.className = scanner.nextLine();

                                System.out.print("Enter the new department: ");
                                s.department = scanner.nextLine();

                                found = true;
                                System.out.println("Student details updated successfully.");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter the student's registration number: ");
                        int updateRegNo = scanner.nextInt();
                        scanner.nextLine();

                        for (Student s : students) {
                            if (s.regNo == updateRegNo) {
                                System.out.print("Enter the new registration number: ");
                                s.regNo = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Enter the new name: ");
                                s.name = scanner.nextLine();

                                System.out.print("Enter the new email: ");
                                s.email = scanner.nextLine();

                                System.out.print("Enter the new phone number: ");
                                s.phone = scanner.nextLine();

                                System.out.print("Enter the new class: ");
                                s.className = scanner.nextLine();

                                System.out.print("Enter the new department: ");
                                s.department = scanner.nextLine();

                                found = true;
                                System.out.println("Student details updated successfully.");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                break;
            case 4:
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("List of all students:");

                    for (Student s : students) {
                        s.printDetails();
                        System.out.println();
                    }
                }
                break;
            case 5:
                FileWriter writer = null;
                try {
                    writer = new FileWriter("students.txt");
                    for (Student s : students) {
                        writer.write(s.toString() + "\n");
                    }
                    System.out.println("Student details saved to file successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (writer != null) {
                        writer.close();
                    }
                }
                break;
            case 6:
                    exit = true; // set exit to true to exit the loop
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }
}