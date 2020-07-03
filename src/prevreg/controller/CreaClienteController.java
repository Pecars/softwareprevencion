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
 * Servlet implementation class CreaClienteController
 */
public class CreaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreaClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("CreaCliente.jsp").forward(request, response);
		
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
		//String fechaIngresoEstr = request.getParameter("txtfechaingresoempresa");
		
		String newstring = new SimpleDateFormat("yyyy-MM-dd").format(request.getParameter("txtfechaingresoempresa"));
		System.out.println(newstring);

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date fechaIngresoE = null;
			try {
				fechaIngresoE = (Date)sdf.parse(newstring);
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
		
		boolean agregar = clienteDao.crearCliente(cliente);
		
		String mensaje = "";

		if (agregar){
			
			mensaje = "El cliente ha sido agregado exitosamente";
		}else{
			
			mensaje = "Ocurrió un error al añadir al cliente";

		}
		request.setAttribute("cumensaje", mensaje);
		request.getRequestDispatcher("CreaCliente.jsp").forward(request, response);

		
	}

}
