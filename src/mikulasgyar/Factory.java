package mikulasgyar;

import java.util.Random;

public class Factory {

    //Field
    public int balance = 200;
    int randomNumber;
    Random random;
    int newBalance = 0;

//Constructor
    public Factory() {
        this.balance = balance;
        this.randomNumber = randomNumber;
        this.random = new Random();
    }

//Method
    public Toy produce(String color, int size){
        Toy toy = new Toy(color, size);
        randomNumber = random.nextInt(2);
        newBalance = balance;
        switch (randomNumber){
            case 0: {
                if (newBalance >= 10) {
                    balance -= 10;
                    toy = new DottedBall(color, size);
                    return toy;
                } else return null;
            }
            case 1: {
                if (balance >= 15) {
                    balance -= 15;
                    toy = new JumpingRope(color, size);
                    return toy;
                } else return null;
            }
        }

        return null;
    }

}
