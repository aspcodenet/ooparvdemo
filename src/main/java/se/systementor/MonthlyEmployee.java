package se.systementor;

public class MonthlyEmployee extends Employee {

    private int monthlySalary;

    public MonthlyEmployee(String kontonummer, String personnummer, int monthlySalary) {
        super(kontonummer, personnummer);
        this.monthlySalary = monthlySalary;
    }

    public int calculateSalary(){
        return monthlySalary;
    }


}
