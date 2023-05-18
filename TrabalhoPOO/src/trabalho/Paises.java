package trabalho;

import java.util.ArrayList;

public class Paises {
	
	String Nome;
	String Descrição;
	ArrayList<Regioes> Regioes ;
	
	
	
	
	public Paises(String nome, String descrição) {
		
		Nome = nome;
		Descrição = descrição;
		Regioes = new ArrayList<Regioes>(20);
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
	public ArrayList<Regioes> getRegioes() {
		return Regioes;
	}
	public void setRegioes(ArrayList<Regioes> regioes) {
		Regioes = regioes;
	}

	@Override
	public String toString() {
		return "Paises [Nome= " + Nome + " , Descrição= " + Descrição + " , Regioes= " + Regioes + " ]";
	}
	
	
	
}
