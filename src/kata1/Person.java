/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;
import java.time.LocalDate;
/**
 *
 * @author Ione
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;
    
    public Person(String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    
}
