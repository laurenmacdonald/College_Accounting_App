# College Accounting Application
This Java Swing program was created for fulfillment of PROG1400- Intro to Object Oriented Programming - Assignment 2 at NSCC.

## Concepts utilized: 
- Inheritance 
- Object instantiation
- Data validation techniques
- Functions
- Overridden code
- Storage of Objects in Arrays
- Java SWING GUI concepts
- User input
- Output formatting
- Commenting and best coding practices

A fictitious accounting department has requested an application
to track student fees and staff payroll information. Calculations
to invoice students for their semester's fees or pay staff their bi-weekly
salary should be included.

The application uses Java Swing to prompt for user input and display
program output.

### Information to be entered for students are:
- Name
- Address
- Year (1,2,3,4)

![Screenshot of user input for student](/images/Example1.png)

### Information to be entered for staff are:
- Name
- Address
- Years of Service

  ![Screenshot of user input for staff](/images/Example3.png)

Input validation is included within the program to catch user input errors
and direct them to correct their input (valid integer within a range, String, etc.).

![Screenshot of input validation prompt](/images/Example2.png)

Once all information has been entered, the accounting report will display
in a Java Swing dialog box. 

## Specific requirements: 
- Staff and student details out put separately. 
- Student fees are calculated based on which year they are a student (fees 
increase by $100 depending on year. First years pay $3000, second $3100, etc.)
- Student fees are paid in 2 installments, only invoice for half of the fee amount.
- Staff base pay is $50,000. Salary increases $500 each full year of service. 
- Staff are paid bi-weekly so the accounting result should be to pay the yearly salary divided by 26.
- Results should include what money is going out and coming in after invoicing each student and paying each staff member

  ![Screenshot of output](/images/Example4.png)


