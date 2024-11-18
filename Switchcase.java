package cursojava;

public class Switchcase {

	public static void main(String[] args) {
		String nome = "gatofino";
		int idade = 71;
		char sexo = 'M';
		double temperatura = 26.5;
		boolean arCondicionado = false;
		System.out.println("SWITCH CASE");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuarios");
		System.out.println("3. Relatórios");
		int opcao =3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIO");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
				
	}

}
