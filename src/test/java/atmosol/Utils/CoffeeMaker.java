package atmosol.Utils;

import io.cucumber.plugin.event.Node;

public class CoffeeMaker {

    int coffeePowderWeight;
    int waterVolume;

    int milkVolume;

    public CoffeeMaker(int coffeePowderWeight, int waterVolume, int milkVolume) {
        this.coffeePowderWeight = coffeePowderWeight;
        this.waterVolume = waterVolume;
        this.milkVolume = milkVolume;
    }

    public CoffeeMaker() {
        this.coffeePowderWeight = 100;
        this.waterVolume = 100;
        this.milkVolume = 100;
    }


    public void TurnOnCoffeeMachine(){
        System.out.println("Coffee Machine is turned On");

    }

    public void TurnOffCoffeeMachine(){
        System.out.println("Coffee Machine is turned Off");

    }

    public void MakeCoffee(){
        System.out.println("Preparing Coffee");

    }

    public void CheckQuanityOfIngred(){
        System.out.println("Coffee Quantity is "+ coffeePowderWeight);
        System.out.println("Milk Quantity is "+milkVolume);
        System.out.println("Water Quantity is "+waterVolume);

    }



    public static void main(String[] args) {

        CoffeeMaker coffeeMakerObj = new CoffeeMaker(200, 500,250);

        coffeeMakerObj.TurnOnCoffeeMachine();;
        coffeeMakerObj.MakeCoffee();
        coffeeMakerObj.CheckQuanityOfIngred();
        coffeeMakerObj.TurnOffCoffeeMachine();

    }
}
