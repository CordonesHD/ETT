package Modelos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	private String loc;
	private String email;
	private String sector;
	private String nivelEstudio;
	
	public Cliente(String nombre, String apellido, String dni, String loc, String email, String sector,
			String nivelEstudio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.loc = loc;
		this.email = email;
		this.sector = sector;
		this.nivelEstudio = nivelEstudio;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getNivelEstudio() {
		return nivelEstudio;
	}
	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", loc=" + loc + ", email="
				+ email + ", sector=" + sector + ", nivelEstudio=" + nivelEstudio + "]";
	}
	
	
}