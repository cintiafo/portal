package br.gov.bom.retiro.portal.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaDTO {
	
	private TipoPessoa tipoPessoa;
	private String identificador;
	private String nome;

}
