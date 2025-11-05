package Nivel2.ConcreteProducts;
import Nivel2.AbstractProducts.PhoneNumber;
public class PhoneNumberSpain implements PhoneNumber {
        private static final String PREFIX = "+34";
        private long number;

    public PhoneNumberSpain (long number) {
            if (String.valueOf(number).length() != 9){
                throw new IllegalArgumentException("the number has to have 9 digits");
            }
            this.number = number;
        }
    @Override
        public String getPhoneNumber(){
            return PREFIX + "-" + String.valueOf(number);
        }
    }

