package composition;

import java.util.HashSet;
import java.util.Set;

public class mainSet {
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

        Set<Car> carSet=new HashSet<>();
        carSet.add(car);
        carSet.add(car1);
        carSet.add(car2);

        System.out.println("-----------SET------------");
        System.out.println("-----------WHOLE SET------------");
        System.out.println(carSet);
        System.out.println("---------DOES SET CONTAIN CAR2----");
        System.out.println(carSet.contains(car2));
        System.out.println("------CAN WE REMOWA CAR IF TRUE WILL BE REMOVED------");
        System.out.println(carSet.remove(car));
        System.out.println("-------");

    }
}
