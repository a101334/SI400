package br.ftunicamp.veterinaria.exception;

/**
 *
 * @author Amadeu Carvalho
 */
@SuppressWarnings("serial")
public class CpfInvalidoException extends Exception {
	public CpfInvalidoException() {
		super();	
	}
	public CpfInvalidoException(String message) {
		super(message);		
	}
}
