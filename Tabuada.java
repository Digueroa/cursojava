package cursojava;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("Exemplo Tabuada");
		for (int tabuada = 0; tabuada <=10; tabuada++) {
			System.out.println("");
			for (int valor =0; valor <=10; valor++) {
				System.out.println(tabuada + " x " +valor+ " = "+ (tabuada*valor));
			}
		}
	

	}

}
