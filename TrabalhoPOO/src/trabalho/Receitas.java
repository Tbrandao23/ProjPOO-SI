package trabalho;

public class Receitas {
	String Produto;
	int Quantidade;
	
	public Receitas(String produto,int quantidade) {
		
		Produto = produto;
		Quantidade = quantidade;
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

	@Override
	public String toString() {
		return "Receitas [Produto=" + Produto + ", Quantidade=" + Quantidade + "]";
	}
	
	
}


