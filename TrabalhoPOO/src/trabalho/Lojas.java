package trabalho;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lojas {
	String Nome;
	String Descrição; 
	String Morada; 
	String Dias;
	LocalTime HorarioAbertura;
	LocalTime HorarioFecho; 
	
	public Lojas(String nome, String descrição, String morada, String dias,LocalTime HA, LocalTime HF) {
	
		Nome = nome;
		Descrição = descrição;
		Morada = morada;
		Dias = dias;
		HorarioAbertura = HA;
		HorarioFecho = HF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public String getMorada() {
		return Morada;
	}

	public void setMorada(String morada) {
		Morada = morada;
	}

	

	public String getDias() {
		return Dias;
	}

	public void setDias(String dias) {
		Dias = dias;
	}

	public LocalTime getHorarioAbertura() {
		return HorarioAbertura;
	}

	public void setHorarioAbertura(LocalTime horarioAbertura) {
		HorarioAbertura = horarioAbertura;
	}

	public LocalTime getHorarioFecho() {
		return HorarioFecho;
	}

	public void setHorarioFecho(LocalTime horarioFecho) {
		HorarioFecho = horarioFecho;
	}

	@Override
	public String toString() {
		return "Lojas [Nome=" + Nome + ", Descrição=" + Descrição + ", Morada=" + Morada + ", Dias=" + Dias
				+ ", HorarioAbertura=" + HorarioAbertura + ", HorarioFecho=" + HorarioFecho + "]";
	}


	
	
	
	
	
}
