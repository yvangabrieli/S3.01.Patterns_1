package Nivel3;

import Nivel3.Commands.Command;

public class Invoker {
    public void run(Command cmd){
        cmd.execute();
    }
}
