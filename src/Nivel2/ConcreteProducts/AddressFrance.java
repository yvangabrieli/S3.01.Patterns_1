package Nivel2.ConcreteProducts;
import Nivel2.AbstractProducts.Address;
public class AddressFrance implements Address {
    private int number;
    private String street;
    private String postCode;
    private String city;
    private static final String FRANCE = "France";

    public AddressFrance (int number, String street,String postCode, String city){
        if (number < 0 || street.isEmpty() || !postCode.matches("\\d{5}") || city.isEmpty()){
            throw new IllegalArgumentException("Invalid input");
        }
        this.number = number;
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    @Override
    public String getAddress(){
        return ("Address: " + String.valueOf(number) + " " + street + ", " + String.valueOf(postCode) + " " + city + ", " +  FRANCE);
    }
}
