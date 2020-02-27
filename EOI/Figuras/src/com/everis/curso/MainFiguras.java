package com.everis.curso;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figuras fig[]=new Figuras[4];
		fig[0]=new Rectangulo(5.0,2.0);
		fig[1]=new Circulo(3);
		fig[2]=new Cuadrado(5);
		fig[3]=new Triangulo(2,8);
		
		Figuras fMayor=figuraMayor(fig);
		System.out.println("El area mayor es "+fMayor.area());
		
	}
	
	public static Figuras figuraMayor(Figuras[] fig) {
		
		Figuras ret_fig = new Figuras();
		for (int i = 0; i < fig.length; i++) {
			if (fig[i].area()>ret_fig.area())
				ret_fig=fig[i];
		}
		return ret_fig;
	}
}
