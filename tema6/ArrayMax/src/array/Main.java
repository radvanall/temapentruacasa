package array;

import java.util.Scanner;

public class Main {



    public static void main(String[] args)
    {
    Array array= new Array();
    array.setSize();
    array.setArray();
    array.showArray();
    System.out.println("elementul maxim="+array.getMax());
    System.out.println("elementul minim="+array.getMin());
    }
}
