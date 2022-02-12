package br.com.dio.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Saudacao {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	
	public void saudar() {
		Calendar now = Calendar.getInstance();
		Calendar finalDoDia = Calendar.getInstance();
		Calendar finalDeTarde = Calendar.getInstance();
		Calendar finalDeNoite = Calendar.getInstance();
		
		finalDoDia.set(Calendar.HOUR_OF_DAY, 12);
		finalDeTarde.set(Calendar.HOUR_OF_DAY, 18);
		finalDeNoite.set(Calendar.HOUR_OF_DAY, 5);
		
		
        System.out.println(sdf.format(now.getTime()));
        
        if(now.getTime().before(finalDoDia.getTime())) {
        	System.out.println("Bom Dia");
        }
        else if(now.getTime().after(finalDoDia.getTime()) && now.getTime().before(finalDeTarde.getTime())) {
        	System.out.println("Boa Tarde");
        }
        else if(now.getTime().after(finalDeTarde.getTime()) && now.getTime().before(finalDeNoite.getTime())) {
        	System.out.println("Boa Noite");
        }
        
	}
}

