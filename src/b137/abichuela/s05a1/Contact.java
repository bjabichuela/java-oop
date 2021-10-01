package b137.abichuela.s05a1;

public class Contact {

    private String name;
    private String phoneNumber;
    private String address;

    public Contact(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact() {}

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toShow()
    {
        return "\n" + this.name + " your phone number is " + this.phoneNumber
                + " and you are residing in " + this.address;
    }
}