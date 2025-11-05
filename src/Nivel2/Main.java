package Nivel2;

import Nivel2.AbstractFactory.ContactFactory;
import Nivel2.AbstractFactory.Contacts;
import Nivel2.AbstractProducts.Address;
import Nivel2.AbstractProducts.PhoneNumber;
import Nivel2.ConcreteFactory.FactoryFrance;
import Nivel2.ConcreteFactory.FactoryItaly;
import Nivel2.ConcreteFactory.FactorySpain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FactorySpain spainFactory = new FactorySpain();

        Contacts pedro = new Contacts("Pedro");
        Address address = spainFactory.createAddress("Carrer", 5, "La Merce","08002" ,"Gotico", "Barcelona");
        PhoneNumber number = spainFactory.createPhoneNumber(687983345);
        pedro.setAddress(address);
        pedro.setPhoneNumber(number);
        System.out.println(pedro.showContact());
        System.out.println("--------------------------------");

        Contacts  miguel = new Contacts("Miguel");
        Address address1 = spainFactory.createAddress("Gran Via", 50, "De les Corts Catalanes","08019" ,"Bac de Roda", "Barcelona");
        PhoneNumber number1 = spainFactory.createPhoneNumber(687353345);
        miguel.setAddress(address1);
        miguel.setPhoneNumber(number1);
        System.out.println(miguel.showContact());
        System.out.println("--------------------------------");


        FactoryFrance frenchFactory = new FactoryFrance();

        Contacts paul = new Contacts("Paul");
        Address address2 = frenchFactory.createAddress("Rue", 5, "Dupont","75002" ,"Paris", "Ille de France");
        PhoneNumber number2 = frenchFactory.createPhoneNumber(687983345);
        paul.setAddress(address2);
        paul.setPhoneNumber(number2);
        System.out.println(paul.showContact());
        System.out.println("--------------------------------");


        FactoryItaly italianFactory = new FactoryItaly();
        Contacts marco = new Contacts("Marco");
        Address address3 = italianFactory.createAddress("Via", 53, "Ugo Foscolo","25052" ,"Salò del Benaco", "Brescia");
        PhoneNumber number3 = italianFactory.createPhoneNumber(3879884730L);
        marco.setAddress(address3);
        marco.setPhoneNumber(number3);
        System.out.println(marco.showContact());
        System.out.println("--------------------------------");


        Agenda miAgenda = new Agenda();
        miAgenda.addContacts(pedro);
        miAgenda.addContacts(miguel);
        miAgenda.addContacts(paul);
        miAgenda.addContacts(marco);

        miAgenda.showAllContacts();
    }
}