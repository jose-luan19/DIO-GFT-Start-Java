package br.com.desafio;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("Java", "Descricao JAVA", 60.0);
		Curso c2 = new Curso("PHP", "Descricao PHP", 25.6);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Mentoria m1 = new Mentoria("Mentoria java","descricao mentoria java",LocalDateTime.now());
		
		System.out.println(m1);
		
		Calendar calendar  = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 17);
		calendar.set(Calendar.MINUTE, 30);
		TimeZone tz = calendar.getTimeZone();
        ZoneId zoneId = tz.toZoneId();
        LocalDateTime data1 = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
        
        Mentoria m2 = new Mentoria("Mentoria java","descricao mentoria java",data1);
        
        
		System.out.println(m2);
		
	}
}
