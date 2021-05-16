package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int max, min;
        for (int i = 0; i < 10; i++) {
            System.out.print("Dati a[" + i + "]=");
            a[i] = sc.nextInt();

        }

        max=a[0];
        min=a[0];
        for (int i = 0; i < 10; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("elementul maxim="+max);
        System.out.println("elementul minim="+min);

    }


}
