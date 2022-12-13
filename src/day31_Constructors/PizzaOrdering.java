package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        //create 100 pizza: size S, cheese topping 2 , peperoni topping 3;
        //create 100 pizza: size M, cheese topping 3, peperoni topping 4;
        //create 100 pizza: size L, cheese topping 4 , peperoni topping 5;
        // we can use loop, create  1 small then repeat 100 time.
        // ADD to array list .

        ArrayList<Pizza> pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',3,4);



            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }

        System.out.println("total number of pizza :" +pizzas.size());












    }
}
