package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*int [] array = {12,12,5,6,7,9,23};
        int sum = 0;
        for (int num:array){
            sum +=num;

        }
        System.out.println(sum);*/
        int sum =0;
        Scanner scan = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("enter your array");
        for (int i = 0; i<array.length;i++){
            array[i] = scan.nextInt();
        }
        for(int num : array){
            sum +=num;
        }
        System.out.println("the sum of array " + sum);



    }
}
