package br.com.cotiinformatica.handlers;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.cotiinformatica.dtos.ErrorResponseDTO;

@ControllerAdvice
public class IllegalArgumentExceptionHandler {
	@ExceptionHandler(IllegalArgumentException.class) // erro que será capturado
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorResponseDTO handleIllegalArgumentException(IllegalArgumentException e) {
		ErrorResponseDTO response = new ErrorResponseDTO();
		response.setStatus(HttpStatus.BAD_REQUEST);
		response.setErrors(new ArrayList<String>());
		response.getErrors().add(e.getMessage());
		return response;
	}
}


