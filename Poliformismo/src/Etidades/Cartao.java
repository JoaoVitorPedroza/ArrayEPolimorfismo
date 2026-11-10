package Etidades;

public class Cartao extends SistemaPagamento {
	public String numeroCartao;
	public String titularCartao;
	private Double cvv;
	public Cartao(String numeroCartao, String titularCartao, Double cvv) {
		this.numeroCartao = numeroCartao;
		this.titularCartao = titularCartao;
		this.cvv = cvv;
	}
	
}
