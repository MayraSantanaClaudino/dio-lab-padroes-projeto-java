/**
 * 
 */
package one.digital.innovation.Singleton;

/**
 * Singleton "apressado"
 * @author Mayra
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
