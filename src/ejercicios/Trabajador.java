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
		for(int i = 0; i<T.length; i++)
		{
			if(T[i].getHoras()<=40)
			{
			sueldo=T[i].getHoras()*45;
			}
			else if (T[i].getHoras()>40)
			{
			sueldo=T[i].getHoras()*45;
			}
			
			
		}
		
	}
}
