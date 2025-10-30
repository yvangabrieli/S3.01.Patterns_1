package Nivel1;
import java.util.ArrayList;

public class Undo {
    private static Undo undo;
    ArrayList<String> history;

    private Undo (){
        history = new ArrayList<>();
    }
    public void addCommand(String command){
        if (command.isEmpty()){
            //throw new IllegalArgumentException
            System.out.println("Please insert a valid command");
        } else {
        history.add(command);}
    }
    public void undoCommand (){
        if ( history.size() <= 0 ){
            System.out.println("The list is empty");
        } else {
            history.removeLast(); }
    }
    public ArrayList<String> listCommands(){
        if (history.isEmpty()){
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < history.size(); i++){
                System.out.println(history.get(i));
            }
        }
        return history;
    }
    public static Undo getInstance(){
        if (undo == null){
         undo = new Undo();
        }
        return undo;
    }
}

