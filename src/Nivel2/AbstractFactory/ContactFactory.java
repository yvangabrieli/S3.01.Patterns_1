package Nivel2.AbstractFactory;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;

public abstract class  ContactFactory{
      public abstract Address createAddress(String streetType, int number, String street, String postCode, String city, String province);
      public abstract  PhoneNumber createPhoneNumber(long number);

}
