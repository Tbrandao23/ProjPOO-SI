package trabalho;

public class Ingrediente {
	String Produto;
	int Quantidade;
	String ModoConfecao;
	
	public Ingrediente(String produto,int quantidade, String modoConfecao) {
		
		Produto = produto;
		Quantidade = quantidade;
		ModoConfecao = modoConfecao;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public String getModoConfecao() {
		return ModoConfecao;
	}
	public void setModoConfecao(String modoConfecao) {
		ModoConfecao = modoConfecao;
	}

	
	@Override
	public String toString() {
		return "Receitas [Produto=" + Produto + ", Quantidade=" + Quantidade + " , ModoConfecao= " + ModoConfecao + "]";
	}
	
	
}


