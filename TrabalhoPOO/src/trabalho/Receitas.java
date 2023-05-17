package trabalho;

public class Receitas {
	String Produto;
	String Quantidade;
	
	public Receitas(String produto, String quantidade) {
		
		Produto = produto;
		Quantidade = quantidade;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public String getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Receitas [Produto=" + Produto + ", Quantidade=" + Quantidade + "]";
	}
	
	
}


