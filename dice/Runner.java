package GCU.lab_1.dice;

public class Runner {

    public static void main(String[] args) {

        DiceV1 dice = new DiceV1();
        int total = dice.roll();
        int die1 = dice.die1();
        int die2 = dice.die2();
        System.out.println("first die: " + die1);
        System.out.println("second die: "+ die2);
        System.out.println("total for roll is: " + total);


    }
}
