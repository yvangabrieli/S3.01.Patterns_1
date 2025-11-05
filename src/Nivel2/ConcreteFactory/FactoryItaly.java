package Nivel2.ConcreteFactory;

import Nivel2.AbstractFactory.ContactFactory;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.ConcreteProducts.AddressItaly;
import Nivel2.ConcreteProducts.PhoneNumberItaly;

public class FactoryItaly extends ContactFactory {

    @Override
    public Address createAddress(String streetType, int number, String street, String postCode, String city, String province){
        return new AddressItaly( streetType, number, street, postCode, city, province);
    }

    @Override
    public PhoneNumber createPhoneNumber(long number){
        return new PhoneNumberItaly(number);
    }
}