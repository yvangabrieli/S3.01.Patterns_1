package Nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Undo undo;
    private final Scanner scanner;
    private boolean exit;

    public Menu() {
        this.undo = Undo.getInstance();
        this.scanner = new Scanner(System.in);
        this.exit = false;
    }

    public void start() {
        while (!exit) {
            byte option = getOption();
            useOption(option);
        }
    }

    public byte getOption() {
        byte option = -1;
        do {
            System.out.println("Choose an Option: ");
            System.out.println("1. Add a command");
            System.out.println("2. Undo the command");
            System.out.println("3. List of commands");
            System.out.println("0. Exit");
            try {
                option = scanner.nextByte();
                scanner.nextLine();
                if (option < 0 || option > 3) {
                    System.out.println("Invalid Option");
                }
            } catch (Exception e) {
                System.out.println("Invalid Entry.");
                scanner.nextLine();
            }
        } while (option < 0 || option > 3);
        return option;
    }

    public void useOption(byte option) {
        switch (option) {
            case 1:
                String commandToAdd = "";
                if (commandToAdd.isEmpty()) {
                    System.out.println("- Please add the command: ");
                    do {
                        System.out.println("Command line cannot be empty");
                        commandToAdd = scanner.nextLine();
                    }
                    while (commandToAdd.isEmpty());
                }
                undo.addCommand(commandToAdd);
                System.out.println("Command added Successfully.");
                break;
            case 2:
                undo.undoCommand();
                System.out.println("Last command has been undo");
                break;
            case 3:
                undo.listCommands();
                break;
            case 0:
                System.out.println("Exit program!");
                exit = true;
                break;
            default:
                System.out.println("Something wrong");
        }
    }
}