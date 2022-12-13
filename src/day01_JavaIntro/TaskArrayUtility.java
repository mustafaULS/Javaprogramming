package day01_JavaIntro;

import utilities.ArrayUtility;

public class TaskArrayUtility {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7,8,9,0};
        ArrayUtility.printEachElement(arr1);
        System.out.println("----------------------");

        String [] arr2={"mustafa","ulusoy","sude","koksal"};
        ArrayUtility.printEachElement(arr2);
        System.out.println("----------------------");

        double [] arr3={12.3, 23.4,34.5,45.6,56.7};
        ArrayUtility.printEachElement(arr3);
        System.out.println("----------------------");

        char[] arr4 = {'a','s','d','f','g'};
        ArrayUtility.printEachElement(arr4);
        System.out.println("----------------------");

        int[] n1={1,2,3,4,5,6,7,8,9,10,20,30};
        int max = ArrayUtility.max(n1);
        System.out.println(max);
        System.out.println("----------------------");

        double[] n2={1.1,2.2,3.3,4.3,5.5,6.7,7.8,8.9,9.5,10.4,20.3,30.6};
        double max2 = ArrayUtility.max(n2);
        System.out.println(max2);
        System.out.println("----------------------");

        int[]a1={1,2,3,4,5,6,7,8,9};
        boolean b1=ArrayUtility.contains(a1,8);
        System.out.println("b1 = " + b1);
        System.out.println("----------------------");
        
        double[]a2={12.3,234.4,345.6,456.6,567.8};
        boolean b2=ArrayUtility.contains(a2,12.3);
        System.out.println("b2 = " + b2);





    }
}
