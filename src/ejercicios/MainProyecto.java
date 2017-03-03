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
		for (int i=0; i<n;i++)
		{
			t[i] = new Trabajador(empleados[i], sexo[i], horas[i], 0);
			
		}
		Trabajador.CalcularSueldo(t, n);
		int [] bono = new int [n];
		for(int k=0; k<n; k++)
		{
		bono=Trabajador.Bonos(t,n);
		System.out.println("Nombre " + t[k].getNombre());
		System.out.println("sueldo del empleado["+(k+1)+"] "+t[k].getSueldo());
		System.out.println("bono del empleado ["+(k+1)+"] "+bono[k]);
		System.out.println("");
		}
		
		
	}

}