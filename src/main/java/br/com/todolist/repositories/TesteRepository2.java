package br.com.todolist.repositories;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;


import br.com.todolist.model.Teste2;
import br.com.todolist.util.Transacional;

public class TesteRepository2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	@Transacional
	public void salvar(Teste2 novoTeste) {
		entityManager.merge(novoTeste);
	}
	
	

}



