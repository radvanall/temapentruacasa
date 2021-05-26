package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
        double c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dati a=");
        a=sc.nextInt();
        System.out.print("Dati b=");
        b=sc.nextInt();
        System.out.print("Dati c=");
        c=sc.nextDouble();
        System.out.print("Dati d=");
        d=sc.nextDouble();

        Calculator calculator=new Calculator();
        System.out.println("a+b="+calculator.add(a,b));
        System.out.println("c+d="+calculator.add(c,d));
        System.out.println("a-b="+calculator.dif(a,b));
        System.out.println("c-d="+calculator.dif(c,d));
        System.out.println("a/b="+calculator.div(a,b));
        System.out.println("c/d="+calculator.div(c,d));
        System.out.println("a*b="+calculator.mult(a,b));
        System.out.println("c*d="+calculator.mult(c,d));
    }
}
