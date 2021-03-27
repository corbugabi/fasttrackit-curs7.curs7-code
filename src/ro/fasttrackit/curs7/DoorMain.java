package ro.fasttrackit.curs7;

public class DoorMain {
    public static void main(String... args) {
        Door myDoor = new Door();

        myDoor.openDoor();
        System.out.println(myDoor);
        myDoor.unlockDoor();
        myDoor.openDoor();
        System.out.println();

    }
}
