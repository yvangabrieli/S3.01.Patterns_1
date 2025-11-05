package Nivel2.ConcreteFactory;

import Nivel2.AbstractFactory.ContactFactory;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.ConcreteProducts.AddressSpain;
import Nivel2.ConcreteProducts.PhoneNumberSpain;

public class FactorySpain extends ContactFactory {

    @Override
    public Address createAddress(String streetType, int number, String street, String postCode, String city, String province){
        return new AddressSpain( streetType, number, street, postCode, city, province);
    }

    @Override
    public PhoneNumber createPhoneNumber(long number){
        return new PhoneNumberSpain(number);
    }
}