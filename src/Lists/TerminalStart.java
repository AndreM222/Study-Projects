package Lists;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class TerminalStart {
    
    EmployeesList employeesList = new EmployeesList();
    String[] commandList = new String[5];
    Scanner inputSC = new Scanner(System.in);
    String inputCommand;


    public void startTerminal() {
        
        commandList[0] = "help";
        commandList[1] = "create";
        commandList[2] = "exit";
        commandList[3] = "show list";
        commandList[4] = "show";
        
        // ---- commands
        
        System.out.println("---------- Type ( help ) For List Of Commands ----------");


        inputCommand = inputSC.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        if(inputCommand.equals(commandList[0])){

            System.out.println("------------------- All Commands ------------------------");
            
            for(int i = 0; i < commandList.length; i++){

                System.out.println("\n- " + commandList[i]);
                

            }
            
            inputCommand = inputSC.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } else if (inputCommand.equals(commandList[1])) {

            if(employeesList.createEmployeesList()){
                
                startTerminal();

            }

        } else if(inputCommand.equals(commandList[2])){

            System.out.println("Exiting..... "); 
            
        } else if(inputCommand.equals(commandList[3])){ 
            
            employeesList.showEmployeesList();
            System.out.println("------Enter To Return------");
            inputCommand = inputSC.nextLine();
            startTerminal();
        
        } else { startTerminal(); }

        inputSC.close();

    }

}
