package one.digital.innovation.Strategy;

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("O robô está se movendo defensivamente");
	}
}
