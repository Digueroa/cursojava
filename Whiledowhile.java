package cursojava;

public class Whiledowhile {

	public static void main(String[] args) {
		int contador =1;
		System.out.println("Uso da estrutura While");
		while (contador <=10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("Uso da estrutura do while");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente s/n");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
		
		

	}

}
