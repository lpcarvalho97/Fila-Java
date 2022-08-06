import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Fila {
	
	
	public static void main(String[] args) {
		Queue<Integer> pegar = new LinkedList<Integer>();
		Scanner texto = new Scanner(System.in);
		int escolha;
		escolha = 0;
		Scanner adicionar = new Scanner(System.in);
		int numero;
		
		for (int i = 0; i < 25; i++) 
			pegar.add(i);
			
		
		while(escolha != 6) {
			System.out.println("O que deseja fazer?\n" + "1. Para adicionar elementos para a fila;\n" +
					"2. Para remover elementos da fila;\n" + "3. Para remover todos os elementos da fila;\n" + 
							"4. Para listar todos os elementos da fila;\n" + 
					"5. Para verificar se a fila esta vazia;\n" + "Ou 6 para finalizar o programa\n");
					
					escolha = texto.nextInt();
					//texto.close();
					
					System.out.println("O número digitado foi: " + escolha + "\n");
					
					if (escolha == 1) {
						
						if (pegar.size() < 25){
							System.out.println("Digite um número para adicionar ao final da fila: \n");
							
							numero = adicionar.nextInt();
							pegar.add(numero);
							
						} else {
							System.out.println("A fila já está cheia!\n");
						}
						
					} else if (escolha == 2) {
						
						if(pegar.size() > 0) {
						int removedele = pegar.remove();
						System.out.println("Foi removido o elemento " + removedele + "\n");
						int head = pegar.peek();
						System.out.println("A cabeça da fila é " + head + "\n");
						} else {
							System.out.println("Não é possível excluir mais elementos, pois a lista está vazia!");
						}
						
					} else if (escolha == 3) {
						for (int i = 0; i < 25; i++) {
							
						int removedele = pegar.remove();
						
						System.out.println("Foi removido o elemento " + removedele + "\n");
						}
						
					} else if (escolha == 4) {
						System.out.println("Os elementos da fila são " + pegar + "\n");
						
					} else if (escolha == 5) {
							if (pegar.size() == 0) {
								System.out.println("Verdade");
							} else {
								System.out.println("Falso");
							}
						} else if (escolha == 6) {
						System.out.println("Encerrando o programa...\n");
					} else { 
						System.out.println("Digite um número entre 1 e 6! \n");
						
					}
					
				}
		texto.close();
		adicionar.close();
	
	
}
}
		


