/*Assignment Number: 6
*Assignment Title: Dice roll App
*Program Author: Steve Defendre
*date due: 2023-10-23
 *Main driver to test the DicePair and Menu classes.
 */
package diceroll;

public class Main {

    public static void main(String[] args) {
        int dieSideCount = 6;
        DicePair pair = new DicePair( dieSideCount );
        int total = pair.roll();
        System.out.println( "total " + total );

        Menu menu = new Menu();
        menu.attach( "1 Change Side Count" );
        menu.attach( "2 Roll" );
        menu.attach( "3 Quit" );

        int choice = Menu.CHOICE_UNKNOWN;
        while ( choice != Menu.CHOICE_QUIT ) {
            choice = menu.getUserChoice();
            switch( choice ) {
                case Menu.CHOICE_SIDE_COUNT:
                    //ask for new dieSideCount
                    dieSideCount = menu.getUserChoice();
                    // For debugging puposes, double the sides of the dice:
                    dieSideCount = dieSideCount * 2; //DEBUG
                    pair = new DicePair( dieSideCount );
                    break;

                case Menu.CHOICE_ROLL:
                    total = pair.roll();
                    System.out.println( "total " + total );
                    break;

                case Menu.CHOICE_QUIT:
                    System.out.println( "Bye!" );
                    break;

                default:
                    //warn about internal application logic error
                    System.out.println("Internal application logic error");
                    break;
            }//switch
        }//while


    }//main

}//class Main
