package Singleton;

/*
 * Singleton Apressado
 * */

public class SingletonFager {
	
	
	private static SingletonFager instancia = new SingletonFager(); 
	
	private SingletonFager() { 
		super();
	}
	
	public static SingletonFager getInstancia() { 
		return instancia;
	}
}
