package prevreg.model;

/**
 * @author Paula Carrasco
 * 
 */

public class AdministradorModel {
	
	public int idAdministrador;
	public String usuarioAdministrador;
	public String claveAdministrador;
	public String nombreAdministrador;
	public int telefonoAdministrador;
	public String correoAdministrador;
	public int rutAdministrador;

	public AdministradorModel() {
	}

	public AdministradorModel(int idAdministrador, String usuarioAdministrador,
			String claveAdministrador, String nombreAdministrador,
			int telefonoAdministrador, String correoAdministrador,
			int rutAdministrador) {
		this.idAdministrador = idAdministrador;
		this.usuarioAdministrador = usuarioAdministrador;
		this.claveAdministrador = claveAdministrador;
		this.nombreAdministrador = nombreAdministrador;
		this.telefonoAdministrador = telefonoAdministrador;
		this.correoAdministrador = correoAdministrador;
		this.rutAdministrador = rutAdministrador;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getUsuarioAdministrador() {
		return usuarioAdministrador;
	}

	public void setUsuarioAdministrador(String usuarioAdministrador) {
		this.usuarioAdministrador = usuarioAdministrador;
	}

	public String getClaveAdministrador() {
		return claveAdministrador;
	}

	public void setClaveAdministrador(String claveAdministrador) {
		this.claveAdministrador = claveAdministrador;
	}

	public String getNombreAdministrador() {
		return nombreAdministrador;
	}

	public void setNombreAdministrador(String nombreAdministrador) {
		this.nombreAdministrador = nombreAdministrador;
	}

	public int getTelefonoAdministrador() {
		return telefonoAdministrador;
	}

	public void setTelefonoAdministrador(int telefonoAdministrador) {
		this.telefonoAdministrador = telefonoAdministrador;
	}

	public String getCorreoAdministrador() {
		return correoAdministrador;
	}

	public void setCorreoAdministrador(String correoAdministrador) {
		this.correoAdministrador = correoAdministrador;
	}

	public int getRutAdministrador() {
		return rutAdministrador;
	}

	public void setRutAdministrador(int rutAdministrador) {
		this.rutAdministrador = rutAdministrador;
	}

	@Override
	public String toString() {
		return "AdministradorModel [idAdministrador=" + idAdministrador
				+ ", usuarioAdministrador=" + usuarioAdministrador
				+ ", claveAdministrador=" + claveAdministrador
				+ ", nombreAdministrador=" + nombreAdministrador
				+ ", telefonoAdministrador=" + telefonoAdministrador
				+ ", correoAdministrador=" + correoAdministrador
				+ ", rutAdministrador=" + rutAdministrador + "]";
	}
	
	

	
	
}
