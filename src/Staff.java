import java.text.DecimalFormat;

public class Staff extends Person{
    private int staffYears;
    private double staffSalary = 50000.00; //initializing staffSalary at base 50000.00

    //Default constructor (no parameters used)
    public Staff() {}

    //region Getters and setters
    public void setStaffYears(int staffYears){
        this.staffYears = staffYears;
    }
    public int getStaffYears(){
        return staffYears;
    }

    //setter created with staffYears as parameter
    public void setStaffSalary(int staffYears){
        //iterating through a for loop starting at 0 to add 500 to the base pay initialized in the staffSalary variable.
        //will iterate through the loop for as many years entered and will add 500 to staffSalary.
        for(int i = 0; i < staffYears; i++){
            this.staffSalary += 500;
        }
    }

    public double getStaffSalary(){
        return staffSalary;
    }
    //endregion

    //Overridden toString method to output information about each staff member.
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");   //DecimalFormat object created for toString output.
        return "Staff name: " + this.getName() + ", Address: " + this.getAddress() + ", Years: "
                + this.getStaffYears() + ", Pay: $" + df.format(this.getStaffSalary());
    }
}
