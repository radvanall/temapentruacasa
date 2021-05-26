package array;

import java.util.Scanner;
import java.util.Set;

public class Array {

    Scanner sc = new Scanner(System.in);
    int min;
    int max;
    int size;
    private int[] a;
    public void setSize()
    {
        System.out.println("Dati marimea array-ului ");
        this.size = sc.nextInt();
        while(this.size<=0)
        {
            System.out.println("Valoarea trebuie sa fie mai mare ca 0 \nDati marimea array-ului  ");
            this.size = sc.nextInt();
        }

    }

    public void setArray()
    {
        if (this.size == 0)
            setSize();
        else {
            this.a = new int[this.size];
            for (int i = 0; i < this.size; i++)
            {
                System.out.print("Dati a[" + i + "]=");
                this.a[i] = sc.nextInt();
            }
        }
    }

    public int[] getArray()
    {
        return this.a;
    }
    public void showArray()
    {
        for(int i=0;i<this.size;i++)
            System.out.println(a[i]);
    }
    public int getMin()
    {
           this.min=this.a[0];
           for (int i=0;i<this.size;i++)
           {
               if(this.a[i]<this.min)
                   this.min=this.a[i];
           }
           return this.min;
    }

    public int getMax()
    {
        this.max=this.a[0];
        for (int i=0;i<this.size;i++)
        {
            if(this.a[i]>this.max)
                this.max=this.a[i];
        }
        return this.max;
    }


}

