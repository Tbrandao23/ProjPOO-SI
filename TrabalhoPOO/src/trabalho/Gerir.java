package trabalho;

import java.util.ArrayList;

public class Gerir {
	ArrayList<Paises> listaPaises;
	ArrayList<Regioes> listaRegioes;
	ArrayList<Produtos> listaProdutos;
	ArrayList<Lojas> listaLojas;
	ArrayList<Receitas> listaReceitas;
	
	public Gerir() {
	
		listaPaises = new ArrayList<Paises> (20);
		listaRegioes = new ArrayList<Regioes> (20);
		listaProdutos = new ArrayList<Produtos> (20);
		listaLojas = new ArrayList<Lojas> (20);
		listaReceitas = new ArrayList<Receitas> (20);
	}


	public void adicionarPais (String nome,String Regiao) {
		Paises newPais = new Paises (nome,Regiao);
		int i = 0;
		if(listaPaises.isEmpty()) {
			listaPaises.add(newPais);
		}else {
			while(i < listaPaises.size() && newPais.getNome() != listaPaises.get(i).getNome()) {
				i++;
			}
			if(i >= listaPaises.size()) {
				listaPaises.add(newPais);
			}else {
				System.out.println("Pais ja existe.");
			}
		}
		
		
	}
	
}
