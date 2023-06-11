package trabalho;

public class Ingrediente {
	String Produto;
	int Quantidade;
	
	
	public Ingrediente(String produto,int quantidade) {
		
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
		return "Ingrediente [Produto=" + Produto + ", Quantidade=" + Quantidade + "]";
	}
	
	
}


