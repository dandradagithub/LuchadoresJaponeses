package com.unlam.test;
import com.unlam.dominio.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestDominio 
{
	public static void main(String[] args)
	{
		CrearDatos.inicializar();
		
		File sumo = new File("sumo.in");
		Scanner leer = null;
		LuchadorJapones [] luchadores = null;
		String linea = null;
		int i = 0, k = 0, contDomina, peso = 0, altura = 0;
		String [] dominadores = null;
		
		try 
		{
			leer = new Scanner(sumo);
			
			int cant = Integer.parseInt(leer.nextLine());
			luchadores = new LuchadorJapones[cant];
			dominadores = new String [cant];
			
			while(leer.hasNextLine())
			{
				linea = leer.nextLine();
				peso = Integer.parseInt(linea.substring(0, 3));
				altura = Integer.parseInt(linea.substring(4, 8));
				
				luchadores[i] = new LuchadorJapones(peso, altura);
				i++;
			}
			
			for(LuchadorJapones l : luchadores)
			{
				contDomina = 0;
				
				for(LuchadorJapones j : luchadores)
				{
					if(l.DominaA(j)) 
						contDomina++;
				}
				
				dominadores[k] = Integer.toString(contDomina);
				k++;
			}
			
			for(String d : dominadores)
				System.out.println(d);
			
			CrearDatos.grabarArchivo("sumo.out", dominadores);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			leer.close();
		}
	}
}
