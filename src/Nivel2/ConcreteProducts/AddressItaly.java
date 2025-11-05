package Nivel2.ConcreteProducts;

import Nivel2.AbstractProducts.Address;

    public class AddressItaly implements Address {
        private String streetType;
        private int number;
        private String street;
        private int postCode;
        private String city;
        private String province;
        private static final String ITALY = "Italy";

        public AddressItaly (String streetType, int number, String street, int postCode, String city, String province){
            if (streetType.isEmpty() || number < 0 || street.isEmpty() || String.valueOf(postCode).length() != 5 || city.isEmpty() || province.isEmpty()){
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
            return ("Address: " + streetType + " " + street + " " + number + ", " + postCode + " " + city + " (" + province + "), " +  ITALY);
        }
    }

