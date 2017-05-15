/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.edusoft.basic;

import java.io.IOException;

/**
 *
 * @author Eduardo F. Sandino
 */
public class MainApp {

    
    
    public static void main(String[] args) throws IOException {
        Util.write("Welcome to Last Day Finder !");
        Util.write("Write a Year:");
        String strYear = Util.read();
        Integer year = Integer.parseInt(strYear);
        
        Util.write("Write the Month (1..12):");
        String strMonth = Util.read();
        Integer month = Integer.parseInt(strMonth);
        
        Integer ld = Util.getLastDayOfMonth(month,year);
        System.out.println("Las Day of the month is:" + ld);
    }
}
