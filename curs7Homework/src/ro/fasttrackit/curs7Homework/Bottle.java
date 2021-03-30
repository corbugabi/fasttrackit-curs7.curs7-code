package ro.fasttrackit.curs7Homework;

public class Bottle {

    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }


    boolean hasLiquid() {
        if (this.availableLiquid !=0) {
            return true;
        }else{
            return false;
        }
    }

    int getAvailableLiquid(){
        return this.availableLiquid;
    }

    int emptyCapacity(){
        return this.totalCapacity-this.availableLiquid;
    }

    public void openBottle(){
        if(this.open == false) {
            this.open = true;
            System.out.println("Curge");
        }else{
            System.out.println("Sunt deschisa deja");
        }
    }

    public void closeBottle(){
        if(this.open == true) {
            this.open = false;
            System.out.println("Sigilat");
        }else{
            System.out.println("Sunt inchisa deja");
        }
    }

    public void drink(int amountOfLiquid){
        if(this.open) {
            if(this.availableLiquid>=amountOfLiquid) {
                this.availableLiquid = this.availableLiquid - amountOfLiquid;
                System.out.println("S-a consumat:" + amountOfLiquid);
            }else{
                System.out.println("Umple sticla");
            }
        }else{
            System.out.println("Nu se poate");
        }
    }
}

