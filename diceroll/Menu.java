/*Assignment Number: 6
*Assignment Title: Dice roll App
*Program Author: Steve Defendre
*date due: 2023-10-29
* @brief Menu class to present a menu of choices to the user.
*/
//package diceroll;
import java.util.Scanner;

public class Menu {
    public static final int CHOICE_UNKNOWN = 0;
    public static final int CHOICE_SIDE_COUNT = 1;
    public static final int CHOICE_ROLL = 2;
    public static final int CHOICE_QUIT = 3;

    private String strChoices;
    private Scanner sc;
    private int choice;

    // constructors
    public Menu()
    {
        strChoices = "Make your choice:\n";
        sc = new Scanner( System.in );
        choice = CHOICE_UNKNOWN;
    }
    // display welcome message
    public void displayWelcome()
    {
        System.out.println( "Welcome to the Dice Roll App. \nThis app was created by: Steve Defendre. \nPlease choose an option below\n" );
    }
    // operations

    public void attach( String aChoice )
    {
        strChoices += aChoice;
        strChoices += "\n";
    }

    public int getUserChoice()
    {
        System.out.print( strChoices );
        System.out.print( ">>> " );
        choice = sc.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please try again.");
            choice = CHOICE_UNKNOWN;
        }
        return choice;
    }
}//class Menu
