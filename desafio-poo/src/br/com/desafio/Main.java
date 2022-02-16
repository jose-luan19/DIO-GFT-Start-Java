package br.com.desafio;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
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
		
		Conteudo conteudo_curso = new Curso("PHP", "Laravel", 60.0);
		
		System.out.println(conteudo_curso);
		
		Bootcamp b1 = new Bootcamp("Bootcamp Java","Descrição do bootcamp");
		b1.getConteudos().add(c1);
		b1.getConteudos().add(m1);
		b1.getConteudos().add(c2);
		
		Dev d1 = new Dev("Luan");
		d1.inscreverBootcamp(b1);
		
		System.out.println("Conteudos inscritos de "+d1.getNome()+": "+d1.getConteudoInscritos());
		d1.progredir();
		d1.progredir();
		System.out.println("Conteudos inscritos de "+d1.getNome()+": "+d1.getConteudoInscritos());
		System.out.println("Conteudos inscritos de "+d1.getNome()+": "+d1.getConteudoConcluidos());
		System.out.println("XP: "+ d1.calcularTotalXp());
		
		
	}
}
