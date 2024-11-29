
public class Comprimidos extends Farmacia {
	private int dosagem;

	public Comprimidos(String nome, Double preco, int dosagem) {
		super(nome, preco);
		this.dosagem = dosagem;
	}

	public int getDosagem() {
		return dosagem;
	}

	public void setDosagem(int dosagem) {
		this.dosagem = dosagem;
	}

	@Override
	public String modoDeUsar() {
		return this.dosagem + "\n" + "Uso oral, tomar á cada 6h, se dor ou febre. \n ";
	}

	public String toString() {
		return "Nome do medicamento: " + getNome() + "\n" + "Preço: R$" + getPreco() + ", " + "Dosagem: "
				+ this.dosagem + "," + modoDeUsar() + super.toString();
	}
}
