package br.com.medeiros.curso;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje é " + hoje);
		
		LocalDate copaDoMundo = LocalDate.of(2022, 11, 18);
		
		int anosParaCopa = copaDoMundo.getYear() - hoje.getYear();
		
		
		Period periodo = Period.between(hoje, copaDoMundo);
		System.out.println(periodo);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Copa do Qatar é no dia " + copaDoMundo.format(formatador));
		System.out.println("Falta " + periodo.getYears() +" ano "+ periodo.getMonths() +" meses "+ periodo.getDays() + " dias para copa do mundo");
		
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");		
		LocalDateTime agoraComMinutos = LocalDateTime.now();
		System.out.println(agoraComMinutos.format(formatador2));
		
	}

}
