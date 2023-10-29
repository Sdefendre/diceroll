/*
 * @topic  Dice Roller App
 * @brief  Class to represent a pair of dice.
 */
package diceroll;

public class DicePair {
    // data fields
    private Die dieOne;
    private Die dieTwo;

    // constructors:
    // construct dice with equal number of sides
    public DicePair(int dieSideCount)
    {
        dieOne = new Die( dieSideCount );
        dieTwo = new Die( dieSideCount );
    }

    // construct dice with unequal number of sides
    public DicePair(int numberOfSides, int numberOfSides2)
    {
        dieOne = new Die(numberOfSides);
        dieTwo = new Die(numberOfSides2);
    }

    // operations
    // generate new combination
    public int roll()
    {
        int total = dieOne.roll() + dieTwo.roll();
        return total;
    }

// obtain reference to a particular die object
public Die getDieObject(int index) {
    if (index == 1) {
        return dieOne;
    } else if (index == 2) {
        return dieTwo;
    } else {
        // report application logic error and throw an exception
        System.out.println("Internal application logic error");
        throw new IllegalArgumentException("index must be 1 or 2");
    }
}
}//class DicePair
