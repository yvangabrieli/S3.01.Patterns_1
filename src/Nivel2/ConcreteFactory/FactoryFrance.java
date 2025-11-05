package Nivel2.ConcreteFactory;

import Nivel2.AbstractFactory.ContactFactory;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.ConcreteProducts.AddressFrance;
import Nivel2.ConcreteProducts.PhoneNumberFrance;

public class FactoryFrance extends ContactFactory {

@Override
    public  Address createAddress(String streetType, int number, String street, String postCode, String city, String province){
return new AddressFrance( number,  street, postCode,  city);
    }

@Override
public PhoneNumber createPhoneNumber(long number){
    return new PhoneNumberFrance(number);
    }
}
