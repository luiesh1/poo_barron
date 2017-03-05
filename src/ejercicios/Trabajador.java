package ejercicios;
// Jesús Alberto Loera Hernández         // Daniel Iván Sauceda López
public class Trabajador {

	private String nombre;
	private char sexo;
	private int horas;
	private double sueldo;
	
	public Trabajador(String nombre, char sexo, int horas, double sueldo) {
	
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
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public static double[] CalcularSueldo(Trabajador [] T,int n)
	{
		double diferencia=0;
		double [] sueld = new double [n];
		for(int i = 0; i<n; i++)
		{
			if(T[i].getHoras()<=40)
			{
				sueld[i]=T[i].getHoras()*25;
			}
			if(T[i].getHoras()>40)
			{
			diferencia = T[i].getHoras()-40;
			diferencia = diferencia*30;
			sueld[i]=diferencia+1000;
			}
		}
		return sueld;		
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

	public static double[] Impuestos(Trabajador [] T, int n  )
	{
		int[] bonos = new int[n];
		bonos=Trabajador.Bonos(T, n);
		double [] sueldos = new double[n];
		sueldos=Trabajador.CalcularSueldo(T, n);
		double [] imp=new double [n];
		for(int i=0; i<n ; i++)
		{
			double suelt=(double) (sueldos[i]+bonos[i]);
			if(suelt>=1500)
			{
				imp[i]=suelt*0.03;
			}
		}
		return imp;
	}
	
	public static double[] Sueldototal(Trabajador [] T , int n)
	{
		int [] bonos = new int [n];
		bonos=Trabajador.Bonos(T, n);
		double [] impuesto = new double [n];
		impuesto = Trabajador.Impuestos(T, n);
		double [] sueldos = new double [n];
		sueldos=Trabajador.CalcularSueldo(T, n);
		double [] sueldot= new double [n];
		for(int k=0; k<n; k++)
			{
				sueldot[k]= (double) ((sueldos[k]+bonos[k])-(impuesto[k]));	
			}
		return sueldot;
	   }		
   }
	

