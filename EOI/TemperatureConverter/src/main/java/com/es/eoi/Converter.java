package com.es.eoi;

public class Converter {

	public double toFahrenheitFromCelcius(double centigrados) {

		return 32 + (9 * centigrados / 5);

	}

	public double toCelciusFromFahrenheit(double fahrenheit) {

		return (fahrenheit-32)*5/9;

	}
}
