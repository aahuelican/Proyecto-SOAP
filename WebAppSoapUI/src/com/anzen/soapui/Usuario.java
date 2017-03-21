package com.anzen.soapui;

public class Usuario {
	   private String nombre;
	   private String telefono;
	   
    public String altaAlumno(String nombre,String telefono){
	 return "nombre del registro: "+nombre;
    }

	public String getNombre() {
	 return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	}
