package se.systementor;

public class Employee {
    private String kontonummer;
    private String personnummer;
    public Employee(String kontonummer, String personnummer) {
        super();
        this.kontonummer = kontonummer;
        this.personnummer = personnummer;
    }      

    public int calculateSalary(){
        return 0;
    }

    public void sendPayment(int belopp){
        System.out.printf("Just faking sending %d to %s\n", belopp, kontonummer);
    }


}
