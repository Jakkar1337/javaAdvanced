package Composition;

public class mainArrays {
    public static void main(String[] args) {
        Car car = new Car("BMW",
                "e46",
                "Black",
                "W0111",
                "WBAEA53508CV85029");
        Car car1 = new Car("Audi",
                "s3",
                "Silver",
                "W17777",
                "WAUPEAFM1CA126136");

        Car car2 = new Car("Bentley",
                "Arnage",
                "Blue",
                "W0 00W",
                "SCBLC37F82CX08503");

        Car[] cars={car,car1,car2};
        System.out.println("-------------------Array--------------");
        for (Car iCar:cars){
            System.out.println(iCar);
        }
    }
}
