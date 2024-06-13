import java.io.File;  
import java.io.IOException;
import java.util.Scanner;

public class Pokedex{


    public static void main (String[] args){
       System.out.println("******************************************************************************************************************************************************");
       System.out.println("------------------------------------Please extend your terminal window so the stars above appear on a single line-------------------------------------");

    
    //Choose input type
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to search by name or number?");
        String userInput = input.nextLine();
        String numberGiven = "";
        String nameGiven = "";
        do{
            if (userInput.toLowerCase().equals("number") || userInput.equals("#")) {
                System.out.println("Please enter a pokemon number between 001 - 151");
                Scanner numberinputRequest = new Scanner(System.in);
                String numberInput = input.nextLine();
                //verify that number is three digits if not try again
                    if (numberInput.length() < 3){
                        System.out.println("\nInvalid input, did you add leading zeros? ex. 025");
                    } else if (numberInput.length() > 3){
                        System.out.println("\nInvalid Input: too many digits");
                    } else {
                        numberGiven = numberInput;
                        System.out.println("\nSuccessful input test");
                    }
            } else {
                System.out.println("Please enter a Kanto Pokemon Name");
                Scanner nameinputRequest = new Scanner(System.in);
                String nameInput = input.nextLine();
            }
        }while(numberGiven == "");

        
        //take name and convert to lower
    
    //Search */Pokedex_Entries for the information provided
        //if found print reader the entry line by line to the terminal
        //if not return an error message

    //Ask if they'd like to search again
        //Yes return to input
        //No exit application

    }
}