package br.com.todolist.model;

public enum StatusTarefa {

	PENDENTE("Pendente"), FAZENDO("Fazendo"), CONCLUIDO("concluido"), CANCELADO("Cancelado");

	private String status;

	StatusTarefa(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
