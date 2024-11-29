
public class Liquidos extends Farmacia{
	private String dosagem;

	public Liquidos(String nome, Double preco, String dosagem) {
		super(nome, preco);
		this.dosagem = dosagem;
	}
	
	

	public String getDosagem() {
		return dosagem;
	}



	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}



	@Override
	public String modoDeUsar() {
		return this.dosagem + "\n" + "Tomar a cada 8horas\n por 5 dias.";
	}
	
	public String toString() {
		return "Nome do medicamento: " + getNome() + "\n" 
									   + "Preço: R$" + getPreco() + ", "
									   + "Dosagem: "+this.dosagem + ","
									   + modoDeUsar()
									   + super.toString();
	}

}
