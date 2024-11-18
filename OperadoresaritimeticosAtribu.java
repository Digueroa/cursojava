package cursojava;
/**
 * Operadores Aritmeticos Atribuiçoes
 * += soma  o valor
 * -= subtrai o valor
 * *= mutiplicar o valor
 * /= dividi o valor
 *  ++ adicionar 1 ao valor
 *   --subtrai 1 do valor
 */

public class OperadoresaritimeticosAtribu {
	public static void main (String [] args) {
		int i = 10;
		System.out.println("Resultado :" +i);
		i= i+=5;
		System.out.println("Resultado :" +i);
		i= i-=5;
		System.out.println("Resultado :" +i);
		i= i*=5;
		System.out.println("Resultado :" +i);
		i= i/=5;
		System.out.println("Resultado :" +i);
		i++;
		System.out.println("Resultado :" +i);
		i--;
		System.out.println("Resultado :" +i);
	}

}
