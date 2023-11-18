package br.com.cotiinformatica.dtos;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class SuccessResponseDTO {

	private HttpStatus status;
	private String message;

}
