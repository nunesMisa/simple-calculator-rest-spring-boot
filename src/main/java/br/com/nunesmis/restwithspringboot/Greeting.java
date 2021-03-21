package br.com.nunesmis.restwithspringboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Greeting {

	private final long id;
	private final String content;
	
}
