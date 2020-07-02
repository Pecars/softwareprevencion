package prevreg.dao;

/**

 * @author Nice

 */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import prevreg.db.Conexion;
import prevreg.interfaz.CapacitacionInterfaz;
import prevreg.model.CapacitacionAgendadaModel;
import prevreg.model.CapacitacionModel;

public class CapacitacionDao implements CapacitacionInterfaz{


	@Override
	public boolean IngresarCapacitacion(CapacitacionAgendadaModel user) {
		// TODO Auto-generated method stub
		boolean agendar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Instancia_Capacitacion VALUES ('"+user.getId_instancia()+"','"+user.getFecha_agendada()+"',,'"+user.getEstado_capacitacion()+"','"+user.getTema_capacitacion()+"',,'"+user.getId_capacitacion()+"','"+user.getId_profesional()+"','"+user.getId_empresa()+"')";
		
		try
		{
			con = Conexion.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agendar = true;
			stm.close();
		}
		catch(SQLException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
		return agendar;
		
		
	}
/*
	@Override
	public int autoIncremental() {
		// TODO Auto-generated method stub
		int id = 1;
				
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT TOP 1 id_ins FROM Instancia_Capacitacion order by id_ins desc";
		
		try
		{
			con = Conexion.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			if(rs != null && rs.getInt(1) != 0)
			{
			id = rs.getInt(1) + 1;
			}
			stm.close();
			rs.close();
		}
		catch(SQLException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
		
		return id;
	}

	@Override
	public List<Empresa> buscarDatosEmpresa() {
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT ID_EMP, NOMBRE_EMPRESA, RUT_EMPRESA FROM EMPRESA";
		
		List<Empresa> listaEmpresa = new ArrayList<Empresa>();
		
		try
		{
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next())
			{
				Empresa user = new Empresa();
				user.setId(rs.getInt(1));
				user.setNombre(rs.getString(2));
				user.setRut(rs.getString(3));
				listaEmpresa.add(user);
			}
			stm.close();
			rs.close();
		}
		catch(SQLException e)
		{
			System.out.println();
			e.printStackTrace();
		}
		
		return listaEmpresa;
	}
*/
	@Override
	public List<CapacitacionModel> buscarDatosCapacitacion() {
		// TODO Auto-generated method stub
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT ID_CAP, NOMBRE_CAPACITACION FROM CAPACITACION";
		
		List<CapacitacionModel> listaCapacitacion = new ArrayList<CapacitacionModel>();
		
		try
		{
			con = Conexion.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next())
			{
				CapacitacionModel user = new CapacitacionModel();
				user.setId_capacitacion(rs.getInt(1));
				user.setNombre_capacitacion(rs.getString(2));
				listaCapacitacion.add(user);
			}
			stm.close();
			rs.close();
		}
		catch(SQLException e)
		{
			System.out.println();
			e.printStackTrace();
		}
		
		return listaCapacitacion;
	}

	/*
	@Override
	public List<Profesional> buscarDatosProfesional() {
		// TODO Auto-generated method stub
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		
		String sql = "SELECT ID_PRO, NOMBRE_PROFESIONAL, APELLIDO_PROFESIONAL, RUT_PROFESIONAL FROM PROFESIONALES";
		
		List<Profesional> listaProfesional = new ArrayList<Profesional>();
		
		try
		{
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next())
			{
				Profesional user = new Profesional();
				user.setId(rs.getInt(1));
				user.setNombre(rs.getString(2));
				user.setApellido(rs.getString(3));
				user.setRut(rs.getString(4));
				listaProfesional.add(user);
			}
			stm.close();
			rs.close();
		}
		catch(SQLException e)
		{
			System.out.println();
			e.printStackTrace();
		}
		
		return listaProfesional;
	}
*/
}
