import java.io.File;  
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pokedex{


    public static void main (String[] args){
       System.out.println("******************************************************************************************************************************************************");
       System.out.println("------------------------------------Please extend your terminal window so the stars above appear on a single line-------------------------------------");
       System.out.println("----------------------------------------For best ASCII art quality, please choose a light mode terminal theme-----------------------------------------");
    
    //Choose input type
        //TO-DO these should probably be separate functions
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to search by name or number?");
        String userInput = input.nextLine();
        
        
        if (userInput.toLowerCase().equals("number") || userInput.equals("#")) {
            pokeSearchNum(); 
        } else {
            pokeSearchName();
        }

    }

    private static void pokeSearchNum() {
        System.out.println("Please enter a pokemon number between 001 - 151");
        String numberInput = "";
        do{
            Scanner numberinputRequest = new Scanner(System.in);
            numberInput = numberinputRequest.nextLine();
            if (numberInput.length() < 3){
                System.out.println("\nInvalid input, did you add leading zeros? ex. 025");
            } else if (numberInput.length() > 3){
                System.out.println("\nInvalid Input: too many digits");
            } else {
                System.out.println("\nSuccessful number input test");
            }
        } while (numberInput == "");
    }

    private static void pokeSearchName() {
        System.out.println("Please enter a Kanto Pokemon Name");
        String nameInput = "";
        do{
            Scanner nameinputRequest = new Scanner(System.in);
            nameInput = nameinputRequest.nextLine();
            System.out.println("\nSuccessful name input test");
        } while (nameInput == "");
    }

    //take name and convert to lower
    
    //Search */Pokedex_Entries for the information provided
        //if found print reader the entry line by line to the terminal
        //if not return an error message

    //Ask if they'd like to search again
        //Yes return to input
        //No exit application

}