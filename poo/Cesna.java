package poo;

public class Cesna {

	public static void main(String[] args) {
		Aviao cesna = new Aviao ();
		cesna.ano= 2015;
		cesna.cor = "Branco";
		cesna.envergadura = 11;
		System.out.println("Aviao: Cesna");
		System.out.println("Ano: " + cesna.ano);
		System.out.println("Ano: " + cesna.cor);
		System.out.println("Envergadura: " + cesna.envergadura);
		cesna.aterrizar();
		cesna.desligar();

	}

}
