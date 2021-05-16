package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.print("Dati a[" + i + "]=");
            a[i] = sc.nextInt();
        }

        for(int i=9;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
