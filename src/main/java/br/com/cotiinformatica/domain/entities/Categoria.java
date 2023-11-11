package br.com.cotiinformatica.domain.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data //Anotation do lombok (Gera tudo)
public class Categoria {

	private UUID id;
	private String nome;
	private List<Produto> produtos;
	
}
