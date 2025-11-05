package Nivel2.AbstractFactory;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.AbstractProducts.Address;


public class Contacts {
    private String name;
    private Address address;
    private PhoneNumber number;
    public Contacts (String name){
        if ( name == null || name.trim().isEmpty()) {System.out.println("Name cannot be Empty or Null");}
        this.name = name.trim();
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getName(){
        return this.name = name;
    }

    public void setPhoneNumber(PhoneNumber number) {
        this.number = number;
    }

    public String showContact(){
        return ("Name: " + name + " \n" + (address != null ? address.getAddress() : "N/A")  + " \nPhone Number: " + (number != null ? number.getPhoneNumber() : "N/A") );
    }
}
