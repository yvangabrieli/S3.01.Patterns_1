package Nivel2;

import java.util.ArrayList;
import Nivel2.AbstractFactory.Contacts;

public class Agenda {
    private ArrayList<Contacts> agenda;

    public Agenda (){
        this.agenda = new ArrayList<>();
    }
    public void addContacts (Contacts contact){
        if (contact == null){
            throw new IllegalArgumentException("Cannot be null");
        }
        agenda.add(contact);
    }

    public void removeContact(String name){
        if (name == null || name.trim().isEmpty() ){
            throw new IllegalArgumentException("pls introduce a Contact to remove");
        }
        boolean remove = agenda.removeIf(c -> c.getName().equalsIgnoreCase(name.trim()));
        if (!remove) {
            System.out.println("Contact with name" + name.trim() + "not found");
        }
    }
    public void showAllContacts() {
        if (agenda.isEmpty()) {
            System.out.println("Agenda is empty.");
        } else {
            System.out.println(" Contact list:");
            for (Contacts contact : agenda) {
                System.out.println("------------------------------");
                System.out.println(contact.showContact());
            }
        }
    }

}
