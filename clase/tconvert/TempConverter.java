package com.step.converter;

public class TempConverter {
	   public double convertToFahr(double celsius) {
			return (celsius*1.8+32);
			}
		public double convertToCelsius(double fahr) {
			return ((fahr-32)/1.8);
			}
			}