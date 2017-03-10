package ejercicios;
import java.util.*;
import java.util.GregorianCalendar;
/**
 *
 * @author Loera
 */
public class Calendario 
{
 public static String Calendario ()
 {
       Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        if (mes == 2 && dia > 29) 
        {
            mes = mes + 1;
        }
        if ((mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10) && dia > 31) {
            dia = 1;
            mes = mes + 1;
        }
        if ((mes == 4 || mes == 5 || mes == 6 || mes == 9 || mes == 11 || mes == 12) & dia > 30) {
            dia = 1;
            mes = mes + 1;
        }
        if(dia<1)
        {
            mes = mes-1;
            if ((mes-1)==2)
            {
                dia=28;
            }
             if((mes-1)==1 || (mes-1)==3 || (mes-1)==7 || (mes-1)==8 || (mes-1)==10)
             {
                 dia=31;
             }
             if((mes-1)==4 || (mes-1)==5 || (mes-1)==6 || (mes-1)==9 || (mes-1)==11 || (mes-1)==12)
             {
                 dia=30;
             }
        }
        return (dia-7)+"/"+(mes+1)+"/"+año;
 }
  public static String fechasemDes ()
 {
       Calendar fec = new GregorianCalendar();
        int año = fec.get(Calendar.YEAR);
        int mes = fec.get(Calendar.MONTH);
        int dia = fec.get(Calendar.DAY_OF_MONTH);
        
        if (mes == 2 && dia > 29) 
        {
            mes = mes + 1;
        }
        if ((mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10) && dia > 31) {
            dia = 1;
            mes = mes + 1;
        }
        if ((mes == 4 || mes == 5 || mes == 6 || mes == 9 || mes == 11 || mes == 12) & dia > 30) {
            dia = 1;
            mes = mes + 1;
        }
        if(dia<1)
        {
            mes = mes-1;
            if ((mes-1)==2)
            {
                dia=28;
            }
             if((mes-1)==1 || (mes-1)==3 || (mes-1)==7 || (mes-1)==8 || (mes-1)==10)
             {
                 dia=31;
             }
             if((mes-1)==4 || (mes-1)==5 || (mes-1)==6 || (mes-1)==9 || (mes-1)==11 || (mes-1)==12)
             {
                 dia=30;
             }
        }
        return dia+"/"+(mes+1)+"/"+año;
 }
}
