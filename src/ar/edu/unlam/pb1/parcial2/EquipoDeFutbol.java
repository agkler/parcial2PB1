package ar.edu.unlam.pb1.parcial2;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		jugadores = new Jugador[5];
	}

	/*
	 * La capacidad m�xima de un equipo es 5. No se permiten jugadores repetidos (ya sea el n�mero o nombre del jugador) Se retorna el resultado de la operaci�n
	 */
	public boolean agregarJugador(Jugador nuevo) {
		if (jugadores[nuevo.getNumero()-1] != null) {
			jugadores[nuevo.getNumero()-1] = nuevo;
			return true;
		}
		return false;
	}

	/*
	 * Permite buscar un jugador por su numero.
	 * 
	 */
	public Jugador buscar(int numero) {
		Jugador numeroBuscado = null;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getNumero() == numero) {
				numeroBuscado = jugadores[i];
			}
		}
		return numeroBuscado;
	}

	/*
	 * Permite buscar un jugador por su nombre.
	 * 
	 */
	public Jugador buscar(String nombre) {
		Jugador nombreBuscado = null;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getNombre() == nombre) {
				nombreBuscado = jugadores[i];
			}
		}
		return nombreBuscado;
	}

	/*
	 * Calcula el valor del equipo.
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		double sumatoriaEdad = 0.0;
		for (Jugador jugador : jugadores) {
			sumatoriaEdad += jugador.getEdad();
		}
		return sumatoriaEdad / 5;
	}

	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double sumatoriaPrecio = 0.0;
		for (Jugador jugador : jugadores) {
			sumatoriaPrecio += jugador.getPrecio();
		}
		return sumatoriaPrecio;
	}

	public String toString() {
		return this.nombre;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

}
