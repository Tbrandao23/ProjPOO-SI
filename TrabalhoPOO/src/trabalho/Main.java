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
		Gestor.adicionarPais("Portugal", "Ola");
		Gestor.adicionarPais("Holanda", "Hallo");
		Gestor.adicionarPais("Franca", "Bonjour");
		Gestor.adicionarRegiao("Ovar", "Bom pao de lo ", "Portugal");
		Gestor.adicionarRegiao("Paris", "Bom pao de baguete", "Franca");
		Gestor.adicionarRegiao("Amesterdao", "Bom pao", "Holanda");
		Gestor.adicionarProduto("Pao de lo", "Belo bolo", "1 colher de sopa","Associacao do Pao de lo", "Portugal", "Ovar");
		Gestor.adicionarLoja("Loja do Pao de lo", "Lojinha que vende pao de lo", "Rua 1 de Abril", "Segunda,Quarta,Sexta,Sabado", "09:00", "20:00", "Portugal", "Ovar", "Pao de lo");
		Gestor.adicionarReceita("acucar",2,"Portugal", "Ovar", "Pao de lo");
		Gestor.adicionarReceita("farinha",1,"Portugal", "Ovar", "Pao de lo");
		Gestor.adicionarReceita("ovos",5,"Portugal", "Ovar", "Pao de lo");
		System.out.println(Gestor.listaPaises);
		Gestor.adicionarPais("Portugal", "123");
		Gestor.adicionarRegiao("Ovar", "Ex pao de lo ", "Portugal");
		Gestor.adicionarProduto("Pao de lo", "Belo bolo", "1 colher de sopa","Associacao do Pao de lo", "Portugal", "Ovar");
		Gestor.adicionarLoja("Loja do Pao de lo", "Lojinha que vende pao de lo", "Rua 1 de Abril", "Segunda,Quarta,Sexta,Sabado", "09:00", "20:00", "Portugal", "Ovar", "Pao de lo");
		Gestor.adicionarReceita("ovos",5,"Portugal", "Ovar", "Pao de lo");
	}
}
