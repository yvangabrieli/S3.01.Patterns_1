package Nivel2.ConcreteProducts;

import Nivel2.AbstractProducts.PhoneNumber;

public class PhoneNumberItaly implements PhoneNumber {
        private static final String PREFIX = "+39";
        private int number;

    public PhoneNumberItaly (int number) {
            if (String.valueOf(number).length() != 10){
                throw new IllegalArgumentException("the number has to have 10 digits");
            }
            this.number = number;
        }
@Override
        public String getPhoneNumber(){
            return PREFIX + String.valueOf(number);
        }
    }

