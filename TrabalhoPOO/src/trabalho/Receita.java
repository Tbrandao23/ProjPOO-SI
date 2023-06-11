package trabalho;

import java.util.ArrayList;

public class Receita {
	String ModoConfecao;
	ArrayList<Ingrediente> ingredientes;
	
	
	public Receita(String modoConfecao) {
		super();
		ModoConfecao = modoConfecao;
		ingredientes = new ArrayList<Ingrediente>(100);
	}


	public String getModoConfecao() {
		return ModoConfecao;
	}


	public void setModoConfecao(String modoConfecao) {
		ModoConfecao = modoConfecao;
	}


	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}


	@Override
	public String toString() {
		return "Receita [ModoConfecao=" + ModoConfecao + ", ingredientes=" + ingredientes + "]";
	} 
	
	
	
	
	
}
