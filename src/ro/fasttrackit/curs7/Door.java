package ro.fasttrackit.curs7;

public class Door {
    private boolean open;
    private boolean locked;

    public Door(){
        this.open = true;
        this.locked = false;
    }

    public void openDoor(){
        if(this.locked){
            System.out.println("Cann't be open");
        }else{
            this.open = true;
        }
    }

    public void closeDoor(){
        this.open = false;
    }

    public void lockDoor() {
        if (this.open) {
            System.out.println("Nu are sens");
        } else {
            this.locked = true;
        }
    }

    public void unlockDoor(){
            this.locked = false;
        }

    public boolean isOpen(){
        return open;
    }

    public boolean isLocked(){
        return  locked;
    }


}
