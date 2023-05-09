package Classes;

public class Cliente extends Pessoa{
	
	private int codigoCliente;
	private double limiteCredito;
	
	public Cliente(String nome, String endereco, String telefone, int codigoCliente, double limiteCredito) {
		super(nome, endereco, telefone);
		
		this.codigoCliente = codigoCliente;
		this.limiteCredito = limiteCredito;
		
	}
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
	
	
	
	
	
	

}
