package composition;

import java.util.ArrayList;
import java.util.List;




public class mainList {
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


        List<Car> carsList = new ArrayList();
        carsList.add(car);
        carsList.add(car1);
        carsList.add(car2);

        System.out.println("---------LIST SIZE-----------");
        System.out.println(carsList.size());

        System.out.println("--------Does list contain car1");
       if (carsList.contains(car1)){
           System.out.println("yest");
       }else {
           System.out.println("no nie ma :((");
       }

        System.out.println("---------LIST index [0]-----------");
        System.out.println(carsList.get(0));

        System.out.println("---------Whole LIST-----------");
        for (Car lCars : carsList) {
            System.out.println(lCars);
        }
    }
}

