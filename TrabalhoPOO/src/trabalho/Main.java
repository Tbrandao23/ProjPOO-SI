package trabalho;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*Scanner ler = new Scanner(System.in);
		System.out.print("qual a hora de Abertura? formato HH-MM");
        String hora1 = ler.next();
		LocalTime HoraAb = LocalTime.parse(hora1);
		System.out.print("qual a hora de Fecho? formato HH-MM");
        String hora2 = ler.next();
		LocalTime HoraAf = LocalTime.parse(hora2);
		Lojas novaL = new Lojas ("L1", "Lojinha do pão de ló", "Rua 1", "Trabalhamos Segundas e Terças", HoraAb, HoraAf);
		System.out.println(novaL.toString());
		*/
		
		Gerir Gestor = new Gerir();
		Scanner input = new Scanner(System.in);
			        
		int op = -1;
			        
		while(op!=0){
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Adicionar País ");
			System.out.println("2. Adicionar Região ");
			System.out.println("3. Adicionar Produto ");
			System.out.println("4. Adicionar Loja ");
			System.out.println("5. Adicionar Receita ");
			System.out.println("6. Atualizar Produto ");
			System.out.println("7. Imprimir Países");
			System.out.println("0. Sair ");
			System.out.print("Opção: ");
			op = input.nextInt();
			input.nextLine();
			
			if (op < 0 || op > 7) {
				System.out.println("Escolha uma opção: ");
				System.out.println("1. Adicionar País ");
				System.out.println("2. Adicionar Região ");
				System.out.println("3. Adicionar Produto ");
				System.out.println("4. Adicionar Loja ");
				System.out.println("5. Adicionar Receita ");
				System.out.println("6. Atualizar Produto ");
				System.out.println("7. Imprimir Países");
				System.out.println("0. Sair ");
				System.out.print("Opção: ");
				op = input.nextInt();
				input.nextLine();
				
			}
			switch(op){
			 case 1: 
                 System.out.println("Nome do País a adicionar: ");
                 String nomePais = input.nextLine();
                 System.out.println("Qual a descricao do pais? ");
                 String nomeRegiao = input.nextLine();
                 input.nextLine();
                 Gestor.adicionarPais(nomePais, nomeRegiao);
                 break;
                 
             case 2:
                 System.out.println("Nome da região a adicionar: ");
                 String nomeReg = input.nextLine();
                 System.out.println("Descrição da região em questão: ");
                 String descri = input.nextLine();
                 System.out.println("Nome do país ao qual a região pertence: ");
                 String paisNome = input.nextLine();
                 input.nextLine();
                 Gestor.adicionarRegiao(nomeReg, descri, paisNome);
                 break;
             
             case 3:
             	System.out.println("Nome do produto a adicionar: ");
                 String nomeProd = input.nextLine();
                 System.out.println("Descrição do produto em questão: ");
                 String descProd = input.nextLine();
                 System.out.println("Confeção/Receita do produto: ");
                 String confe = input.nextLine();
                 System.out.println("Nome da associação ao qual o produto pertence: ");
                 String asso = input.nextLine();
                 System.out.println("Nome da região ao qual o produto pertence: ");
                 String prodReg = input.nextLine();
                 System.out.println("Nome do país ao qual o produto pertence: ");
                 String prodPais = input.nextLine();
                 input.nextLine();
                 Gestor.adicionarProduto(nomeProd, descProd, confe, asso,prodPais ,prodReg);
                 break;
                 
             case 4:
             	System.out.println("Nome da loja a adicionar: ");
                 String nomeLoja = input.nextLine();
                 System.out.println("Descrição da loja em questão: ");
                 String descLoja = input.nextLine();
                 System.out.println("Morada da loja: ");
                 String lojaMor = input.nextLine();
                 System.out.println("Dias em que a loja estará aberta(formato 09:00, Horas das 00-23): ");
                 String diasLoja = input.nextLine();
                 System.out.println("Hora de abertura da loja(formato 09:00, Horas das 00-23): ");
                 String haLoja = input.nextLine();
                 System.out.println("Hora de fecho da loja: ");
                 String hfLoja = input.nextLine();
                 System.out.println("Nome do país ao qual a loja pertence: ");
                 String lojaNomep = input.nextLine();
                 System.out.println("Nome da região ao qual a loja pertence: ");
                 String lojaNomer = input.nextLine();
                 System.out.println("Nome do produto da loja: ");
                 String lojanomeProd = input.nextLine();
                 input.nextLine();
                 Gestor.adicionarLoja(nomeLoja, descLoja, lojaMor, diasLoja, haLoja, hfLoja, lojaNomep, lojaNomer, lojanomeProd);
             	break;
             	
             case 5:
             	System.out.println("Nome do produto a adicionar na receita: ");
                 String nomeProdRec = input.nextLine();
                 System.out.println("Quantidade do produto em questão: ");
                 String recQuant = input.nextLine();
                 System.out.println("Nome do país ao qual a receita pertence: ");
                 String pNome = input.nextLine();
                 System.out.println("Nome da região ao qual a receita pertence: ");
                 String rNome = input.nextLine();
                 System.out.println("Nome do produto ao qual a receita pertence: ");
                 String prodNom = input.nextLine();
                 input.nextLine();
                 Gestor.adicionarReceita(nomeProdRec, recQuant, pNome, rNome, prodNom);
             	break;
             	
             case 6:
             	System.out.println("Nome do pais ao qual o produto a atualizar pertence: ");
                 String nomeP = input.nextLine();
                 System.out.println("Nome da região do produto em questão: ");
                 String nomeR = input.nextLine();
                 System.out.println("Nome do produto: ");
                 String nomeProdu = input.nextLine();
                 System.out.println("Novo nome do produto: ");
                 String newNome = input.nextLine();
                 System.out.println("Nova descrição do produto: ");
                 String newDesc = input.nextLine();
                 System.out.println("Nova confeção/receita do produto: ");
                 String newConf = input.nextLine();
                 System.out.println("Nova associação do produto: ");
                 String newAss = input.nextLine();
                 input.nextLine();
             	 Gestor.atualizarProd(nomeP, nomeR, nomeProdu, newNome, newDesc, newConf, newAss);
             	break;
         
				case 7:
					for (int i = 0; i < Gestor.listaPaises.size(); i++) {
						System.out.println(Gestor.listaPaises.get(i).toString());
					}

					break;
		}
			        }
}
}


