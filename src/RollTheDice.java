public class RollTheDice {

    /*  This program simulates rolling a pair of dice.
        The number that comes up on each die is output,
        followed by the total of the two dice.
    */

    private static final int Total_Score = 100;

    public static void main(String[] args) {

        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).

        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;

        //Game Main Loop
        

        System.out.println("Welcome! Let's Play Roll Dice!");
        System.out.println("Your rolls "+die1+" "+ "&"+ " " +die2);
        System.out.println("Your total roll is " + roll);

    }  // end main()

}  // end class

