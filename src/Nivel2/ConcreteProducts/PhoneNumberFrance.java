package Nivel2.ConcreteProducts;

import Nivel2.AbstractProducts.PhoneNumber;

public class PhoneNumberFrance implements PhoneNumber {
    private static final String PREFIX = "+33";
    private int number;

    public PhoneNumberFrance (int number) {
        if (String.valueOf(number).length() != 9){
            throw new IllegalArgumentException("the number has to have 9 digits");
        }
        this.number = number;
    }
    @Override
    public String getPhoneNumber(){
            return PREFIX + String.valueOf(number);
}
}
