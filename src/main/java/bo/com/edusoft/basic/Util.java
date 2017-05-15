/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.edusoft.basic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;

/**
 *
 * @author Eduardo F. Sandino
 */
public class Util {

    public static Integer getCurrentMonth() {
        DateTime jodaDateTime = new DateTime();
        return jodaDateTime.getMonthOfYear();
    }

    public static Integer getLastDayOfMonth(Integer month, Integer year) {
        write("MainApp:getLastDayOfMonth(month[" + month + "],year[" + year + "])");
        //Integer currentMonth = getCurrentMonth();
        //Integer year = 2017;
        DateTime currentMonthYear = new DateTime(year, month, 1, 0, 0, 0, 0);
        write("currentMonthYear[" + currentMonthYear + "]");

        write(String.valueOf(currentMonthYear.dayOfMonth().getDateTime().getDayOfMonth()));
        return currentMonthYear.dayOfMonth().withMaximumValue().dayOfMonth().get();
    }

    public static void write(String x) {
        System.out.println(x);
    }

    public static String read() {
        byte[] data = new byte[100];
        try {
            System.in.read(data);
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        String x = new String(data);
        return x.trim();
    }

}
