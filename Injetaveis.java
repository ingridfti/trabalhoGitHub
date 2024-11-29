
public class Injetaveis extends Farmacia {
	private Double dosagem;

	public Injetaveis(String nome, Double preco, Double dosagem) {
		super(nome, preco);
		this.dosagem = dosagem;
	}

	public Double getDosagem() {
		return dosagem;
	}

	public void setDosagem(Double dosagem) {
		this.dosagem = dosagem;
	}

	@Override
	public String modoDeUsar() {
		return this.dosagem + "\n"
				+ "0.5ml por mês, deve ser injetado por um especialista com treinamento para isso. \n ";
	}

	@Override
	public String toString() {
		return getNome() + "\n" + "Preço: R$" + getPreco() + ", " + "Dosagem: " + this.dosagem + "," + modoDeUsar()
				+ super.toString();
	}
}
