
/*@author Steve Defendre
 * @date 2023-10-29
 * @topic Dice Roller App 
 * @brief Die class to represent a single die.
 */
package diceroll;

public class Die {
    static final int DEFAULT_SIDE_COUNT = 6;
    private int dieSideCount;
    private int faceValue;

    // constructors
    public Die()
    {
        dieSideCount = DEFAULT_SIDE_COUNT;
        roll(); // immediately roll
    }

    public Die( int dieSideCount )
    {
        this.dieSideCount = dieSideCount;
        roll(); // immediately roll
    }

    // the user wants to set the face value
    public Die( int dieSideCount, int faceValue )
    {
        if (faceValue < 1 || faceValue > dieSideCount) {
            throw new IllegalArgumentException("Invalid faceValue. Must be between 1 and " + dieSideCount);
        }

        this.dieSideCount = dieSideCount;
        this.faceValue = faceValue;
    }

    public int roll()
    {
        faceValue = 1 + (int) ( Math.random() * dieSideCount );
        return faceValue;
    }
}//class Die
