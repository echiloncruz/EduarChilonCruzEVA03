package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento implements Comparable <Evento>{

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion) {
		this.tipo = tipo;
		this.participantes = new TreeMap <Integer, Deportista>();
		this.numeroDeInscripcion =numeroDeInscripcion;
	}
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.participantes = new TreeMap <Integer, Deportista>();	
		this.numeroDeInscripcion=0;
	}


	public TipoDeEvento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}


	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}


	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}


	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	
	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	
	
	public Integer agregarDeportistaAlEvento(Deportista deportista) {
		numeroDeInscripcion++; /*a medida que va aumnetando primero es porque creo un numero*/
		participantes.put(this.numeroDeInscripcion, deportista);
		return this.getNumeroDeInscripcion(); 
	}


	@Override
	public int compareTo(Evento o) {
		
		return this.numeroDeInscripcion.compareTo(o.getNumeroDeInscripcion());
	}
	
	
	
	
}
