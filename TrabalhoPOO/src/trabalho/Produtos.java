package trabalho;

import java.util.ArrayList;

public class Produtos {
	String Nome; 
	String Descrição; 
	ArrayList<Receitas> Receitas;
	ArrayList<Lojas> Lojas;
	String ModoConfecao;
	public Produtos(String nome, String descrição, ArrayList<trabalho.Receitas> receitas, String modoConfecao) {
		
		Nome = nome;
		Descrição = descrição;
		Receitas = new ArrayList<Receitas>(20);
		Lojas = new ArrayList<Lojas>(20);
		ModoConfecao = modoConfecao;
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
	public ArrayList<Receitas> getReceitas() {
		return Receitas;
	}
	public void setReceitas(ArrayList<Receitas> receitas) {
		Receitas = receitas;
	}
	public ArrayList<Lojas> getLojas() {
		return Lojas;
	}
	public void setLojas(ArrayList<Lojas> lojas) {
		Lojas = lojas;
	}
	public String getModoConfecao() {
		return ModoConfecao;
	}
	public void setModoConfecao(String modoConfecao) {
		ModoConfecao = modoConfecao;
	}

	@Override
	public String toString() {
		return "Produtos [Nome= " + Nome + " , Descrição= " + Descrição + " , Receitas= " + Receitas + " , Lojas= " + Lojas + " , ModoConfecao= " + ModoConfecao + " ]";
	} 
	
	
}
