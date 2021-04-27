package com.step.calculator;

import com.step.comparator.NumbersComparator;

public class App {
	public static void main(String[] args){
		int a=70,b=37;
		Calculator calcul=new Calculator();
		System.out.println("a+b="+calcul.sum(a,b));
		System.out.println("a-b="+calcul.dif(a,b));
		System.out.println("a*b="+calcul.produs(a,b));
		System.out.println("a/b="+calcul.inpartire(a,b));
		
       	NumbersComparator compara = new NumbersComparator();
		System.out.println("Maximul este "+compara.maxim(a,b));
		System.out.println("Minimul este "+compara.minim(a,b));
	}
}

		
	