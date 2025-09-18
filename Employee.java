/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    public void wagePerHour(double wage){
        hourlyWage = wage;
    }
    public double hourlyPay(){
        hourlyWage = hourlyPay;
        return hourlyPay;
    }
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age=> 16){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You must wait" + (16 - age) + "years to start driving");
        }
        // to be completed
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        pay = calculatePay();
        pay = unpaidHours * hourlyWage;
        taxesAnddeduction = 30%;
        payAfterTaxes = pay;
        payAfterTaxes = pay - taxesAnddeduction;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        pay = calculatePay();
        if(pay = > 0){
            System.out.println(fullname + "has received a wire transfer of" + pay + "CAD");
            unpaidHours = 0.0;
        }
        
    }
}