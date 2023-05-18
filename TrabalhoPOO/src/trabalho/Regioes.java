package trabalho;

import java.util.ArrayList;

public class Regioes {
	String Nome;
	String Descrição;
	ArrayList<Produtos> Produtos_da_Regiao ;
	
	
	public Regioes(String nome, String descrição) {
		
		Nome = nome;
		Descrição = descrição;
		Produtos_da_Regiao = new ArrayList<Produtos>(20);
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
	public ArrayList<Produtos> getProdutos_da_Regiao() {
		return Produtos_da_Regiao;
	}
	public void setProdutos_da_Regiao(ArrayList<Produtos> produtos_da_Regiao) {
		Produtos_da_Regiao = produtos_da_Regiao;
	}

	@Override
	public String toString() {
		return "Regioes [Nome= " + Nome + " , Descrição= " + Descrição + " , Produtos_da_Regiao= " + Produtos_da_Regiao + " ]";
	}
	
	
	
}
