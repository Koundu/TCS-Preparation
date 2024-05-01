//In this Project we will learn Array Operations mainly include Smallest, Largest, Second Smallest, Second Largest Elements in Array

import static java.util.Arrays.*;
import java.util.*;

class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ARR_LENG = sc.nextInt();
        int[] arr = new int[ARR_LENG];
        System.out.print("Enter Array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println("Smallest Element in Array "+arr[0]);
        System.out.println("Largest Element in Array "+arr[arr.length-1]);
        System.out.println("Second Largest Element in Array is" + arr[arr.length-2]);
        System.out.println("Second Smallest Element in Array is "+ arr[1]);
        sc.close();
    }
}