package b137.abichuela.s05a1;

public class Phonebook extends Contact {

    public Phonebook() {
        super();
    }
    public Phonebook(String name, String phoneNumber, String address){
        super(name, phoneNumber, address);
    }

    public String showContact(){
        return "\n Your contact information: \n name: " + super.getName() + "\n phone number: " + super.getPhoneNumber() + "\n address: " + super.getAddress() + "\n" +toShow();

    }
}