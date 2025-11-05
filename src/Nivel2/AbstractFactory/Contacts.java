package Nivel2.AbstractFactory;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.AbstractProducts.Address;


public class Contacts {
    private String name;
    private Address address;
    private PhoneNumber number;
    public Contacts (String name, Address address, PhoneNumber number ){
        if ( name == null || name.trim().isEmpty()) {System.out.println("Name cannot be Empty or Null");}
        this.name = name.trim();
        if ( address == null) {System.out.println("Address cannot be Null");}
        this.address = address;
        if ( number == null ) {System.out.println("Number cannot be Null");}
        this.number = number;
    }
    public String showContact(){
        return ("Name: " + name + " \n Address: " + address.getAddress() + " \n Phone Number: " + number.getPhoneNumber());

    }
}
