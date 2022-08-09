package Singleton;

/*
 * Singleton Lazy Holder
 * */

public class SingletonFagerHolder {
	
	private static class InstanceHolder { 
		private static SingletonFagerHolder instancia = new SingletonFagerHolder(); 
	}
	
	private SingletonFagerHolder() { 
		super();
	}
	
	public static SingletonFagerHolder getInstancia() { 
		return InstanceHolder.instancia;
	}
}
