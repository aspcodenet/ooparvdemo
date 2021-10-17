package se.systementor;

public class HourlyEmployee extends Employee {
    private int hourlySalary;
    private int hoursWorked;

    public HourlyEmployee(String kontonummer, String personnummer, int hourlySalary) {
        super(kontonummer,personnummer);
        this.hourlySalary = hourlySalary;
    }

    public void setHoursWorked(int hours){
        this.hoursWorked = hours;
    }

    public int calculateSalary(){
        return hourlySalary * hoursWorked;
    }

    
}
