package ejercicios;

public class Trabajador {

        
	String nombre;
	char sexo;
	int horas;
	
	
	public Trabajador(String nombre, char sexo, int horas) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.horas = horas;
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
	
	public static int CalcularSueldo(Trabajador [] T)
	{
		int sueldo = 0;
		int diferencia=0;
		for(int i = 0; i<T.length; i++)
		{
			if(T[i].getHoras()<=40)
			{
			sueldo=T[i].getHoras()*25;
			}
			else if (T[i].getHoras()>40)
			{	
			diferencia=T[i].getHoras()-40;
			diferencia=diferencia*30;
			sueldo=diferencia+1000;
			}
		}
		return sueldo;
	}
	public static int Bonos(Trabajador [] T)
	{
		int bono=0;
		for(int i=0; i<T.length; i++)
		{
		//if(T[i].getSexo() == 'f' || T[i].getSexo() == 'F')
			if(T[i].getHoras()>=25)
			{
				bono=50;
				if(T[i].getSexo() == 'f' || T[i].getSexo() == 'F')
				{
					if(T[i].getHoras()>=40);
					{
						bono=350;
					}
				}
			}
			else
			{
			bono=0;
			}
		}
		return bono;
	}
}
