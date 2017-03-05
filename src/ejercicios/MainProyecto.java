package ejercicios;
import java.util.*;
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
	
		bono=Trabajador.Bonos(t,n);
		System.out.println("nombre   \tHoras trabajadas\tSexo\tSueldo\t  Bonos\tImpuestos\tSueldo total");
		
		
		for(int j=0; j<n ; j++)
		{
		System.out.print(t[j].getNombre());
		System.out.print("\t\t\t"+t[j].getHoras());
		System.out.print("\t\t  "+t[j].getSexo());
		sueld=Trabajador.CalcularSueldo(t, n);
		if (sueld[j]<1000)
		{
			System.out.print("\t $ "+sueld[j]);
		}
		if(sueld[j]>=1000)
		{
		System.out.print("\t $"+sueld[j]);
		}
		
		System.out.print("   $"+bono[j]);
		impuesto=Trabajador.Impuestos(t, n);
		System.out.print("\t  $"+impuesto[j] );
		sueldot=Trabajador.Sueldototal(t, n);
		System.out.print("\t\t$"+sueldot[j]+"\n");
		}
		System.out.println("\nTotal de \nla semana");
		
		int [] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		int [] contador = new int [9];
		int conta=0;
		int cantidad=0;
		for(int i=0; i<n; i++){
			conta= (int) sueldot[i];
			for(int j=0; j<9; j++){
				contador[j]=contador[j]+conta/billetes[j];
				cantidad=conta/billetes[j];
				conta=conta-cantidad*billetes[j];
			}
		}	
      System.out.println(Arrays.toString(contador));
      
	}
   }
    






