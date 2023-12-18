import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int numbers = sc.nextInt();
        int[] array = new int[numbers];
        int count = 0;
        int i = 2;
        while (count==numbers){
            if (isPrime(i)){
                array = addX(array,i);
                i++;
                count++;
            }
        }
        System.out.println("20 first prime is: "+ Arrays.toString(array));

    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(a) ; i++) {
            if (a%1==0){
                return false;
            }
        }
        return true;
    }
    public static int[] addX(int myArray[], int x) {
        int i;

        // create a new array of a bigger size (+ one element)
        int newArray[] = new int[myArray.length + 1];

        // insert the elements from the old array into the new one
        for (i = 0; i < myArray.length; i++)
            newArray[i] = myArray[i];

        newArray[myArray.length] = x;
        return newArray;
    }
}
