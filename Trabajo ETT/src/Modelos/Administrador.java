package Modelos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Administrador {
	private String nombre;
	private String codAdmin;
	private String email;
	private String password;
	public Administrador(String nombre, String codAdmin, String email, String password) {
		super();
		this.nombre = nombre;
		this.codAdmin = codAdmin;
		this.email = email;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodAdmin() {
		return codAdmin;
	}
	public void setCodAdmin(String codAdmin) {
		this.codAdmin = codAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", codAdmin=" + codAdmin + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
}