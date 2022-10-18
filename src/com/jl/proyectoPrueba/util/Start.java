package com.jl.proyectoPrueba.util;

import java.util.Date;

import com.jl.proyectoPrueba.Coches.Coche;
import com.jl.proyectoPrueba.Personas.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Jose", new Date(), "Oviedo");
		
		Coche coche = new Coche(persona);
		coche.setConsumo(2.4f);
		coche.setPuertas(5);
		
		System.out.println(coche);
		
	}

}
