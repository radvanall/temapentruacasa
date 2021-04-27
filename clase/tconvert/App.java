package com.step.converter;

public class App {
        public static void main(String[] args){
		TempConverter tempConverter = new TempConverter();
		double fahrenheit =tempConverter.convertToFahr(100);
		System.out.println("temperature in Fahrenheit ="+fahrenheit +" F");
		double cels =tempConverter.convertToCelsius(100);
		System.out.println("temperature in Celsius ="+cels +" C");
		}
}

		