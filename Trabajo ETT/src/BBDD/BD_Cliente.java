package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import BBDD.BD_Conector;
import Modelos.Cliente;

public class BD_Cliente extends BD_Conector {
	private static Statement s;	
	private static ResultSet reg;
	public BD_Cliente(String fileName) {
		
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	
	public  int añadir_Cliente( Cliente cl){	
		String cadenaSQL="INSERT INTO cliente VALUES('" + cl.getNombre() + "','" +
		cl.getApellido()+"','"+ cl.getDni() +"',"+ cl.getLoc()+",'"+ cl.getEmail() +"',"+ cl.getSector()+",'"+ cl.getNivelEstudio() +"',";	
		try{
		this.abrir();
		s=c.createStatement();
		int filas=s.executeUpdate(cadenaSQL);
		s.close();
		this.cerrar();
		return filas;
		}
		catch ( SQLException e){			
			return -1;
		}
	}
	
	public  Vector<String> listadoCliente(){
		String cadenaSQL="SELECT Cliente from Cliente";
		Vector<String> listaCliente=new Vector<String>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				listaCliente.add(reg.getString(1));
			}			
			s.close();
			this.cerrar();
			return listaCliente;
		}
		catch ( SQLException e){
		//	System.out.println(e.getMessage());
			return null;	
		}
	}
}
