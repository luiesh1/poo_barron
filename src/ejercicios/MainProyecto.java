package ejercicios;

public class MainProyecto {

	public static void main(String[] args) 
	{
		
		String [] empleados = {"pedro", "kala ", "marcos","bryan","jose", "laura", "adrian", "medrano" };
		char [] sexo={'M','F','M','M','M','F','M','M'};
		int [] horas={30, 50, 40, 45, 30, 50, 25, 30};
		System.out.println("Cantidad de empleados a procesar");
		int n=Leer.datoInt();
		Trabajador[] t= new Trabajador [n];
		for (int i=0; i<empleados.length;i++)
		{
			t[i] = new Trabajador(empleados[i], sexo[i], horas[i]);
			
			System.out.println("sueldo del empleado["+(i+1)+"] " +Trabajador.CalcularSueldo(t));
			System.out.println("bono del empleado ["+(i+1)+"]"+Trabajador.Bonos(t));
			System.out.println("");
		}
		
	}

}