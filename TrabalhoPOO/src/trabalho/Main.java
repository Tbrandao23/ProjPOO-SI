package trabalho;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Ingrediente> ings = new ArrayList<Ingrediente>();
	public static void main(String[] args) {
		
		Gerir Gestor = new Gerir();
		Scanner input = new Scanner(System.in);
		
		int op = -1;
		
		while(op!=0){
				try {
					op = menu(input);
					
					if (op < 0 || op > 7) {
						op = menu(input);
						
					}
				} catch (Exception e) {
					System.out.println("Opcao invalida!\n");
					input = new Scanner(System.in);
					op = menu(input);
					
					if (op < 0 || op > 7) {
						op = menu(input);
						
					}
				}
				
				switch(op){
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
	            	 int num = input.nextInt(); 
	            	 ArrayList<Ingrediente> ings2= new ArrayList<Ingrediente>(num);
	            	 for (int i = 0;i < num;i++) {
	            		 System.out.println("Nome do produto a adicionar na receita: ");
		                 String nomeProdRec = input.nextLine();
		                 System.out.println("Quantidade do produto em questao: ");
		                 int Quant = input.nextInt();
		                 Ingrediente ing = new Ingrediente(nomeProdRec,Quant);
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
	}

	private static int menu(Scanner input) {
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
}



