import java.text.DecimalFormat;

public class Student extends Person{
    private int studentYear;
    private double studentFees;

    //Default constructor (no parameters used)
    public Student(){}

    //region Getters and Setters
    public void setStudentYear(int studentYear){
        this.studentYear = studentYear;
    }

    public int getStudentYear(){
        return studentYear;
    }

    //setter for studentFees with parameter of studentYear
    public void setStudentFees(int studentYear) {
        //If... else if... statements that depend on parameter of studentYear used for the 4 potential options.
        if (studentYear == 1){
            this.studentFees = 3000.00;
        }else if (studentYear == 2){
            this.studentFees = 3100.00;
        }else if (studentYear == 3){
            this.studentFees = 3200.00;
        }else if (studentYear == 4){
            this.studentFees = 3300.00;
        }
    }

    public double getStudentFees() {
        return studentFees;
    }
    //endregion
    //Overridden toString method to output information about each student.
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");   //DecimalFormat object created for toString output.
        return "Student name: " + this.getName() + ", Address: " + this.getAddress() + ", Year: "
                + this.getStudentYear() + ", Fees: $" + df.format(this.getStudentFees());
    }
}
