package Singleton;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usando o Singleton Como Padrão de projeto 
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia(); 
		System.out.println(lazy);
		
		
		SingletonFager lazy2 = SingletonFager.getInstancia();
		System.out.println(lazy2);
		lazy2 = SingletonFager.getInstancia(); 
		System.out.println(lazy2);
		
		//Não estamos consumindo memória, estamos usando o mesmo local de memória.
		SingletonFagerHolder lazy3 = SingletonFagerHolder.getInstancia();
		System.out.println(lazy3);
		lazy3 = SingletonFagerHolder.getInstancia(); 
		System.out.println(lazy3);
	}

}
