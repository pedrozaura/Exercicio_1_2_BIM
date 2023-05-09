package Classes;

public class App {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Pedro A", "Rua da Sabedoria", "45 99990982");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("-------------------------------");
		
		Funcionario funcionario = new Funcionario("Lucas L", "Rua da Liberdade", "4599883222", "Tecnico", 7000.0);
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("-------------------------------");
		
		Fornecedor fornecedor = new Fornecedor("Chevrolet GM", "Rua Dos Carros", "33522262", "Revenda de Veiculos",5000.0);
		System.out.println("Nome:  " + fornecedor.getNome());
		System.out.println("Endereço: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Produtos Fornecidos: " + fornecedor.getProdutoFornecido());
		System.out.println("Valor da Compra:  " + fornecedor.getValorCompra());
		System.out.println("-------------------------------");
	
		Cliente cliente = new Cliente("Joao Soban", "Rua Da Programacao", "4499998765", 1001, 4570.0);
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Codigo: " + cliente.getCodigoCliente());
		System.out.println("Limite Credito: " + cliente.getLimiteCredito());
		System.out.println("-------------------------------");
		

	}

}
