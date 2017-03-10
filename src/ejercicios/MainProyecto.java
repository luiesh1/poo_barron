package ejercicios;

import java.util.*;
import java.util.GregorianCalendar;

public class MainProyecto {

    public static void main(String[] args) 
    {
        //SE INTRODUCEN LOS EMPLEADOS A PROCESAR EN LA NOMINA
        System.out.println("Cantidad de empleados a procesar: ");
        int n = Leer.datoInt();
        String nombre = null;
        char sexo = ' ';
        int horas = 0;
           //SE CREA EL ARREGLO DE TIPO TRABAJADOR PARA GUARDAR LOS OBJETOS
        Trabajador[] t = new Trabajador[n];
        for (int z = 0; z < n; z++) {

            System.out.print("INGRESA EL NOMBRE DEL EMPLEADO : [" + (z + 1) + "] ");
            nombre = Leer.dato();

            System.out.print("INGRESA EL SEXO DEL EMPLEADO : [" + (z + 1) + "]  FEMENINO------->F  MASCULINO------->M  ");
            boolean b = false;
            //VALIDACION DE SEXO
            while (b == false) {
                sexo = Leer.datocar();
                if (sexo == 'f' || sexo == 'F' || sexo == 'm' || sexo == 'M')
                {
                    b = true;
                }
            }
            do 
            {
                System.out.print("INGRESA LAS HORAS TRABAJADAS : [" + (z + 1) + "] ");
                horas = Leer.datoInt();
                //VALIDACION DE HORAS 
                if (horas < 1 || horas > 60) 
                {
                    System.out.println("El TRABAJADOR SOLO PUEDE TRABAJAR MAXIMO 60 HORAS VUELVE A TECLEAR EL DATO");
                }
            }
            while (horas < 1 || horas > 60);
            //SE GUARDA EL NUEVO OBJETO CREADO EN LA POSICION DEL ARREGLO "Z"
            t[z] = new Trabajador(nombre, sexo, horas);
        }

        double sueldo = 0;
        double[] bono = new double[n];
        double[] sueld = new double[n];
        double[] impuesto = new double[n];
        double[] sueldot = new double[n];
        System.out.printf("%60s", "Agrícola Del Valle");
        System.out.println("");
        System.out.printf("%70s", "Nomina de empleados temporales");
        System.out.println("");
        System.out.printf("%75s", "correspondiente a la semana del " + Calendario.Calendario());
        System.out.print(" al " + Calendario.fechasemDes());
        System.out.println("");
        System.out.println("");
        bono = Trabajador.Bonos(t, n);
        //
        System.out.printf("%-15s %17s %12s %15s %15s %17s %20s", "NOMBRE", "HORAS TRABAJADAS", "SEXO", "SUELDO", "BONOS", "IMPUESTOS", "SUELDO TOTAL\n");

        for (int j = 0; j < n; j++)
        {
            //SE IMPRIME EL FORMATO EN UNA TABLA
            System.out.printf("%-15s", t[j].getNombre().toUpperCase());
            
            System.out.printf("%15d", t[j].getHoras());
            if(t[j].getSexo()=='f' || t[j].getSexo()=='F')
            {
                t[j].setSexo('F');

            }
            else{
                t[j].setSexo('M');
            }
               System.out.printf("%15c", t[j].getSexo());
            sueld = Trabajador.CalcularSueldo(t, n);
            if (sueld[j] >= 1000) 
            {
                System.out.printf("%12s%.2f", "$", sueld[j]);
            }
            if (sueld[j] < 1000) 
            {
                System.out.printf("%13s%.2f", "$", sueld[j]);
            }
            
            
            if (bono[j] >=10 && bono[j] <=99) 
            {
                System.out.printf("%10s%.2f", "$", bono[j]);
            }
            if (bono[j] > 99) 
            {
                System.out.printf("%9s%.2f", "$", bono[j]);
            }
            if (bono[j] == 0) 
            {
                System.out.printf("%11s%.2f", "$", bono[j]);
            }
            impuesto = Trabajador.Impuestos(t, n);
            if (impuesto[j] == 0)
            {
                System.out.printf("%12s %.2f", "$", impuesto[j]);
            } 
            if(impuesto [j]>0) 
            {
                System.out.printf("%11s %.2f", "$", impuesto[j]);
            }
            sueldot = Trabajador.Sueldototal(t, n);
            System.out.printf("%12s %.2f", "$", sueldot[j]);
            System.out.println(" ");
        }
        //SE IMPRIME EL TOTAL DE TODA LA SEMANA
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
        System.out.printf("%15d", totalh);
        System.out.printf("%27s %.2f", "$", sueldoto);
        System.out.printf("%10s %.2f", "$", bonot);

        System.out.printf("%10s %.2f", "$", impuestot);
        System.out.printf("%11s %.2f", "$", suelds);

        System.out.println();
        System.out.println();
        System.out.printf("%60s", "Agrícola Del Valle");
        System.out.println("");
        System.out.printf("%90s", "Cantidad de billetes y monedas requeridos para el pago de salarios");
        System.out.println("");
        System.out.printf("%75s", "correspondiente a la semana del  " +Calendario.Calendario() + " al ");

        System.out.print(Calendario.fechasemDes());
        System.out.println("");
        System.out.println("");
        bono = Trabajador.Bonos(t, n);

        System.out.println();
        System.out.println("Denominación  \tCantidad\tTotal");

        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] contador = new int[9];
        int conta = (int) suelds;
        int cantidad = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                contador[j] = contador[j] + conta / billetes[j];
                cantidad = conta / billetes[j];
                conta = conta - cantidad * billetes[j];
            }
            double total = contador[i] * billetes[i];
            System.out.printf("%8s", "$" + billetes[i]);
            System.out.printf("%13s", contador[i]);
            System.out.printf("%12s %.2f", "$", total);
            System.out.println();
        }
        System.out.println();
        System.out.printf("%24s", "Total:");
        System.out.printf("%8s %.2f", "$", suelds);
    }

}
