package Strategy;

public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento Agressivo = new ComportamentoAgressivo();
		
		Robo myRob = new Robo();
		
		//Modo normal
		myRob.setStrategy(normal);
		myRob.mover();
		myRob.mover();
		
		//Modo defensivo 
		myRob.setStrategy(defensivo);
		myRob.mover();
		myRob.mover();
		
		//Modo agressivo 
		myRob.setStrategy(Agressivo);
		myRob.mover();
		myRob.mover();
		
	}

}
