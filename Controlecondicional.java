package cursojava;

public class Controlecondicional {

	public static void main(String[] args) {
		String nome = "gatofino";
		int idade = 71;
		char sexo = 'M';
		double temperatura = 26.5;
		boolean arCondicionado = false;
		System.out.println("Exemplos Estruturas de Controle Condicional");
		System.out.println("");
		System.out.println("USO DO IF");
		if (sexo == 'M');{
		System.out.println("Alistamento Militar Obrigatorio");
		}
		System.out.println("");
		System.out.println("USO DO IF - ELSE");
		if (idade < 18) {
		System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		
		System.out.println("");
		System.out.println("USO DO ELSE - IF ");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		}else if (idade >= 18 && idade <=70 ) {
			System.out.println("VOTO OBRIGATORIO");
			
		}else if (idade == 16 || idade == 17 || idade >70) {
			System.out.println("VOTO FACULTATIVO");
		}
		
	}

}
