package main.numeros;

import java.text.DecimalFormat;
import java.util.Arrays;

import com.google.gson.Gson;

import dto.Cliente;

public class Numeros {

	public double menor(double x, double y, double z) {
		double[] array = { x, y, z };
		Arrays.sort(array);
		return array[0];
	}

	public double media(double x, double y, double z) {

		return (x + y + z) / 3;
	}

	public boolean esPrimo(long x) {
		
		boolean result=true;
		for (int i = 0; i <x; i++) {
			if ((x/i)==0)
				result=false;
		}
		return result;
	}

	public String dosDecimales(double x) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(x);
	}

	public int[] ordenaArray(int[] array) {
		Arrays.sort(array);
		return array;
	}

	public void verArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + "-");
	}
	
}
