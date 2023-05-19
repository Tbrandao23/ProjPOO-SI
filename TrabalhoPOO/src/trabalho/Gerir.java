package trabalho;

import java.time.LocalTime;
import java.util.ArrayList;

public class Gerir {
	ArrayList<Paises> listaPaises;
	
	public Gerir() {
	
		listaPaises = new ArrayList<Paises> (20);
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
				System.out.println("Pais ja existe. " + nome);
			}
		}
		
		
	}
	
	public void adicionarRegiao(String nome,String desc, String nomeP) {
		Regioes newReg = new Regioes(nome,desc);
		int j = 0;
		int i = 0;
		while (i < listaPaises.size() && listaPaises.get(i).getNome() != nomeP) {
			i++;
		}
		if (i < listaPaises.size()) {
			
			if(listaPaises.get(i).Regioes.isEmpty()) {
					listaPaises.get(i).Regioes.add(newReg);
				
			}else {
					while(j < listaPaises.get(i).Regioes.size() && newReg.getNome() != listaPaises.get(i).Regioes.get(j).getNome()) {
						j++;
					}
					if(j > listaPaises.get(i).Regioes.size()) {
						listaPaises.get(i).Regioes.add(newReg);
					}else {
						System.out.println("Regiao ja existe. " + nome);
					}
			}
		
		}
	}
	
	public void adicionarProduto(String nome,String desc,String conf,String ass, String nomeP,String nomeR) {
		Produtos newProd = new Produtos(nome,desc, conf,ass);
		int j = 0;
		int i = 0;
		int k = 0;
		while (i < listaPaises.size() && listaPaises.get(i).getNome() != nomeP) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() && listaPaises.get(i).Regioes.get(j).getNome() != nomeR ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.isEmpty()) {
					listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.add(newProd);
				}else {
					while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nome != listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) {
						k++;
					}
					if(k > listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.add(newProd);
					}else {
						System.out.println("Produto ja existe. " + nome);
					}
				}				
			}				
		}
	}
	
	public void adicionarLoja (String nome, String desc,String morada,String dias,String HA,String HF,String nomeP,String nomeR, String nomeProd ) {
		LocalTime HoraAbertura = LocalTime.parse(HA);
		LocalTime HoraFecho = LocalTime.parse(HF);
		Lojas newLoja = new Lojas (nome,desc,morada,dias,HoraAbertura,HoraFecho);
		int j = 0;
		int i = 0;
		int k = 0;
		int x = 0; 
		while (i < listaPaises.size() && listaPaises.get(i).getNome() != nomeP) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() && listaPaises.get(i).Regioes.get(j).getNome() != nomeR ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nomeProd != listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) {
					k++;
				}
				if (k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
					if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.isEmpty()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.add(newLoja);
					}else {
						while(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.size() && nome != listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.get(x).getNome()) {
							x++;
						}
						if(k > listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.size()) {
							listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Lojas.add(newLoja);
						}else {
							System.out.println("Loja ja existe. " + nome);
						}
						
					}
				}
				
				}				
			}				
		}
	
	public void adicionarReceita (String prod, int quant,String nomeP,String nomeR, String nomeProd ) {
		Receitas newReceita = new Receitas (prod,quant);
		int j = 0;
		int i = 0;
		int k = 0;
		int x = 0; 
		while (i < listaPaises.size() && listaPaises.get(i).getNome() != nomeP) {
			i++;
		}
		if (i < listaPaises.size()) {
			while (j < listaPaises.get(i).Regioes.size() && listaPaises.get(i).Regioes.get(j).getNome() != nomeR ) {
				j++;
			}
			if(j < listaPaises.get(i).Regioes.size()) {
				while(k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size() && nomeProd != listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).getNome()) {
					k++;
				}
				if (k < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size()) {
					if(listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.isEmpty()) {
						listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.add(newReceita);
					}else {
						while(x < listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.size() && prod != listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.get(x).getProduto()) {
							x++;
						}
						if(x >= listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.size()) {
							listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(k).Receitas.add(newReceita);
						}else {
							System.out.println("Produto ja existe. " + prod);
						}
						
					}
				}
				
				}				
			}				
		}
	
}
