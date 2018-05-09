package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import BBDD.BD_Conector;
import Modelos.Intermediario;

public class BD_Intermediario extends BD_Conector {
	private static Statement s;	
	private static ResultSet reg;
	public BD_Intermediario(String fileName) {
		
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	
	public  int añadir_Intermediario( Intermediario in){	
		String cadenaSQL="INSERT INTO intermediario VALUES('" + in.getNombre() + "','" +
		in.getApellido()+"','"+ in.getDni() +"',"+ in.getCodInter()+",'";	
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
	
	public  Vector<String> listadoIntermediario(){
		String cadenaSQL="SELECT Administrador from Administrador";
		Vector<String> listaIntermediario=new Vector<String>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				listaIntermediario.add(reg.getString(1));
			}			
			s.close();
			this.cerrar();
			return listaIntermediario;
		}
		catch ( SQLException e){
		//	System.out.println(e.getMessage());
			return null;	
		}
	}
}
