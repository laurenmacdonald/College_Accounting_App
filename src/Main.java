/*
PROG1400 Assignment 2
Inheritance and UML Basics - College Accounting Application
Lauren MacDonald
March 6th, 2023
*/

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /*
         * IMPORTANT NOTE:
         * There are regions within the USER INPUT region to keep blocks of user input validation neat and tidy. */

        //regionHOUSEKEEPING, DECLARING VARIABLES:
        //Declaring ArrayLists for Staff and Student
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Staff> staffList = new ArrayList<>();

        //Declaring options to present at start of program
        Object[] studentOrStaff = {"Student", "Staff", "Finish"};
        int studentOrStaffUserChoice;//User input variable to be used for student, staff, finish prompt. Will be used in the first do-while loop
        String userStringInput;//String variable declared as a placeholder to accept user string input
        //endregion
        //region USER INPUT:
        //Do while loop that encompasses user input. Will continue to run until user selects Finish
        do{
            //JOptionPane to display student or staff options and take input.
            studentOrStaffUserChoice = JOptionPane.showOptionDialog(null,
                    "Select Student or Staff",
                    "Accounting App", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, studentOrStaff, studentOrStaff[1]);
            //If user selects Student (index of 0):
            if(studentOrStaffUserChoice == 0){
                //Create a new student object
                Student student = new Student();

                //region USER INPUT VALIDATION FOR STUDENT YEAR:
                boolean isValidStudentYear = false;    //flag for do while loop that holds input validation
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter Student Year (1-4)");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message prompt for valid information, return to "Enter Student Year"
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{ //User inputs information
                        //try block: parseInt to see if userStringInput can be turned into an int (is it a number?)
                        try {
                            int studentYear = Integer.parseInt(userStringInput);
                            //Is the valid int input between 1 and 4?
                            if (studentYear >= 1 && studentYear <= 4) {
                                //CONCLUSION: if the int is within valid range, set it as the student's studentYear variable.
                                student.setStudentYear(studentYear);
                                //Change the flag to true, exit do while loop
                                isValidStudentYear = true;
                                //If the int was not within valid range, prompt to try again.
                            } else {
                                JOptionPane.showMessageDialog(null, "Not correct range of 1-4, please try again.");
                            }
                            //catch block if the user input was not an int
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "That is not a number! Please try again.");
                        }
                    }
                }while (!isValidStudentYear);
                //endregion
                //region USER INPUT VALIDATION FOR STUDENT NAME:
                boolean isValidStudentName = false;    //flag for do while loop that holds input validation
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter Student Name");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message for valid information and return to Enter Student Name
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{
                        //Valid information was entered, boolean flag changed to true to exit loop
                        student.setName(userStringInput);
                        isValidStudentName = true;
                    }
                }while (!isValidStudentName);
                //endregion
                //region USER INPUT VALIDATION FOR STUDENT ADDRESS:
                boolean isValidStudentAddress = false;    //flag for do while loop that holds input validation
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter Student Address");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message for valid information and return to Enter Student Address
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{
                        //Valid information accepted, switch flag to true to exit loop.
                        student.setAddress(userStringInput);
                        isValidStudentAddress = true;
                    }
                }while (!isValidStudentAddress);
                //endregion
                //FEES CALCULATION:
                //setStudentFees method used with getStudentYear to take the student year input above as parameter for studentFees
                student.setStudentFees(student.getStudentYear());

                //Adding newly instantiated Student object to studentList ArrayList
                studentList.add(student);

                //STAFF
                //If user selects Staff (index of 1):
            }else if(studentOrStaffUserChoice == 1){
                Staff staff = new Staff();

                //region USER INPUT VALIDATION FOR STAFF NAME:
                boolean isValidStaffName = false;    //flag for do while loop
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter Staff Name");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message for valid information
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{
                        staff.setName(userStringInput);
                        isValidStaffName = true;
                    }
                }while (!isValidStaffName);
                //endregion
                //region USER INPUT VALIDATION FOR STAFF ADDRESS:
                boolean isValidStaffAddress = false;    //flag for do while loop
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter Staff Address");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message for valid information
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{
                        staff.setAddress(userStringInput);
                        isValidStaffAddress = true;
                    }
                }while (!isValidStaffAddress);
                //endregion
                //region USER INPUT VALIDATION FOR STAFF YEARS OF SERVICE:
                boolean isValidStaffYear = false;    //flag for do while loop
                do{
                    userStringInput =JOptionPane.showInputDialog("Enter staff years of service");
                    //if user hits 'Cancel' (null = cancel), show thank you message and stop the program:
                    if(userStringInput == null) {
                        JOptionPane.showMessageDialog(null, "Thanks for using the program!");
                        System.exit(0);
                        //if user doesn't enter any information (empty string), show message for valid information
                    }else if (userStringInput.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid information.");
                    }else{
                        //try block to see if userStringInput can be turned into an int (is it a number?)
                        try {
                            int staffYear = Integer.parseInt(userStringInput);
                            //Is the valid int input between 0 and 30?
                            if (staffYear >= 0 && staffYear <= 30) {
                                //CONCLUSION: if the int is within valid range, set it as the staff staffYear variable.
                                staff.setStaffYears(staffYear);
                                //Change our flag to true, exit loop
                                isValidStaffYear = true;
                                //If the int was not within valid range, prompt to try again.
                            } else {
                                JOptionPane.showMessageDialog(null, "Not correct range of 0-30, please try again.");
                            }
                            //catch block if the user input was not an int
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "That is not a number! Please try again.");
                        }
                    }
                }while (!isValidStaffYear);
                //endregion
                //SALARY CALCULATION:
                //setStaffSalary method used with getStaffYears to take the staff year input above as parameter for staffSalary
                staff.setStaffSalary(staff.getStaffYears());

                //Adding newly instantiated Staff object to staffList ArrayList
                staffList.add(staff);
            }
        }while(studentOrStaffUserChoice != 2);  //if user selects finish (index 2), will end user input and display the report.
        //endregion
        //region CALCULATIONS:
        //Calculations for incoming funds
        double totalStudentFees =0;
        //Enhanced for loop to iterate through each student in the student list and add their fees to totalStudentFees
        for(Student student : studentList){
            totalStudentFees += student.getStudentFees();
        }
        double totalIncomingFunds = (totalStudentFees/2);

        //Calculations for outgoing funds
        double totalStaffSalary = 0;
        //Enhanced for loop to iterate through each staff in the staff list and add their salary to totalStaffSalary
        for(Staff staff : staffList){
            totalStaffSalary += staff.getStaffSalary();
        }
        double totalOutgoingFunds = (totalStaffSalary/26);

        //Calculations for total funds
        double totalFunds = totalIncomingFunds-totalOutgoingFunds;
        //endregion
        //region REPORT CREATION:
        //Declaring String variable to create final report.
        DecimalFormat df = new DecimalFormat("0.00");   //DecimalFormat object created for toString output.
        StringBuilder report = new StringBuilder("STUDENTS:\nTotal Students: " + studentList.size() + "\n"); //Heading at start of the report
        //Enhanced for loop - iterate through each student in the list to append their index value and toString output to the report
        for (Student student : studentList) {
            report.append(studentList.indexOf(student) + 1).append(".").append(student.toString()).append("\n");
        }

        report.append("\nSTAFF:\nTotal Staff: ").append(staffList.size()).append("\n"); //Heading for staff
        //Enhanced for loop - iterate through each staff in the list to append their index value and toString output to the report
        for (Staff staff : staffList){
            report.append(staffList.indexOf(staff) + 1).append(".").append(staff.toString()).append("\n");
        }
        //Appending final results to report
        report.append("\nRESULTS:\nOutgoing: $").append(df.format(totalOutgoingFunds)).append("\nIncoming: $").append(df.format(totalIncomingFunds)).append("\nTotal: $").append(df.format(totalFunds)).append("\n");
        //endregion

        //Post the final report in a message dialog window:
        JOptionPane.showMessageDialog(null, report.toString(), "Report", JOptionPane.INFORMATION_MESSAGE);
    }
}
