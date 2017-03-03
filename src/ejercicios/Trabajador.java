package ejercicios;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Trabajador {

        
	private String nombre;
	private char sexo;
	private int horas;
	private double sueldo;
	
	
	public Trabajador(String nombre, char sexo, int horas, double sueldo) 
	{
		this.nombre = nombre;
		this.sexo = sexo;
		this.horas = horas;
		this.sueldo = sueldo;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setSueldo(double sueldo)
	{
		this.sueldo=sueldo;
	}
	public double getSueldo()
	{
		return sueldo;
	}
	
	
	public static void  CalcularSueldo(Trabajador [] T,int n)
	{
		double sueldo = 0;
		double diferencia=0;
		for(int i = 0; i<n; i++)
		{
			if(T[i].getHoras()<=40)
			{
			sueldo=T[i].getHoras()*25;
			}
			else if (T[i].getHoras()>40)
			{	
			diferencia = T[i].getHoras()-40;
			diferencia = diferencia*30;
			sueldo=diferencia+1000;
			}
			T[i].setSueldo(sueldo);
		}
	}
	public static int [] Bonos(Trabajador [] T, int n)
	{
		int [] bon = new int [n];
		int bono=0;
		for(int i=0; i<n; i++)
		{
			if(T[i].getHoras()>=25)
			{
				bono=50;
				bon[i]=bono;
				if(T[i].getSexo()=='f' || T[i].getSexo() == 'F')
				{
					if(T[i].getHoras()>=40);
					{
						bono=350;
						bon[i]=bono;
					
					}
				}
			}	
		}
		return bon ;
	}
	public static [] double Impuesto(Trabajador [] T, int n)
	{
		
	}
}
