package prevreg.model;

/**

 * @author Nice

 */

public class CapacitacionAgendadaModel {
	

		private int id_instancia;
		private int id_capacitacion;
		private int id_profesional;
		private int id_empresa;
		private boolean estado_capacitacion;
		private String tema_capacitacion;
		private String fecha_agendada;
		
		
		
		public CapacitacionAgendadaModel() {
		}

		public CapacitacionAgendadaModel(int id_capacitacion, int id_profesional,
				int id_empresa) {
			this.id_capacitacion = id_capacitacion;
			this.id_profesional = id_profesional;
			this.id_empresa = id_empresa;
		}




		public CapacitacionAgendadaModel(int id_capacitacion, int id_profesional, int id_empresa, String tema_capacitacion, String fecha_agendada) 
		{

			this.id_capacitacion = id_capacitacion;
			this.id_profesional = id_profesional;
			this.id_empresa = id_empresa;
			this.tema_capacitacion = tema_capacitacion;
			this.fecha_agendada = fecha_agendada;
			estado_capacitacion = true;
//			CapacitacionDao userDao = new CapacitacionDao();
	//		id_instancia = userDao.autoIncremental();
			
		}



		public int getId_instancia() {
			return id_instancia;
		}

		public int getId_capacitacion() {
			return id_capacitacion;
		}



		public void setId_capacitacion(int id_capacitacion) {
			this.id_capacitacion = id_capacitacion;
		}



		public int getId_profesional() {
			return id_profesional;
		}



		public void setId_profesional(int id_profesional) {
			this.id_profesional = id_profesional;
		}



		public int getId_empresa() {
			return id_empresa;
		}



		public void setId_empresa(int id_empresa) {
			this.id_empresa = id_empresa;
		}



		public boolean getEstado_capacitacion() {
			return estado_capacitacion;
		}



		public void setEstado_capacitacion(boolean estado_capacitacion) {
			this.estado_capacitacion = estado_capacitacion;
		}



		public String getTema_capacitacion() {
			return tema_capacitacion;
		}



		public void setTema_capacitacion(String tema_capacitacion) {
			this.tema_capacitacion = tema_capacitacion;
		}



		public String getFecha_agendada() {
			return fecha_agendada;
		}



		public void setFecha_agendada(String fecha_agendada) {
			this.fecha_agendada = fecha_agendada;
		}



		@Override
		public String toString() {
			return "CapacitacionAgendada [id_capacitacion=" + id_capacitacion + ", id_profesional="
					+ id_profesional + ", id_empresa=" + id_empresa
					+ ", estado_capacitacion=" + estado_capacitacion
					+ ", tema_capacitacion=" + tema_capacitacion
					+ ", fecha_agendada=" + fecha_agendada + "]";
		}
		
		
		

	}


