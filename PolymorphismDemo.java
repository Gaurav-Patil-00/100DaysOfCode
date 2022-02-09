//overloading and overriding
abstract class CafeCoffeeDay {
    abstract void coffeeMaking();

    abstract void FranchiseModel();

    void exportsFromCCD() {
        System.out.println("Products Directly Delivered to Franchise!");
    }
}

class CCDFranchise extends CafeCoffeeDay {

    void coffeeMaking() {
        System.out.println("Coffee Making Produre as per CCD guidines");
    }

    void coffeeMaking(String Location) {
        System.out.println(Location + " Specialized franchise as per CCD guidlines");
    }

    void FranchiseModel() {
        System.out.println("Franchise Model Building guidlines as per CCD");
    }

}

public class PolymorphismDemo {

    public static void main(String[] args) {
        CafeCoffeeDay ccd = new CCDFranchise();
        ccd.coffeeMaking();
        ccd.FranchiseModel();
        ccd.exportsFromCCD();
        new CCDFranchise().coffeeMaking("Pune");
    }

}