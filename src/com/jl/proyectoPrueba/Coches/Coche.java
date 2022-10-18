package com.jl.proyectoPrueba.Coches;

import com.jl.proyectoPrueba.Personas.Persona;

/**
 * Clase que busca establecer el coche que vamos a tener todos
 * Es la clase mas guay del mundo
 * 
 * @author Mañana
 *
 */


public class Coche {
	private float consumo;
	private int cv;
	private float puertas;
	private Persona propietario;
	
	
	/**
	 * Este es el constructor de la clase Coche, 
	 * el único que hay por ahora
	 * @param propietario la Persona propietaria
	 */
	 
	 
	public Coche(Persona propietario) {
		this.propietario = propietario;
	}
	
	/**
	 * devuelve el consumo 
	 * @return el consumo del coche
	 */
	
	public float getConsumo() {
		return consumo;
	}
	
	/**
	 * establece el consumo 
	 * @param consumo el consumo que queremos grabar
	 * del coche
	 */
	
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public float getPuertas() {
		return puertas;
	}
	public void setPuertas(float puertas) {
		this.puertas = puertas;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	@Override
	public String toString() {
		return "Coche [consumo=" + consumo + ", cv=" + cv + ", puertas=" + puertas + ", propietario=" + propietario
				+ "]";
	}
	
	
	
}
