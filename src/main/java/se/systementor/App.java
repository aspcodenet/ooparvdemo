package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ArrayList<OldEmployee> employees  = new  ArrayList<>();
        employees.add(new OldEmployee("12345", "Stefan", 10000));
        employees.add(new OldEmployee("55511", "Oliver", 4000));
        employees.add(new OldEmployee("555781", "Josefine", 5000));

        for ( OldEmployee employee : employees){
            int belopp = employee.calculateSalary();
            employee.sendToBankFile(belopp);
        }
        System.out.println("Lönekörnngen klar");
        












        var oliver = new HourlyEmployee("12345", "0805280000", 120);
        oliver.setHoursWorked(20);
        var stefan = new MonthlyEmployee("11122", "7208030000", 10000);
        var josefine = new HourlyEmployee("555588", "0203300000", 130);
        josefine.setHoursWorked(30);

        var allEmployees = new ArrayList<Employee>(Arrays.asList(oliver,stefan,josefine));

        //Polymorphism 
        for(Employee x : allEmployees ){
            int salary = x.calculateSalary();
            x.sendPayment(salary);
        }



        System.out.println("Hello World!");
    }
}
