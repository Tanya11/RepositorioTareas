package practica;
import java.util.Scanner;

public class Ejer5 {
	
		
		/*public static java.sql.Date sumarFechasDias(java.sql.Date fch, int dias) {
			
		   int= fecha= 
		
		      calendar.setTime(fecha); // Configuramos la fecha que se recibe
		
		      calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
	
		 
		
		      return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
}
       }
}*/
	
	
	
	private static void sumarRestarDias(){
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calHoy= Calendar.getInstance();
    Calendar calAyer= Calendar.getInstance();
    Calendar calMannana= Calendar.getInstance();
    calHoy.setTime(new Date());
    calAyer.setTime(calHoy.getTime());
    calMannana.setTime(calHoy.getTime());
     System.out.println(dateFormat.format(calHoy.getTime()));
    int numeroDia=calHoy.get(Calendar.DAY_OF_WEEK);
    numeroDia -=1;
    System.out.println("fia de la semana: "+numeroDia);

    calAyer.add(Calendar.DATE,-30);
    calMannana.add(Calendar.DATE,(6-numeroDia));
    System.out.println("Fecha primera: "+dateFormat.format(calAyer.getTime()));
    System.out.println("Fecha hoy: "+dateFormat.format(calHoy.getTime()));
    System.out.println("Fecha ultima: "+dateFormat.format(calMannana.getTime()));
   }