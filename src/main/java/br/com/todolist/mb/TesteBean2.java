package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import br.com.todolist.model.Teste2;
import br.com.todolist.repositories.TesteRepository2;

@Named
@ViewScoped

public class TesteBean2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private TesteRepository2 repository;

	private Teste2 novoTeste;

	public TesteBean2() {
		novoTeste = new Teste2();
	}

	public void salvarRegistro() {
		repository.salvar(novoTeste);
	}

	public Teste2 getNovoTeste() {
		return novoTeste;
	}

}
