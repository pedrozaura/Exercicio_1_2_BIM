package Classes;

public class Fornecedor extends Pessoa{
	
	private String produtoFornecido;
	private double valorCompra;
	
	public Fornecedor(String nome, String endereco, String telefone, String produtoFornecido, double valorCompra) {
		super(nome, endereco, telefone);
		this.produtoFornecido = produtoFornecido;
		this.valorCompra = valorCompra;
		}
	
	public String getProdutoFornecido() {
		return produtoFornecido;
	}
	
	public void setProdutoFornecido(String produtoFornecido) {
		this.produtoFornecido = produtoFornecido;
	}
	
	public double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
	
	
}
