package trabalho;

import java.util.ArrayList;

public class Produto {
	String nome; 
	String descricao; 
	ArrayList<Receita> receitas;
	ArrayList<Loja> lojas;
	String associacoes;
	public Produto(String nNome, String descrição, String nAssociacoes) {
		
		nome = nNome;
		descricao = descrição;
		receitas = new ArrayList<Receita>(20);
		lojas = new ArrayList<Loja>(20);
		associacoes = nAssociacoes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Receita> getReceitas() {
		return receitas;
	}
	public void setReceitas(ArrayList<Receita> receitas) {
		this.receitas = receitas;
	}
	public ArrayList<Loja> getLojas() {
		return lojas;
	}
	public void setLojas(ArrayList<Loja> lojas) {
		this.lojas = lojas;
	}
	public String getAssociacoes() {
		return associacoes;
	}
	public void setAssociacoes(String associacoes) {
		this.associacoes = associacoes;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", receitas=" + receitas + ", lojas=" + lojas + ", associacoes=" + associacoes + "]";
	}
	
	 
	
	
}
