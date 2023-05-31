package trabalho;

import java.time.LocalTime;
import java.util.ArrayList;

public class Gerir {
	ArrayList<Pais> listaPaises;
	
	public Gerir() {
	
		listaPaises = new ArrayList<Pais> (20);
	}


	public void adicionarPais (String nome,String Regiao) {
		Pais newPais = new Pais (nome,Regiao);
		int i = 0;
		if(listaPaises.isEmpty()) {
			listaPaises.add(newPais);
		}else {
			while(i < listaPaises.size() && nome.compareTo(listaPaises.get(i).getNome())!= 0 ) {
				i++;
			}
			if(i >= listaPaises.size()) {
				listaPaises.add(newPais);
			}else {
				System.out.println("Pais ja existe. " + nome);
			}
		}
		
		
	}
	
	public void adicionarRegiao(String nome,String desc, String nomeP) {
		Regiao newReg = new Regiao(nome,desc);
		int j = 0;
		int i = 0;
		while (i < listaPaises.size() && nomeP.compareTo(listaPaises.get(i).getNome()) != 0) {
			i++;
		}
		if (i < listaPaises.size() ) {
			
			if(listaPaises.get(i).Regioes.isEmpty()) {
					listaPaises.get(i).Regioes.add(newReg);
				
			}else {
					while(j < listaPaises.get(i).Regioes.size() && nome.compareTo(listaPaises.get(i).Regioes.get(j).getNome()) != 0) {
						j++;
					}
					if(j >= listaPaises.get(i).Regioes.size()) {
						listaPaises.get(i).Regioes.add(newReg);
					}else {
						System.out.println("Regiao ja existe. " + nome);
					}
			}
		
		}else {
			System.out.println("Pais nao existe.");
		}
	}
	
	public void adicionarProduto(String nome,String desc,String ass, String nomeP,String nomeR) {
		Produto newProd = new Produto(nome, desc, ass);
		int j = 0;
		int i = 0;
		int k = 0;
		while (i < listaPaises.size() && nomeP.compareTo(listaPaises.get(i).getNome()) != 0) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() && nomeR.compareTo(listaPaises.get(i).Regioes.get(j).getNome()) != 0 ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.isEmpty()) {
					listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.add(newProd);
				}else {
					while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nome.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) != 0) {
						k++;
					}
					if(k > listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.add(newProd);
					}else {
						System.out.println("Produto ja existe. " + nome);
					}
				}				
			}else {
				System.out.println("Regiao nao existe.");
			}
		}else {
			System.out.println("Pais nao existe.");
		}
	}
	
	public void adicionarLoja (String nome, String desc,String morada,String dias,String HA,String HF,String nomeP,String nomeR, String nomeProd ) {
		LocalTime HoraAbertura = LocalTime.parse(HA);
		LocalTime HoraFecho = LocalTime.parse(HF);
		Loja newLoja = new Loja (nome,desc,morada,dias,HoraAbertura,HoraFecho);
		int j = 0;
		int i = 0;
		int k = 0;
		int x = 0; 
		while (i < listaPaises.size() &&   nomeP.compareTo(listaPaises.get(i).getNome()) != 0) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() &&   nomeR.compareTo(listaPaises.get(i).Regioes.get(j).getNome()) != 0 ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nomeProd.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) != 0) {
					k++;
				}
				if (k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
					if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.isEmpty()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.add(newLoja);
					}else {
						while(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.size() && nome.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.get(x).getNome()) != 0) {
							x++;
						}
						if(k > listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.size()) {
							listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.add(newLoja);
						}else {
							System.out.println("Loja ja existe. " + nome);
						}
						
					}
				}else {
					System.out.println("Produto nao existe.");
				}
				
				}else {
					System.out.println("Regiao nao existe.");
				}
			}else {
				System.out.println("Pais nao existe.");
			}
		}
	
	public void adicionarReceita (String prod, String quant, String confe, String nomeP,String nomeR, String nomeProd ) {
		int quantidade = Integer.parseInt(quant);
		Ingrediente newReceita = new Ingrediente (prod,quantidade,confe);
		int j = 0;
		int i = 0;
		int k = 0;
		int x = 0; 
		while (i < listaPaises.size() &&  nomeP.compareTo(listaPaises.get(i).getNome()) != 0) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() &&  nomeR.compareTo(listaPaises.get(i).Regioes.get(j).getNome()) != 0 ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nomeProd.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) != 0) {
					k++;
				}
				if (k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
					if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).ingredientes.isEmpty()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).ingredientes.add(newReceita);
					}else {
						while(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).ingredientes.size() && prod.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.get(x).getProduto()) != 0) {
							x++;
						}
						if(x >= listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).ingredientes.size()) {
							listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).ingredientes.add(newReceita);
						}else {
							System.out.println("Produto ja existe. " + prod);
						}
						
					}
				}else {
					System.out.println("Produto nao existe.");
				}
				
				}else {
					System.out.println("Regiao nao existe.");
				}
			}else {
				System.out.println("Pais nao existe.");
			}
		}
	
	public void atualizarProd (String nomeP,String nomeR, String nomeProd,String newNome,String newDesc,String newAss) {
		int i = 0;
		int j = 0;
		int x = 0;
		while (i < listaPaises.size() && nomeP.compareTo(listaPaises.get(i).getNome()) != 0) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() && nomeR.compareTo(listaPaises.get(i).Regioes.get(j).getNome()) != 0) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				while(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nomeProd.compareTo(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(x).getNome()) != 0 ) {
					x++;
				}
				if(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
					 listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(x).setNome(newNome);
					 listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(x).setDescrição(newDesc);
					 listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(x).setAssociacoes(newAss);
				}else {
					System.out.println("Produto nao existe.");
				}
			}else {
				System.out.println("Regiao nao existe.");
			}
		}else {
			System.out.println("Pais nao existe.");
		}
	}
	
}
