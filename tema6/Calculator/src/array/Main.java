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


	    Adunare aPlusB=new Adunare();
        System.out.println("a+b="+aPlusB.add(a,b));
        Adunare cPlusD=new Adunare();
        System.out.println("c+d="+cPlusD.add(c,d));

        Scadere aMinusB=new Scadere();
        System.out.println("a-b="+aMinusB.dif(a,b));
        Scadere cMinusD=new Scadere();
        System.out.println("c-d="+cMinusD.dif(c,d));

        Inmultire aInmultitB=new Inmultire();
        System.out.println("a*b="+aInmultitB.mult(a,b));
        Inmultire cInmultitD=new Inmultire();
        System.out.println("c*d="+cInmultitD.mult(c,d));

        Inpartire aInpartitB=new Inpartire();
        System.out.println("a/b="+aInpartitB.div(a,b));
        Inpartire cInpartitD=new Inpartire();
        System.out.println("c/d="+cInpartitD.div(c,d));

    }
}
