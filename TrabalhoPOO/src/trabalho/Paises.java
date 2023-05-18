package trabalho;

import java.util.ArrayList;

public class Paises {
	
	String Nome;
	String Descricao;
	ArrayList<Regioes> Regioes ;
	
	
	
	
	public Paises(String nome, String descrição) {
		
		Nome = nome;
		Descricao = descrição;
		Regioes = new ArrayList<Regioes>(20);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descrição) {
		Descricao = descrição;
	}
	public ArrayList<Regioes> getRegioes() {
		return Regioes;
	}
	public void setRegioes(ArrayList<Regioes> regioes) {
		Regioes = regioes;
	}

	@Override
	public String toString() {
		return "Paises [Nome= " + Nome + " , Descricao= " + Descricao + " , Regioes= " + Regioes + " ]";
	}
	
	
	
}
