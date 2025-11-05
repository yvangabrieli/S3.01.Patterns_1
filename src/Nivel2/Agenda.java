package Nivel2;

import java.util.ArrayList;
import Nivel2.AbstractFactory.Contacts;

public class Agenda {
    private ArrayList<Contacts> agenda;

    public Agenda (ArrayList<Contacts> agenda){
        this.agenda = new ArrayList<Contacts>();
    }
    public void getList(){
        System.out.println(agenda);
    }
}
