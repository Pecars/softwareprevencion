package prevreg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prevreg.db.Conexion;
import prevreg.interfaz.ClientesInterfaz;
import prevreg.model.ClientesModel;



public class ClientesDao implements  ClientesInterfaz {

	@Override
	public boolean crearCliente(ClientesModel cliente) {
		// TODO Auto-generated method stub
		
				
		boolean registrar = false;
				
				Statement stm = null;
				Connection con = null;
				
				
				
				String sql = "Insert into empresa values ('"+ cliente.getIdClientes() +"','" + cliente.getNombreEmpresa() +
							"','"+ cliente.getRepresentanteEmpresa()+"','" + cliente.getRutEmpresa() + 
							"',' " + cliente.getDireccionEmpresa() + " ','" + cliente.getTelefonoEmpresa()+ 
							"','" + cliente.getCorreoEmpresa() + "','" + cliente.getGiroEmpresa() + 
							"',' TO_DATE('" + cliente.getFechaIngresoE() + "', 'yyyy/mm/dd') ','" + cliente.getTrabajadoresEnero()+ 
							"','" + cliente.getTrabajadoresAbril() + "',' " + cliente.getTrabajadoresJulio() + 
							"','" + cliente.getTrabajadoresOctubre() + "','0','" + cliente.getRutAdministrador()+ "')";
				
				
				try {
					con = Conexion.getConnection();
					stm = con.createStatement();
					stm.execute(sql);
					registrar = true;
					stm.close();
					//con.close();
				}catch(SQLException e) {
					System.out.println("Error: Clase ClientesDao, método crearCliente");
					e.printStackTrace();
				}
				
				return registrar;	

		
	}

	@Override
	public List<ClientesModel> leerCliente() {
		// TODO Auto-generated method stub

	Connection con = null;
	Statement stm = null;
	ResultSet rs = null;
	
	String sql = "SELECT * FROM empresa";
	
	List<ClientesModel> listaClientes = new ArrayList<ClientesModel>();
	
	try{
		
		con = Conexion.getConnection();
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
		
		while (rs.next()){
			
			ClientesModel e = new ClientesModel();
			e.setIdClientes(rs.getInt(1));
			e.setNombreEmpresa(rs.getString(2));
			e.setRepresentanteEmpresa(rs.getString(3));
			e.setRutEmpresa(rs.getInt(4));
			e.setDireccionEmpresa(rs.getString(5));
			e.setTelefonoEmpresa(rs.getString(6));
			e.setCorreoEmpresa(rs.getString(7));
			e.setGiroEmpresa(rs.getString(8));
			e.setFechaIngresoE(rs.getDate(9));
			e.setTrabajadoresEnero(rs.getInt(10));
			e.setTrabajadoresAbril(rs.getInt(11));
			e.setTrabajadoresJulio(rs.getInt(12));
			e.setTrabajadoresOctubre(rs.getInt(13));
			e.setTasaAccidentabilidad(rs.getFloat(14));
			e.setRutAdministrador(rs.getInt(15));
			listaClientes.add(e);
		}
		
		stm.close();
		rs.close();
		//con.close();
		
	}catch(SQLException excep){
		
		System.out.println("Error en la clase de empresas, método leer empresas");
		excep.printStackTrace();
		
	}
	
	return listaClientes;
	
	}

	@Override
	public boolean actualizarUsuario(ClientesModel cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCliente(ClientesModel cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClientesModel obtenerCliente(int rutEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
