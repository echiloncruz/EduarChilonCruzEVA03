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
		if(corredor instanceof Deportista)
			this.socios.add(corredor);	
	}


	public Integer getCantidadSocios() {
		Integer total = socios.size();
		return total;
	}


	public void crearEvento(TipoDeEvento tipoEvento, String descripcion) throws NoEstaPreparado{
		Evento nuevo = new Evento(tipoEvento);
		switch(tipoEvento) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			competencias.put(descripcion, nuevo);
			break;
		case TRIATLON_IRONMAN:
			competencias.put(descripcion, nuevo);
			break;
		case CARRERA_42K:
			competencias.put(descripcion, nuevo);
			break;
			default:
				throw new NoEstaPreparado("Este evento no es compatible");
		}
	}


	public Integer inscribirEnEvento(String string, Deportista celeste) {
		
		return 0;
	}
	
	
	
	
	
}
