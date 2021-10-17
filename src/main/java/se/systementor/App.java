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
