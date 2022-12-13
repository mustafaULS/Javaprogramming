package day27_WrapperClasses;

public class Task1 {

    public static void main(String[] args) {


    }

    public static int [] insert(int [] array,int index,int element){

        // this if for the range .
        if (index<0||index> array.length-1){
            System.out.println("Invalid number");
            System.exit(0);
        }
        array[index]=element;
        return array;

    }



}
/*
1. Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}
 */
