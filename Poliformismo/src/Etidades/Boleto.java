package Etidades;

public class Boleto extends SistemaPagamento {
	public String numero;

	public Boleto(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Boleto [numero " + numero + "]";
	}
	
}
