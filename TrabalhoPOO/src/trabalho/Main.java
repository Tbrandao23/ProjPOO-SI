package trabalho;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Ingrediente> ings = new ArrayList<Ingrediente>();
	public static void main(String[] args) {
		
		Gerir Gestor = new Gerir();
		Scanner input = new Scanner(System.in);
		int log = -1;
		int op1 = -1;
		int op2 = -1;
		
		while(log != 0) {
			try {
				log = login(input);
				
				if (log < 0 || log > 2) {
					log = login(input);
					
				}
			} catch (Exception e) {
				System.out.println("Opcao invalida!\n");
				input = new Scanner(System.in);
				log = login(input);
				
				if (log < 0 || log > 7) {
					log = login(input);
					
				}
			}
					
			switch (log) {
			
			case 1:
				while(op1!=0){
					try {
						op1 = menuA(input);
						
						if (op1 < 0 || op1 > 7) {
							op1 = menuA(input);
							
						}
					} catch (Exception e) {
						System.out.println("Opcao invalida!\n");
						input = new Scanner(System.in);
						op1 = menuA(input);
						
						if (op1 < 0 || op1 > 7) {
							op1 = menuA(input);
							
						}
					}
					
					switch(op1){
					 case 1: 
		                 System.out.println("Nome do Pais a adicionar: ");
		                 String nomePais = input.nextLine();
		                 System.out.println("Descricao do Pais em questao:  ");
		                 String nomeRegiao = input.nextLine();
		                 Gestor.adicionarPais(nomePais, nomeRegiao);
		                 break;
		                 
		             case 2:
		                 System.out.println("Nome da regiao a adicionar: ");
		                 String nomeReg = input.nextLine();
		                 System.out.println("Descricao da regiao em questao: ");
		                 String descri = input.nextLine();
		                 System.out.println("Nome do pais ao qual a regiao pertence: ");
		                 String paisNome = input.nextLine();
		                 Gestor.adicionarRegiao(nomeReg, descri, paisNome);
		                 break;
		             
		             case 3:
		             	System.out.println("Nome do produto a adicionar: ");
		                 String nomeProd = input.nextLine();
		                 System.out.println("Historia do produto em questao: ");
		                 String descProd = input.nextLine();
		                 System.out.println("Nome da associacao ao qual o produto pertence: ");
		                 String asso = input.nextLine();
		                 System.out.println("Nome da regiao ao qual o produto pertence: ");
		                 String prodReg = input.nextLine();
		                 System.out.println("Nome do pais ao qual o produto pertence: ");
		                 String prodPais = input.nextLine();
		                 Gestor.adicionarProduto(nomeProd, descProd, asso,prodPais ,prodReg);
		                 break;
		                 
		             case 4:
		             	System.out.println("Nome da loja a adicionar: ");
		                 String nomeLoja = input.nextLine();
		                 System.out.println("Descricao da loja em questao: ");
		                 String descLoja = input.nextLine();
		                 System.out.println("Morada da loja: ");
		                 String lojaMor = input.nextLine();
		                 System.out.println("Dias em que a loja estará aberta(formato 09:00, Horas das 00-23): ");
		                 String diasLoja = input.nextLine();
		                 System.out.println("Hora de abertura da loja(formato 09:00, Horas das 00-23): ");
		                 String haLoja = input.nextLine();
		                 System.out.println("Hora de fecho da loja: ");
		                 String hfLoja = input.nextLine();
		                 System.out.println("Nome do pais ao qual a loja pertence: ");
		                 String lojaNomep = input.nextLine();
		                 System.out.println("Nome da regiao ao qual a loja pertence: ");
		                 String lojaNomer = input.nextLine();
		                 System.out.println("Nome do produto da loja: ");
		                 String lojanomeProd = input.nextLine();
		                 Gestor.adicionarLoja(nomeLoja, descLoja, lojaMor, diasLoja, haLoja, hfLoja, lojaNomep, lojaNomer, lojanomeProd);
		             	break;
		             	
		             case 5:
		            	 
		            	 System.out.println("Quantos ingredientes tem a receita ? ");
		            	 String numero = input.nextLine(); 
		            	 int num = Integer.parseInt(numero);
		            	 ArrayList<Ingrediente> ings2= new ArrayList<Ingrediente>(num);
		            	 for (int i = 0;i < num;i++) {
		            		 System.out.println("Nome do produto a adicionar na receita: ");
			                 String nomeProdRec = input.nextLine();
			                 System.out.println("Quantidade do produto em questao: ");
			                 String prodQuant = input.nextLine();
			                 int quant = Integer.parseInt(prodQuant);
			                 Ingrediente ing = new Ingrediente(nomeProdRec,quant);
			                 ings2.add(ing);
			                
		            	 }
		             	 
		                 System.out.println("Confecao do produto: ");
		                 String confe = input.nextLine();
		                 System.out.println("Nome do pais ao qual a receita pertence: ");
		                 String pNome = input.nextLine();
		                 System.out.println("Nome da regiao ao qual a receita pertence: ");
		                 String rNome = input.nextLine();
		                 System.out.println("Nome do produto ao qual a receita pertence: ");
		                 String prodNom = input.nextLine();
		                 Gestor.adicionarReceita(confe,ings2, pNome, rNome, prodNom);
		             	 break;
		             	
		             case 6:
		             	System.out.println("Nome do pais ao qual o produto a atualizar pertence: ");
		                 String nomeP = input.nextLine();
		                 System.out.println("Nome da regiao do produto em questão: ");
		                 String nomeR = input.nextLine();
		                 System.out.println("Nome do produto: ");
		                 String nomeProdu = input.nextLine();
		                 System.out.println("Novo nome do produto: ");
		                 String newNome = input.nextLine();
		                 System.out.println("Nova descricao do produto: ");
		                 String newDesc = input.nextLine();
		                 System.out.println("Nova associacao do produto: ");
		                 String newAss = input.nextLine();
		             	 Gestor.atualizarProd(nomeP, nomeR, nomeProdu, newNome, newDesc, newAss);
		             	break;
		         
						case 7:
							for (int i = 0; i < Gestor.listaPaises.size(); i++) {
								System.out.println(Gestor.listaPaises.get(i).toString());
							}

							break;
				}
				
			}
				break;	
			case 2 :
				
				while (op2 != 0) {
					
						try {
							op2 = menuT(input);
							
							if (op2 < 0 || op2 > 6) {
								op2 = menuT(input);
								
							}
						} catch (Exception e) {
							System.out.println("Opcao invalida!\n");
							input = new Scanner(System.in);
							op2 = menuT(input);
							
							if (op2 < 0 || op2 > 6) {
								op1 = menuT(input);
								
							}
						}
					
					switch(op2){
					case 1:
						
						System.out.println("Paises Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							System.out.println("- " + Gestor.listaPaises.get(i).getNome());
						}
						System.out.println("Nome do pais ao qual o produto pertence: ");
		                String prodPais = input.nextLine();
		                
						
						System.out.println("Regioes Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).getNome());
							}
						}
						System.out.println("Nome da regiao ao qual o produto pertence: ");
		                String prodReg = input.nextLine();
		                Gestor.verProds(prodPais, prodReg);
						break;
					case 2:
						System.out.println("Paises Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							System.out.println("- " + Gestor.listaPaises.get(i).getNome());
						}
						System.out.println("Nome do pais ao qual o produto pertence: ");
		                String pais = input.nextLine();
		                
						
						System.out.println("Regioes Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).getNome());
							}
						}
						System.out.println("Nome da regiao ao qual o produto pertence: ");
		                String reg = input.nextLine();
		                System.out.println("Produtos Existentes na Regiao: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								for (int z = 0;z < Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size();z++) {
									System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(z).getNome());
								}
								
							}
						}
						System.out.println("Nome do produto : ");
		                String prod = input.nextLine();
		                Gestor.verHistProd(pais, reg, prod);
						break;
					case 3: 
						System.out.println("Paises Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							System.out.println("- " + Gestor.listaPaises.get(i).getNome());
						}
						System.out.println("Nome do pais ao qual o produto pertence: ");
		                String pais1 = input.nextLine();
		                
						
						System.out.println("Regioes Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).getNome());
							}
						}
						System.out.println("Nome da regiao ao qual o produto pertence: ");
		                String reg1 = input.nextLine();
		                System.out.println("Produtos Existentes na Regiao: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								for (int z = 0;z < Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size();z++) {
									System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(z).getNome());
								}
								
							}
						}
						System.out.println("Nome do produto : ");
		                String prod1 = input.nextLine();
		                Gestor.verLojas(pais1, reg1, prod1);
						break;
					case 4:
						System.out.println("Paises Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							System.out.println("- " + Gestor.listaPaises.get(i).getNome());
						}
						System.out.println("Nome do pais ao qual o produto pertence: ");
		                String pais2 = input.nextLine();
		                
						
						System.out.println("Regioes Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).getNome());
							}
						}
						System.out.println("Nome da regiao ao qual o produto pertence: ");
		                String reg2 = input.nextLine();
		                System.out.println("Produtos Existentes na Regiao: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							for (int j = 0;j < Gestor.listaPaises.get(i).Regioes.size();j++) {
								for (int z = 0;z < Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.size();z++) {
									System.out.println("- " + Gestor.listaPaises.get(i).Regioes.get(j).Produtos_da_Regiao.get(z).getNome());
								}
								
							}
						}
						System.out.println("Nome do produto : ");
		                String prod2 = input.nextLine();
		                System.out.println("Qual a avaliacao do produto : ");
		                String avaliacao = input.nextLine();
		                double aval = Double.parseDouble(avaliacao);
		                while (aval < 0 || aval > 10) {
		                	System.out.println("Qual a avaliacao do produto : ");
		                	avaliacao = input.nextLine();
			                aval = Double.parseDouble(avaliacao);
		                }
		                Gestor.avaliarProd(pais2, reg2, prod2, aval);
						break;
					case 5:
						Gestor.verPais();
						break;
					case 6:
						System.out.println("Paises Existentes: ");
						for (int i = 0;i < Gestor.listaPaises.size();i++) {
							System.out.println("- " + Gestor.listaPaises.get(i).getNome());
						}
						System.out.println("Nome do pais ao qual o produto pertence: ");
		                String pais3 = input.nextLine();
		                Gestor.verRegioes(pais3);
						break;
				}

				}
				break;
			}
			
				}
	}
	
	
	private static int login (Scanner input) {
		int log;
		System.out.println("Deseja Entrar Como: ");
		System.out.println("1. Administrador ");
		System.out.println("2. Turista ");
		System.out.println("0. Sair ");
		System.out.print("Opcao: ");
		log = input.nextInt();
		input.nextLine();
		return log;
	}
	
	private static int menuA(Scanner input) {
		int op;
		System.out.println("Escolha uma opcao: ");
		System.out.println("1. Adicionar Pais ");
		System.out.println("2. Adicionar Regiao ");
		System.out.println("3. Adicionar Produto ");
		System.out.println("4. Adicionar Loja ");
		System.out.println("5. Adicionar Receita ");
		System.out.println("6. Atualizar Produto ");
		System.out.println("7. Imprimir Países");
		System.out.println("0. Sair ");
		System.out.print("Opcao: ");
		op = input.nextInt();
		input.nextLine();
		return op;

	}
	private static int menuT(Scanner input) {
		int op;
		System.out.println("Escolha uma opcao: ");
		System.out.println("1. Ver Produtos da Regiao ");
		System.out.println("2. Ver Historia do Produto Selecionado");
		System.out.println("3. Ver Lojas/Restaurantes que vendem o Produto Selecionado");
		System.out.println("4. Avaliar o Produto Selecionado");
		System.out.println("5. Ver Paises Existentes ");
		System.out.println("6. Ver Regioes Existentes nos Pais Selecionado");
		System.out.println("0. Sair ");
		System.out.print("Opcao: ");
		op = input.nextInt();
		input.nextLine();
		return op;

	}
}



