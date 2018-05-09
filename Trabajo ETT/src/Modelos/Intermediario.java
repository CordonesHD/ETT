package Modelos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Intermediario {
	private String nombre;
	private String apellido;
	private String dni;
	private String codInter;
	public Intermediario(String nombre, String apellido, String dni, String codInter) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.codInter = codInter;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodInter() {
		return codInter;
	}
	public void setCodInter(String codInter) {
		this.codInter = codInter;
	}
	@Override
	public String toString() {
		return "Intermediario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", codInter=" + codInter
				+ "]";
	}
	
	
}