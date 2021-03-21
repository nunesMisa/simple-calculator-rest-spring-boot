package br.com.nunesmis.restwithspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationalException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public UnsuportedMathOperationalException(String exception) {
		super(exception);
	}
	
}
