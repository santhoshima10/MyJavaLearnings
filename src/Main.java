import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("Sunitha","Sunithapr@gmail.com","133-234234-23423"));
        contactManager.addContact(new Contact("Rathna","Sunithapr@gmail.com","133-234234-23423"));
        contactManager.addContact(new Contact("Sathya","Sunithapr@gmail.com","133-234234-23423"));
        contactManager.addContact(new Contact("Srivi","Sunithapr@gmail.com","444-555-7777"));

       Contact searchResult = contactManager.searchContact("Srivi");
       System.out.println(searchResult.phoneNumber);
       System.out.print("");


    }
}
