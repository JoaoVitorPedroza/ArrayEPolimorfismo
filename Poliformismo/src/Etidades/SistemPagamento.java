package Etidades;

public class SistemPagamento  {
	public SistemPagamento(String numeroCartao, String titularCartao, Double cvv, String nome) {
		super(numeroCartao, titularCartao, cvv, nome);
	}
	public Double valor;
	public Double codigo;
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getCodigo() {
		return codigo;
	}
	public void setCodigo(Double codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "SistemPagamento [valor=" + valor + ", codigo=" + codigo + "]";
	}
	
}
