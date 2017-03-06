package ejercicios;
import java.util.*;
public class MainProyecto {

	 public static void main(String[] args) {
	        Calendar fecha = new GregorianCalendar();
	        int año = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH);
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        String[] empleados = {"Alberto", "kala ", "marcos", "bryan", "jose", "laura", "adrian", "medrano"};
	        char[] sexo = {'M', 'F', 'M', 'M', 'M', 'F', 'M', 'M'};
	        int[] horas = {35, 50, 40, 45, 30, 50, 25, 30};
	        System.out.println("Cantidad de empleados a procesar");
	        int n = Leer.datoInt();
	        double sueldo = 0;
	        Trabajador[] t = new Trabajador[n];
	        for (int i = 0; i < n; i++) {
	            t[i] = new Trabajador(empleados[i], sexo[i], horas[i], sueldo);

	        }

	        double[] bono = new double[n];
	        double[] sueld = new double[n];
	        double[] impuesto = new double[n];
	        double[] sueldot = new double[n];
	        System.out.printf("%60s","Agrícola Del Valle");
	        System.out.println("");
	        System.out.printf("%70s","Nomina de empleados temporales");
	        System.out.println("");
	        System.out.printf("%75s","correspondiente a la semana del  "+dia+"/"+(mes+1)+"/"+año+" al ");
	        if(mes==2 && dia>29)
	        {
	            mes=mes+1;
	        }
	        if((mes==1 || mes ==3 || mes == 7 || mes==8 || mes == 10) && dia>31){
	            dia=1;
	            mes= mes+1;
	        }
	        if((mes==4 || mes==5 || mes==6 || mes==9 || mes==11 || mes== 12)& dia>30){
	            dia=1;
	            mes= mes+1;
	        }
	        System.out.print((dia+7)+"/"+(mes+1)+"/"+año);
	        System.out.println("");
	        System.out.println("");
	        bono = Trabajador.Bonos(t, n);
	//
	        System.out.printf("%-15s %17s %14s %15s %15s %17s %20s", "NOMBRE", "HORAS TRABAJADAS", "SEXO", "SUELDO", "BONOS", "IMPUESTOS", "SUELDO TOTAL\n");

	        for (int j = 0; j < n; j++) {
	            System.out.printf("%-15s", t[j].getNombre());
	            System.out.printf("%15d", t[j].getHoras());
	            System.out.printf("%15c", t[j].getSexo());
	            sueld = Trabajador.CalcularSueldo(t, n);
	            if(sueld[j]>=1000)
	            {
	                System.out.printf("%12s%.2f","$", sueld[j]);
	            }
	            if(sueld[j]<1000)
	            {      
	                  System.out.printf("%13s%.2f","$", sueld[j]);
	            }
	            System.out.printf("%11s%.2f","$", bono[j]);
	            impuesto = Trabajador.Impuestos(t, n);
	            if(impuesto[j]==0)
	            {
	            System.out.printf("%12s %.2f","$",impuesto[j]);
	             }
	            else{
	                System.out.printf("%10s %.2f","$",impuesto[j]);
	            }
	            sueldot = Trabajador.Sueldototal(t, n);
	            System.out.printf("%12s %.2f","$", sueldot[j]);
	            System.out.println(" ");
	        }
	        System.out.println("");
	        System.out.printf("%-15s", "TOTAL SEMAMANA");

	        int totalh = 0;
	        double sueldoto = 0;
	        double bonot = 0;
	        double impuestot = 0;
	        double suelds = 0;
	        for (int m = 0; m < n; m++) {
	            totalh = totalh + t[m].getHoras();
	            sueldoto = sueldoto + sueld[m];
	            bonot = bonot + bono[m];
	            impuestot = impuestot + impuesto[m];
	            suelds = suelds + sueldot[m];
	        }
	        System.out.printf("%15d",totalh);
	        System.out.printf("%26s %.2f","$",sueldoto);
	        System.out.printf("%10s %.2f","$",bonot);

	        System.out.printf("%10s %.2f","$",impuestot);
	        System.out.printf("%11s %.2f","$",suelds);

	        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
	        int[] contador = new int[9];
	        int conta = 0;
	        int cantidad = 0;
	        for (int i = 0; i < n; i++) {
	            conta = (int) sueldot[i];
	            for (int j = 0; j < 9; j++) {
	                contador[j] = contador[j] + conta / billetes[j];
	                cantidad = conta / billetes[j];
	                conta = conta - cantidad * billetes[j];
	            }
	        }
	        System.out.println(" \n\n");
	        System.out.println("Denominación  \tCantidad\tTotal");
	        System.out.println(Arrays.toString(contador));

	    }

	}

