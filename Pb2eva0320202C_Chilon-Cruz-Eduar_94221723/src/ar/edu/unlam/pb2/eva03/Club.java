package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	
	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new TreeMap<String, Evento>();
	}


	public void agregarDeportista(Deportista corredor) {
			this.socios.add(corredor);	
	}


	public Integer getCantidadSocios() {
		Integer total = socios.size();
		return total;
	}


	public void crearEvento(TipoDeEvento tipoEvento, String nombre) {
		Evento nuevo = new Evento(tipoEvento);
	competencias.put(nombre, nuevo);
	}


	public Integer inscribirEnEvento(String nombre, Deportista agregado) throws NoEstaPreparado{
		Integer cantidad =0;
		Evento nuevo = competencias.get(nombre);
		TipoDeEvento aux = nuevo.getTipo();
		switch(aux) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(agregado instanceof Nadador)
				cantidad = nuevo.agregarDeportistaAlEvento(agregado);
				else
					throw new NoEstaPreparado("No es Nadador");
				break;
		case TRIATLON_IRONMAN:
			if(agregado instanceof Triatleta)
				cantidad = nuevo.agregarDeportistaAlEvento(agregado);
				else
					throw new NoEstaPreparado("No es Triatleta");
				break;
		case CARRERA_42K:
			if(agregado instanceof Corredor)
			cantidad = nuevo.agregarDeportistaAlEvento(agregado);
			else
				throw new NoEstaPreparado("No es Corredor");
			break;
			default:
				break;
				
		}return cantidad;
	}
	
	
	
	
	
}
