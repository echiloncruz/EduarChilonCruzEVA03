package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Ciclista extends Deportista{

	private String tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}
	
	public Ciclista() {
		super();
	}

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	

	
	
}
