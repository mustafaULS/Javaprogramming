package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("BMW","M8","BLACK",2020,150000);

        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("mercedes","G63","BLACK",2022,200000);
        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("mercedes","c63","white",2022,170000);
        System.out.println(car3);

        //Car [] cars={car1,car2,car3}; array .

        ArrayList<Car> carsList= new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each:carsList){
            System.out.println(each.brand +" "+each.price );

        }


        System.out.println("-----------------------------------------------------");

        // recall cars :  bmw 2005-2008  toyota 1995-1997

        carsList.removeIf( p -> p.brand.equals("BMW")&& p.year>=2005&& p.year<=2008);
        carsList.removeIf( p -> p.brand.equals("TOYOTA")&& p.year>=1995&& p.year<=1997);



    }
}
