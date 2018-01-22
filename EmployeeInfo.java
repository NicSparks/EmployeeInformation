
/**
 * Gathers user input and prints out desired layout of information given.
 *
 * @author Nicole Sparks
 * @version 1-22-2018
 */
import java.io.*;
import java.util.Scanner;

public class EmployeeInfo
{
    public static void EmployeeInfo(){
        String fileName = "employee.txt";
        
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
             
            // Allows user input to be used    
            Scanner keyboard = new Scanner(System.in);
            // users first name
            String firstName;
            // users lasst name
            String lastName;
            // users SSN
            String socialsecurityNumber;
            // users age
            String userAge;
            
            // user input dialog for first name
            System.out.print("Enter your first name: ");
            firstName = keyboard.next();
            
            // user input dialog for last name
            System.out.print("Enter your last name: ");
            lastName = keyboard.next();
            
            // user input dialog for SSN
            System.out.print("Enter your Social Security Number (SSN): ");
            socialsecurityNumber = keyboard.next();
            
            // user input dialog for age
            System.out.print("Enter your age: ");
            userAge = keyboard.next();
            
            // Note that write() does not automatically
            // append a newline character.
            //writes to the desired file the information given in string form
            bufferedWriter.write(firstName + ":" + lastName + ":" + socialsecurityNumber + ":" + userAge);
            
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
