/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ione
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Person("Luis Hernandez", LocalDate.of(1980, Month.MARCH, 20));
        System.out.println();
    }
    
}
