package prevreg.controller;

/**

 * @author Nice

 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prevreg.dao.CapacitacionDao;
import prevreg.model.CapacitacionAgendadaModel;


/**
 * Servlet implementation class CapacitacionControler
 */
public class CapacitacionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapacitacionController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_capacitacion = Integer.parseInt(request.getParameter("txtidcapacitacion"));
		int id_profesional = Integer.parseInt(request.getParameter("txtidprofesional"));
		int id_empresa = Integer.parseInt(request.getParameter("txtidempresa"));
		String tema_capacitacion = request.getParameter("txttemacapacitacion");
		String fecha_agendada = request.getParameter("txtnfechaagendada");
		
		CapacitacionAgendadaModel capA = new CapacitacionAgendadaModel(id_capacitacion, id_profesional, id_empresa, tema_capacitacion, fecha_agendada);
		
		CapacitacionDao userDao = new CapacitacionDao();
		
		boolean crear = userDao.IngresarCapacitacion(capA);
		String mensaje;
		
		if (crear){
			mensaje = "Se ha agendado la visita correctamente";
		}else{
			mensaje = "Error: No se ha podido agendar la visita, contacte a su administrador";
		}
		
		request.setAttribute("msj",mensaje);
		request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request,response);
	}

}
