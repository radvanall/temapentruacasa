package com.step.array;
import java.util.Scanner;
public class ArraySum {

        public static void main(String[] args) {
            int[] a =new int[10];
            Scanner sc = new Scanner(System.in);
            int suma;
            suma=0;
            for(int i=0;i<10;i++) {
                System.out.print("Dati a[" + i + "]=");
                a[i] = sc.nextInt();
                suma += a[i];

            }


            System.out.println("suma="+suma);
        }
    }


