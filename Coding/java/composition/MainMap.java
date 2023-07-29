package composition;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
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


        Map<String, Car> stringCarMap=new HashMap<>();

        stringCarMap.put("Maciek",car);
        stringCarMap.put("Kacper",car1);
        stringCarMap.put("Adam",car2);


        System.out.println("-------------------");
        System.out.println("-----MACIEK CAR IS:------------");
        System.out.println("-------------------");
        System.out.println(stringCarMap.get("Maciek"));

        System.out.println("------------Map size is equalto:---------");
        System.out.println(stringCarMap.size());
        System.out.println("-------is ther any kacper as a key----");
        System.out.println(stringCarMap.containsKey("Kacper"));

        System.out.println("---------is there any car1 as a value?----");
        System.out.println(stringCarMap.containsValue(car1));

        System.out.println("------set of keys:-------");
        System.out.println(stringCarMap.keySet());

        System.out.println("-----set of cars");

    }
}
