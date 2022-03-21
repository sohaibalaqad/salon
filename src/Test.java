
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Create Arrays to temporarily store sessions and Customers
        ArrayList<Customers> arrayOfCustomer = new ArrayList<>();
        ArrayList<Sessions> arrayOfSession = new ArrayList<>();

        // Create a file to store your customers permanently
        File customersData = new File("customers.txt");
        // Define the write object to the file
        PrintWriter printWriter = new PrintWriter(customersData);
        
        // Check for the existence of the file before creating it
        if (customersData.createNewFile()) {
            System.out.println("File created: " + customersData.getName());
        } else {
            System.out.println("customers.txt file already exists.");
        }
        
        // Create a file to store your Sessions permanently
        File sessionsData = new File("Sessions.txt");
        // Define the write object to the file
        PrintWriter printWriterSessions = new PrintWriter(sessionsData);
        
        // Check for the existence of the file before creating it
        if (sessionsData.createNewFile()) {
            System.out.println("File created: " + sessionsData.getName());
        } else {
            System.out.println("Sessions.txt file already exists.");
        }
        
        // Reading from the user
        Scanner input = new Scanner(System.in);
        
        // while to run the code continuously
        boolean doLoop = true;
        while (doLoop) {
            System.out.println("************************************************");
            System.out.println("|            Salon system , Hi                 |");
            System.out.println("************************************************");
            System.out.println("1. Add a new Session .\n2. Show all Sessions .\n3. Show all Customers .\n4. Exit.");
            System.out.println("Choose one of the following options : ");
            
            // Enter a choice from the user and verify the validity of the entry
            int option = input.nextInt();
            switch (option) {
                case 1:
                    String type = "nothing";
                    Double price = 0.0;
                    System.out.println("Choose the type you want:"
                            + "\n1.Hair care.\n2.Skin care.\n3.makeup\n4.Nail care.");
                    int choise = input.nextInt();
                    System.out.println("Enter customer name: ");
                    String name = input.next();
                    System.out.println("Enter customer year of birth: ");
                    int yearofbirth = input.nextInt();
                    System.out.println("Enter session date: ");
                    String date = input.next();
                    System.out.println("Enter session duration: ");
                    double duration = input.nextDouble();
                    Departments department = new Departments(type, price, choise);
                    Customers customer = new Customers(name, yearofbirth);
                    Sessions session = new Sessions(date, duration, customer, department);
                    
                    // Storing objects in the custom arrays
                    arrayOfSession.add(session);
                    arrayOfCustomer.add(customer);
                    
                    // Storing objects in the custom Files
                    for (int i = 0; i < arrayOfCustomer.size(); i++) {
                        printWriter.println(arrayOfCustomer.get(i).toString());
                    }
                    printWriter.close();
                    for (int i = 0; i < arrayOfSession.size(); i++) {
                        printWriterSessions.println(arrayOfSession.get(i).toString());
                    }
                    printWriterSessions.close();
                    break;
                case 2:
                    // Reading from the file 
                    Scanner myReaderSession = new Scanner(sessionsData);
                    while (myReaderSession.hasNextLine()) {
                        String data = myReaderSession.nextLine();
                        System.out.println(data);
                    }
                    myReaderSession.close();
                    break;
                case 3:
                    // Reading from the file
                    Scanner myReader = new Scanner(customersData);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("!! EXIT !!");
                    doLoop = false;
                    break;
            }
        }
    }
}
