/**
 * 
 */
package one.digital.innovation.Singleton;

/**
 * Singleton "preguiçoso"
 * @author Mayra
 *
 */
public class SingletonLazy {

	/**
	 * @param args
	 */
	private static SingletonLazy instancia;
	
	private SingletonLazy () {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
