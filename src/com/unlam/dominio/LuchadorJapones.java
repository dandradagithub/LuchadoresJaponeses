package com.unlam.dominio;

public class LuchadorJapones
{
	private int peso;
	private int altura;
	
	public LuchadorJapones(int p, int a) 
	{
		peso = p;
		altura = a;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public boolean DominaA(LuchadorJapones l2)
	{
		if(peso >= l2.peso && altura > l2.altura ||
		   peso > l2.peso && altura >= l2.altura)
			return true;
		else
			return false;
	}
}