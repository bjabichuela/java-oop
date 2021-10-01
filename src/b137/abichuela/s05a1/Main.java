package b137.abichuela.s05a1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);

        Phonebook info = new Phonebook();

        while (true) {

            System.out.println("\n Type 'yes' to continue and 'end' to quit.");
            a = input.nextLine();

            if(a.equals("yes")) {
                System.out.println("Enter your name: ");
                info.setName(input.nextLine());
                System.out.println("Enter your phone number: ");
                info.setPhoneNumber(input.nextLine());
                System.out.println("Enter your address: ");
                info.setAddress(input.nextLine());

                // ArrayList of objects
                ArrayList<Phonebook> contact = new ArrayList<Phonebook>();

                // Get info
                Phonebook list = new Phonebook(info.getName(), info.getPhoneNumber(), info.getAddress());

                // Add objects
                contact.add(list);

                // Display contents of objects
                for (Phonebook contacts : contact) {
                    System.out.println(contacts.showContact());
                }
            }
            else{
                break;
            }

        } System.out.println("\n---END---\n" + "\n");
    }
}
