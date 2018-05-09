package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import BBDD.BD_Conector;
import Modelos.Administrador;

public class BD_Administrador extends BD_Conector {
	private static Statement s;	
	private static ResultSet reg;
	public BD_Administrador(String fileName) {
		
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	
	public  int añadir_Administrador( Administrador ad){	
		String cadenaSQL="INSERT INTO administrador VALUES('" + ad.getNombre() + "','" +
		ad.getCodAdmin()+"','"+ ad.getEmail() +"',"+ ad.getPassword()+",'";	
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
	
	public  Vector<String> listadoAdministrador(){
		String cadenaSQL="SELECT Administrador from Administrador";
		Vector<String> listaAdministrador=new Vector<String>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				listaAdministrador.add(reg.getString(1));
			}			
			s.close();
			this.cerrar();
			return listaAdministrador;
		}
		catch ( SQLException e){
		//	System.out.println(e.getMessage());
			return null;	
		}
	}
}