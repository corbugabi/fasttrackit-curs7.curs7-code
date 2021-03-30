package ro.fasttrackit.curs7Homework;

public class MainBottle {
    public static void main(String... args) {

        Bottle firstBottle = new Bottle(100, 40, false);
        System.out.println(firstBottle.hasLiquid());
        System.out.println(firstBottle.getAvailableLiquid());
        System.out.println(firstBottle.emptyCapacity());
        firstBottle.openBottle();
        firstBottle.closeBottle();
        firstBottle.openBottle();
        firstBottle.drink(50);
        firstBottle.openBottle();
        firstBottle.closeBottle();
        firstBottle.closeBottle();
    }
}
