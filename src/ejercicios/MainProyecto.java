package ejercicios;

public class MainProyecto {

	public static void main(String[] args) 
	{	
		String [] empleados = {"pedro", "kala ", "marcos","bryan","jose", "laura", "adrian", "medrano" };
		char [] sexo={'M','F','M','M','M','F','M','M'};
		int [] horas={35, 50, 40, 45, 30, 50, 25, 30};
		System.out.println("Cantidad de empleados a procesar");
		int n=Leer.datoInt();
		double sueldo=0;
		Trabajador[] t= new Trabajador [n];
		for (int i=0; i<n;i++)
		{
			t[i] = new Trabajador(empleados[i], sexo[i], horas[i], sueldo);
			
		}
		int[] bono = new int [n];
		double [] sueld = new double[n];
		double [] impuesto = new double [n];
		double [] sueldot = new double [n];
		for(int k=0; k<n; k++)
		{
		bono=Trabajador.Bonos(t,n);
		System.out.println("Nombre " + t[k].getNombre());
		sueld=Trabajador.CalcularSueldo(t, n);
		System.out.println("sueldo del empleado["+(k+1)+"] "+sueld[k]);
		System.out.println("bono del empleado ["+(k+1)+"] "+bono[k]);
		impuesto=Trabajador.Impuestos(t, n);
		System.out.println("Impuesto "+impuesto[k] );
		sueldot=Trabajador.Sueldototal(t, n);
		System.out.println("\nSueldo total " +sueldot[k]);
		System.out.println("Cantidad de billetes y monedas entregadas ");
		Trabajador.Cantidadbilletes(t, n);
		System.out.println("------------------------------------------------------------------------");
		}	
	}

}
}