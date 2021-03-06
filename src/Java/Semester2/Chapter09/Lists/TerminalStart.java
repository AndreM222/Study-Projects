package Java.Semester2.Chapter09.Lists;

import java.util.Scanner;

public class TerminalStart {

    // ----------------------- Properties -----------------------

    EmployeesList employeesList = new EmployeesList();
    String[] commandList = new String[6];
    String[] description = new String[6];
    Scanner inputSC = new Scanner(System.in);
    String inputCommand;

    // ----------------------- Init -----------------------

    public TerminalStart() {

        // ---- commands

        commandList[0] = "help"; description[0] = "Show Commands";
        commandList[1] = "create"; description[1] = "Create new list of employees";
        commandList[2] = "exit"; description[2] = "Stop terminal";
        commandList[3] = "show list"; description[3] = "Show all employees";
        commandList[4] = "find"; description[4] = "Find Employee";
        commandList[5] = "clear"; description[5] = "Clear terminal";

    }

    // ----------------------- Functions -----------------------

    public void startTerminal() {

        System.out.println("---------- Type ( help ) For List Of Commands ----------");

        inputCommand = inputSC.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if (inputCommand.equals(commandList[0])) {

            System.out.println("------------------- All Commands ------------------------");

            for (int i = 0; i < commandList.length; i++) {

                System.out.println("\n- " + commandList[i] + "   -   " + description[i]);

            }

            System.out.print("------Enter To Return------");
            inputCommand = inputSC.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } else if (inputCommand.equals(commandList[1])) {

            if (employeesList.createEmployeesList()) { startTerminal(); }

        } else if (inputCommand.equals(commandList[2])) {

            System.out.println("Exiting..... ");

        } else if (inputCommand.equals(commandList[3])) {

            employeesList.showEmployeesList();
            System.out.print("------Enter To Return------");
            inputCommand = inputSC.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            startTerminal();

        } else if (inputCommand.equals(commandList[4])) {

            employeesList.findEmployee();
            System.out.print("------Enter To Return------");
            inputCommand = inputSC.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            startTerminal();

        } else if (inputCommand.equals(commandList[5])){

            startTerminal();
            
        } else {

            startTerminal();

        }

        inputSC.close();

    }

}
