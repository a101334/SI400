package br.ftunicamp.veterinaria.exception;

/**
 *
 * @author amadeu.carvalho
 */
public class LoginException extends Exception {  
   	public LoginException(String msg) {
		super(msg);	
	}
	public LoginException(String message , Throwable causa) {
		super(message, causa);		
	}	  
}
