package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] a =new char[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            System.out.print("Dati a[" + i + "]=");
            a[i] = sc.nextLine().charAt(0);
        }

        for(int i=0;i<10;i++) {
          switch(a[i]){
              case 'a' :
                  System.out.println(a[i]+" Vocala"); break;
              case 'e' :
                  System.out.println(a[i]+" Vocala"); break;
              case 'i' :
                  System.out.println(a[i]+" Vocala"); break;
              case 'o' :
                  System.out.println(a[i]+" Vocala"); break;
              case 'u' :
                  System.out.println(a[i]+" Vocala"); break;
              case 'y' :
                  System.out.println(a[i]+" Vocala"); break;
              default:
                  System.out.println(a[i]+" Consoana");


          }

        }



    }
}
