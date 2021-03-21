package br.com.nunesmis.restwithspringboot.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private LocalDateTime timestamp;
	private String message;
	private String datails;
}
