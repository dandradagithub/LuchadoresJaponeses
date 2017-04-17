package com.unlam.dominio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearDatos
{
	public static void inicializar()
	{
		String [] datos = {"10", "300 1500", "320 1500", 
				 				 "299 1580", "330 1690", 
				 				 "330 1540", "339 1500", 
				 				 "298 1700", "344 1570", 
				 				 "276 1678", "289 1499"};
		grabarArchivo("sumo.in", datos);
	}
	
	public static void grabarArchivo(String archivo, String[] datos)
	{
		FileWriter archivoGrabar = null;
		PrintWriter grabar = null;

		try 
		{
			archivoGrabar = new FileWriter(archivo);
			grabar = new PrintWriter(archivoGrabar);
			
			for(String i : datos)
				grabar.println(i);
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				archivoGrabar.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

	}
}