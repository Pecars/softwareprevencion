package prevreg.controller;

/**
 * @author Paula Carrasco
 */

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prevreg.dao.ClientesDao;
import prevreg.model.ClientesModel;

/**
 * Servlet implementation class EditaClienteController
 */
public class EditaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditaClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	int empresarut = Integer.parseInt(request.getParameter("rut"));
	
	ClientesDao clienteDao = new ClientesDao();
	
	ClientesModel cliente = new ClientesModel();
	
	cliente = clienteDao.obtenerCliente(empresarut);
	
	
	request.setAttribute("datoscliente", cliente);
	
	request.getRequestDispatcher("EditaCliente.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int idClientes = Integer.parseInt(request.getParameter("txtidempresa"));
		String nombreEmpresa = request.getParameter("txtnombreempresa");
		String representanteEmpresa = request.getParameter("txtrepresentante");
		int rutEmpresa = Integer.parseInt(request.getParameter("txtrutempresa"));
		String direccionEmpresa= request.getParameter("txtdireccionempresa");
		String telefonoEmpresa = request.getParameter("txttelefonoempresa");
		String correoEmpresa = request.getParameter("txtcorreoempresa");
		String giroEmpresa = request.getParameter("txtgiroempresa");
		String fechaIngresoEstr = request.getParameter("txtfechaingresoempresa");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date fechaIngresoE = null;
			try {
				fechaIngresoE = (Date)sdf.parse(fechaIngresoEstr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/*
			String startDateStr = request.getParameter("startDate");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//surround below line with try catch block as below code throws checked exception
			Date startDate = sdf.parse(startDateStr);
			//do further processing with Date object
			*/
		int trabajadoresEnero = Integer.parseInt(request.getParameter("txttrabajadoresenero"));
		int trabajadoresAbril = Integer.parseInt(request.getParameter("txttrabajadoresabril"));
		int trabajadoresJulio = Integer.parseInt(request.getParameter("txttrabajadoresjulio"));
		int trabajadoresOctubre = Integer.parseInt(request.getParameter("txttrabajadoresoctubre"));
		//float tasaAccidentabilidad = Float.parseFloat(request.getParameter("StudentId"));
		int rutAdministrador = Integer.parseInt(request.getParameter("txtadministrador"));
		
		ClientesModel cliente = new ClientesModel(idClientes, nombreEmpresa, representanteEmpresa,
				rutEmpresa, direccionEmpresa, telefonoEmpresa, correoEmpresa, giroEmpresa, fechaIngresoE,
				trabajadoresEnero, trabajadoresAbril, trabajadoresJulio, trabajadoresOctubre, rutAdministrador);
		
		ClientesDao clienteDao = new ClientesDao();
		
		boolean editar = clienteDao.actualizarUsuario(cliente);
		
		String mensaje = "";

		if (editar){
			
			mensaje = "El cliente ha sido editado exitosamente";
		}else{
			
			mensaje = "Ocurrió un error al editar al cliente";

		}
		
		request.setAttribute("datoscliente", cliente);
		request.setAttribute("cumensaje", mensaje);
		request.getRequestDispatcher("EditaCliente.jsp").forward(request, response);

		
	}
		
		
		
		
		
	}


