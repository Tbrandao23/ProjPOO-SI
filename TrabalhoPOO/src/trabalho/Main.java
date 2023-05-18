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
		Gestor.adicionarPais("França", "Bonjour");
		System.out.println(Gestor.listaPaises);
		Gestor.adicionarPais("Portugal", "123");
	}
}
