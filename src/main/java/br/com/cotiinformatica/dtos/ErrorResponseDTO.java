package br.com.cotiinformatica.dtos;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErrorResponseDTO {
	
	private HttpStatus status;
	private List<String> errors;

}
