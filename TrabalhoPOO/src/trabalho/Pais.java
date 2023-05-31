package trabalho;

import java.util.ArrayList;

public class Pais {
	
	String Nome;
	String Descricao;
	ArrayList<Regiao> Regioes ;
	
	
	
	
	public Pais(String nome, String descrição) {
		
		Nome = nome;
		Descricao = descrição;
		Regioes = new ArrayList<Regiao>(20);
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
	public ArrayList<Regiao> getRegioes() {
		return Regioes;
	}
	public void setRegioes(ArrayList<Regiao> regioes) {
		Regioes = regioes;
	}

	@Override
	public String toString() {
		return "Paises [Nome= " + Nome + " , Descricao= " + Descricao + " , Regioes= " + Regioes + " ]";
	}
	
	
	
}
