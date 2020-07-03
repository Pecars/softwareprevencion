package prevreg.controller;

/**
 * @author Paula Carrasco
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prevreg.dao.ClientesDao;
import prevreg.model.ClientesModel;

/**
 * Servlet implementation class EliminaClienteController
 */
public class EliminaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminaClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int clienteId = Integer.parseInt(request.getParameter("idClientes"));
		
		ClientesModel cliente = new ClientesModel();
		cliente.setIdClientes(clienteId);
		
		ClientesDao clienteDao = new ClientesDao();
		boolean eliminar = clienteDao.eliminarCliente(cliente);
		
		List<ClientesModel>listadoeliminar = new ArrayList<ClientesModel>();
		
		listadoeliminar = clienteDao.leerCliente();
		
		String mensaje = "";		
		
		if (eliminar){
			
			mensaje = "La empresa ha sido correctamente eliminada del registro";
			
		}else{
			
			mensaje = "Ha ocurrido un error al eliminar la empresa, dao eliminar cliente";
		}
		
		request.setAttribute("cumensaje", mensaje);
		request.setAttribute("listadoempresas", listadoeliminar);
		request.getRequestDispatcher("LeeCliente.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
