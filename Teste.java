import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Farmacia> farm = new ArrayList<>();
		Injetaveis inj = new Injetaveis("Anticoncepcional Selene", 30.0, 0.50);
		farm.add(inj);
		
		Comprimidos comp = new Comprimidos("Dipirona", 8.0, 01);
		farm.add(comp);

	
		Liquidos liq = new Liquidos("Xarope de Guaco", 25.0, "5ml") ;
		farm.add(liq);
		
		for(Farmacia f : farm) {
			System.out.println(f.modoDeUsar());
			System.out.println(f.toString());
		}

		
		

	}

}
