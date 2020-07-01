package prevreg.model;

public class ClientesModel {
	
	public int idClientes;
	public String nombreEmpresa;
	public String representanteEmpresa;
	public String rutEmpresa;
	public String direccionEmpresa;
	public String telefonoEmpresa;
	public String correoEmpresa;
	public String giroEmpresa;
	public String fechaIngresoE;
	public int trabajadoresEnero;
	public int trabajadoresAbril;
	public int trabajadoresJulio;
	public int trabajadoresOctubre;
	public float tasaAccidentabilidad;
	public int administrador;

	
	public ClientesModel() {
	}


	public ClientesModel(int idClientes, String nombreEmpresa,
			String representanteEmpresa, String rutEmpresa,
			String direccionEmpresa, String telefonoEmpresa,
			String correoEmpresa, String giroEmpresa, String fechaIngresoE,
			int trabajadoresEnero, int trabajadoresAbril,
			int trabajadoresJulio, int trabajadoresOctubre,
			float tasaAccidentabilidad, int administrador) {
		this.idClientes = idClientes;
		this.nombreEmpresa = nombreEmpresa;
		this.representanteEmpresa = representanteEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.giroEmpresa = giroEmpresa;
		this.fechaIngresoE = fechaIngresoE;
		this.trabajadoresEnero = trabajadoresEnero;
		this.trabajadoresAbril = trabajadoresAbril;
		this.trabajadoresJulio = trabajadoresJulio;
		this.trabajadoresOctubre = trabajadoresOctubre;
		this.tasaAccidentabilidad = tasaAccidentabilidad;
		this.administrador = administrador;
	}


	public int getIdClientes() {
		return idClientes;
	}


	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getRepresentanteEmpresa() {
		return representanteEmpresa;
	}


	public void setRepresentanteEmpresa(String representanteEmpresa) {
		this.representanteEmpresa = representanteEmpresa;
	}


	public String getRutEmpresa() {
		return rutEmpresa;
	}


	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}


	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}


	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}


	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}


	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}


	public String getCorreoEmpresa() {
		return correoEmpresa;
	}


	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}


	public String getGiroEmpresa() {
		return giroEmpresa;
	}


	public void setGiroEmpresa(String giroEmpresa) {
		this.giroEmpresa = giroEmpresa;
	}


	public String getFechaIngresoE() {
		return fechaIngresoE;
	}


	public void setFechaIngresoE(String fechaIngresoE) {
		this.fechaIngresoE = fechaIngresoE;
	}


	public int getTrabajadoresEnero() {
		return trabajadoresEnero;
	}


	public void setTrabajadoresEnero(int trabajadoresEnero) {
		this.trabajadoresEnero = trabajadoresEnero;
	}


	public int getTrabajadoresAbril() {
		return trabajadoresAbril;
	}


	public void setTrabajadoresAbril(int trabajadoresAbril) {
		this.trabajadoresAbril = trabajadoresAbril;
	}


	public int getTrabajadoresJulio() {
		return trabajadoresJulio;
	}


	public void setTrabajadoresJulio(int trabajadoresJulio) {
		this.trabajadoresJulio = trabajadoresJulio;
	}


	public int getTrabajadoresOctubre() {
		return trabajadoresOctubre;
	}


	public void setTrabajadoresOctubre(int trabajadoresOctubre) {
		this.trabajadoresOctubre = trabajadoresOctubre;
	}


	public float getTasaAccidentabilidad() {
		return tasaAccidentabilidad;
	}


	public void setTasaAccidentabilidad(float tasaAccidentabilidad) {
		this.tasaAccidentabilidad = tasaAccidentabilidad;
	}


	public int getAdministrador() {
		return administrador;
	}


	public void setAdministrador(int administrador) {
		this.administrador = administrador;
	}


	@Override
	public String toString() {
		return "ClientesModel [idClientes=" + idClientes + ", nombreEmpresa="
				+ nombreEmpresa + ", representanteEmpresa="
				+ representanteEmpresa + ", rutEmpresa=" + rutEmpresa
				+ ", direccionEmpresa=" + direccionEmpresa
				+ ", telefonoEmpresa=" + telefonoEmpresa + ", correoEmpresa="
				+ correoEmpresa + ", giroEmpresa=" + giroEmpresa
				+ ", fechaIngresoE=" + fechaIngresoE + ", trabajadoresEnero="
				+ trabajadoresEnero + ", trabajadoresAbril="
				+ trabajadoresAbril + ", trabajadoresJulio="
				+ trabajadoresJulio + ", trabajadoresOctubre="
				+ trabajadoresOctubre + ", tasaAccidentabilidad="
				+ tasaAccidentabilidad + ", administrador=" + administrador
				+ "]";
	}

	
	
	
	
}



