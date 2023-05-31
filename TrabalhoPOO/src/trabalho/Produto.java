package trabalho;

import java.util.ArrayList;

public class Produto {
	String Nome; 
	String Descricao; 
	ArrayList<Ingrediente> ingredientes;
	ArrayList<Loja> Lojas;
	String Associacoes;
	public Produto(String nome, String descrição, String associacoes) {
		
		Nome = nome;
		Descricao = descrição;
		ingredientes = new ArrayList<Ingrediente>(20);
		Lojas = new ArrayList<Loja>(20);
		Associacoes = associacoes;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescrição() {
		return Descricao;
	}
	public void setDescrição(String descrição) {
		Descricao = descrição;
	}
	public ArrayList<Ingrediente> getingredientes() {
		return ingredientes;
	}
	public void adicionarIngrediente (Ingrediente i) {//setingredientes(ArrayList<Ingrediente> ingredientes) {
		ingredientes.add(i);
	}
	public ArrayList<Loja> getLojas() {
		return Lojas;
	}
	public void setLojas(ArrayList<Loja> lojas) {
		Lojas = lojas;
	}
	
	public String getAssociacoes() {
		return Associacoes;
	}

	public void setAssociacoes(String associacoes) {
		Associacoes = associacoes;
	}

	@Override
	public String toString() {
		return "Produtos [Nome= " + Nome + " , Descricao= " + Descricao + " , ingredientes= " + ingredientes + " , Lojas= " + Lojas + " , Associacao= " + Associacoes+ " ]";
	} 
	
	
}
