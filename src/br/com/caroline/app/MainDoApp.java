package br.com.caroline.app;


import br.com.caroline.composicao.Cargo;
import br.com.caroline.composicao.Endereco;
import br.com.caroline.composicao.Profissao;
import br.com.caroline.composicao.Telefone;
import br.com.caroline.estruturas.ListaDeTelefonesNaoOrdenados;
import br.com.caroline.pessoas.Cliente;
import br.com.caroline.pessoas.Funcionario;
import br.com.caroline.pessoas.Pessoa;

import java.time.LocalDate;
import java.time.Month;

public class MainDoApp {

	public static void main(String[] args) {
		// criando um endereço
		Endereco endereco1 = new Endereco();
		endereco1.cadastrarEnd("Rua Antônio da Rocha", "111", "11111111", "João Pessoa", "Paraíba", "Brasil");

		// criando um funcionário
		Funcionario funcionario1 = new Funcionario();
		funcionario1.cadastrarFuncionario(01, Cargo.ESTAGIARIO, 3000.0, LocalDate.of(2022,4,15),"Marcos", LocalDate.of(1980,10,16), endereco1, "8855667799" );
		System.out.println("Nome do Funcionário: " + funcionario1.getNome());
		System.out.println("Data Admissão do Funcionário: " + funcionario1.getDataAdmissao());
		System.out.println("CEP do Funcionário: " + funcionario1.getEndereco().getCep());
		System.out.println("Idade do Funcionário: " + funcionario1.obterIdade());

		System.out.println();

		// criando um cliente
		Cliente cliente1 = new Cliente();
		cliente1.cadastrarCliente("02", Profissao.ENGENHEIRO, "Joana", LocalDate.of(1988,7,8), endereco1, "7899453315" );
		System.out.println("Nome do Cliente: " + cliente1.getNome());
		System.out.println("Profissão do Cliente: " + cliente1.getProfissao());
		System.out.println("CEP do Cliente: " + cliente1.getEndereco().getCep());
		System.out.println("Idade do Cliente: " + cliente1.obterIdade());

		// criando uma lista de telefone e criando telefones
		ListaDeTelefonesNaoOrdenados minhaLista = new ListaDeTelefonesNaoOrdenados();

		Telefone telefone1 = new Telefone("83", "88401582");
		Telefone telefone2 = new Telefone("85", "99804516");
		Telefone telefone3 = new Telefone("87", "96547812");

//		minhaLista.addTelefone(telefone1);
//		minhaLista.addTelefone(telefone2);
//		minhaLista.addTelefone(telefone3);

		System.out.println("Telefones antes da remoção:");
		minhaLista.exibirTelefones();

		// Remover o telefone2
		minhaLista.removerTelefone(telefone2);

		System.out.println("\nTelefones após a remoção:");
		minhaLista.exibirTelefones();

		// Exibe os telefones se a lista não estiver vazia
		if (!minhaLista.isEmpty()) {
			System.out.println("Telefones na lista:");
			minhaLista.exibirTelefones();
		} else {
			System.out.println("A lista de telefones está vazia.");
		}

	}

}
