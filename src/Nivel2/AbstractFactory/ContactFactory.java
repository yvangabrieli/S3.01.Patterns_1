package Nivel2.AbstractFactory;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;

public abstract class ContactFactory{
      public abstract Address createAddress();
      public abstract  PhoneNumber createPhoneNumber();
}
