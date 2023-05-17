package trabalho;

import java.util.ArrayList;

public class Produtos {
	String Nome; 
	String Descrição; 
	ArrayList<Receitas> Receitas;
	String ModoConfecao;
	public Produtos(String nome, String descrição, ArrayList<trabalho.Receitas> receitas, String modoConfecao) {
		super();
		Nome = nome;
		Descrição = descrição;
		Receitas = new ArrayList<Receitas>(20);
		ModoConfecao = modoConfecao;
	} 
	
	
}
