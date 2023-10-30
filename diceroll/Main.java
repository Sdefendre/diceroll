/*Assignment Number: 6
*Assignment Title: Dice roll App
*Program Author: Steve Defendre
*date due: 2023-10-23
 *Main driver to test the DicePair and Menu classes.
 */
//package diceroll;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int dieSideCount = 6;
        DicePair pair = new DicePair( dieSideCount );
        int total = pair.roll();
        //System.out.println( "total " + total );

        Menu menu = new Menu();
        menu.attach( "1 Change Side Count" );
        menu.attach( "2 Roll" );
        menu.attach( "3 Quit" );

        int choice = Menu.CHOICE_UNKNOWN;
        menu.displayWelcome();
        while ( choice != Menu.CHOICE_QUIT ) { 
            
            choice = menu.getUserChoice();
           
            switch( choice ) {
                case Menu.CHOICE_SIDE_COUNT:
                    //ask for new dieSideCount
                    System.out.println("Enter new die side count: ");
                    Scanner sc = new Scanner(System.in);
                    dieSideCount = sc.nextInt();
                    // For debugging puposes, double the sides of the dice:
                    dieSideCount = dieSideCount * 2; //DEBUG
                    System.out.println("New die side count: " + dieSideCount);  // Display new dieSideCount
                    pair = new DicePair( dieSideCount );
                    break;

                case Menu.CHOICE_ROLL:
                    total = pair.roll();
                    System.out.println( "Total roll: " + total );
                    break;

                case Menu.CHOICE_QUIT:
                    System.out.println( "Bye!" );
                    break;

                default:
                    //warn about internal application logic error
                    System.out.println("choose a valid number between 1 and 3");
                    break;
            }//switch
        }//while


    }//main

}//class Main
