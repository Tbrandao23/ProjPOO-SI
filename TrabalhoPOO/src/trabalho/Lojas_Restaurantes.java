package trabalho;

public class Lojas_Restaurantes {
	String Nome;
	String Descrição; 
	String Morada; 
	String Horario;
	
	public Lojas_Restaurantes(String nome, String descrição, String morada, String horario) {
	
		Nome = nome;
		Descrição = descrição;
		Morada = morada;
		Horario = horario;
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

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	@Override
	public String toString() {
		return "Lojas_Restaurantes [Nome=" + Nome + ", Descrição=" + Descrição + ", Morada=" + Morada + ", Horario=" + Horario + "]";
	}
	
	
	
	
	
}
