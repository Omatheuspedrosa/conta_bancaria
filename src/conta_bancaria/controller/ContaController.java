package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.Optional;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	// Criação da Collection
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	// Variável para receber o número da conta
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent())
			conta.get().visualizar();
		else
			System.out.println("A conta número: " + numero + " não foi encontrada");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("Conta número:" + conta.getNumero() + " Cadastrada!");

	}

	@Override
	public void atualizar(Conta conta) {
		
		Optional<Conta> buscaConta = buscarNaCollection(conta.getNumero());
		
		if(buscaConta.isPresent()) {
			listaContas.set(listaContas.indexOf(buscaConta.get()), conta);
			System.out.println("A Conta número: " + numero + " foi atualizada com sucesso!");
		}else
			System.out.println("A Conta número: " + conta.getNumero() + " não foi encontrada");

	}

	@Override
	public void deletar(int numero) {
		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent())
			if(listaContas.remove(conta.get()) == true)
				System.out.println("Conta número: " + numero + " excluída com sucesso!");
		else
			System.out.println("A conta número: " + numero + " não foi encontrada");
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	/* Métodos auxiliares */

	public int gerarNumero() {
		return ++numero;
	}

	public Optional<Conta> buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return Optional.of(conta);
		}

		return Optional.empty();
	}

}
