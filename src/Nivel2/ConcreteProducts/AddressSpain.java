package Nivel2.ConcreteProducts;

import Nivel2.AbstractProducts.Address;

public class AddressSpain implements Address {
    private String streetType;
    private int number;
    private String street;
    private String postCode;
    private String city;
    private String province;
    private static final String SPAIN = "Spain";

    public AddressSpain (String streetType, int number, String street, String postCode, String city, String province){
        if (streetType.isEmpty() || number < 0 || street.isEmpty() || !postCode.matches("\\d{5}") || city.isEmpty() || province.isEmpty()){
            throw new IllegalArgumentException("Invalid input");
        }
        this.streetType = streetType;
        this.number = number;
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.province = province;
    }
    @Override
    public String getAddress(){
        return ("Address: " + streetType + " " + street + " " + String.valueOf(number) + ", " + String.valueOf(postCode) + " " + city + " (" + province + "), " +  SPAIN);
    }
}