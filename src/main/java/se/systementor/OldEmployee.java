package se.systementor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OldEmployee {
    private String kontonummer;
    private int monthlySalary;
    private String namn;

    public OldEmployee(String kontonummer,String namn,  int monthlySalary) {
        super();
        this.kontonummer = kontonummer;
        this.namn = namn;
        this.monthlySalary = monthlySalary;
    }    
    public int calculateSalary(){
        return monthlySalary;
    }
    public void sendToBankFile(int belopp){
        String path = "banktransactions.txt";
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path,true))) {
            br.write(kontonummer + ";" + belopp + "\n");
        }
        catch(IOException ex){
            System.out.println(ex);
        }        
    }
}
    

