package prevreg.model;

import java.sql.Date;

public class ProfesionalModel {
	
	
	public int idProfesional;
	public String nombreProfesional;
	public String apellidoProfesional;
	public String rutProfesional;
	public int departamentoProfesional;
	public String telefonoProfesional;
	public int correoProfesional;
	public String cargoProfesional;
	public String profesionProfesional;
	public Date fechaIngresoP;
	public String usuarioProfesional;
	public String claveProfesional;
	public int rutAdministrador;

	public ProfesionalModel(String rutProfesional) {

	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getNombreProfesional() {
		return nombreProfesional;
	}

	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}

	public String getApellidoProfesional() {
		return apellidoProfesional;
	}

	public void setApellidoProfesional(String apellidoProfesional) {
		this.apellidoProfesional = apellidoProfesional;
	}

	public String getRutProfesional() {
		return rutProfesional;
	}

	public void setRutProfesional(String rutProfesional) {
		this.rutProfesional = rutProfesional;
	}

	public int getDepartamentoProfesional() {
		return departamentoProfesional;
	}

	public void setDepartamentoProfesional(int departamentoProfesional) {
		this.departamentoProfesional = departamentoProfesional;
	}

	public String getTelefonoProfesional() {
		return telefonoProfesional;
	}

	public void setTelefonoProfesional(String telefonoProfesional) {
		this.telefonoProfesional = telefonoProfesional;
	}

	public int getCorreoProfesional() {
		return correoProfesional;
	}

	public void setCorreoProfesional(int correoProfesional) {
		this.correoProfesional = correoProfesional;
	}

	public String getCargoProfesional() {
		return cargoProfesional;
	}

	public void setCargoProfesional(String cargoProfesional) {
		this.cargoProfesional = cargoProfesional;
	}

	public String getProfesionProfesional() {
		return profesionProfesional;
	}

	public void setProfesionProfesional(String profesionProfesional) {
		this.profesionProfesional = profesionProfesional;
	}

	public Date getFechaIngresoP() {
		return fechaIngresoP;
	}

	public void setFechaIngresoP(Date fechaIngresoP) {
		this.fechaIngresoP = fechaIngresoP;
	}

	public String getUsuarioProfesional() {
		return usuarioProfesional;
	}

	public void setUsuarioProfesional(String usuarioProfesional) {
		this.usuarioProfesional = usuarioProfesional;
	}

	public String getClaveProfesional() {
		return claveProfesional;
	}

	public void setClaveProfesional(String claveProfesional) {
		this.claveProfesional = claveProfesional;
	}

	public int getRutAdministrador() {
		return rutAdministrador;
	}

	public void setRutAdministrador(int rutAdministrador) {
		this.rutAdministrador = rutAdministrador;
	}

	@Override
	public String toString() {
		return "ProfesionalModel [idProfesional=" + idProfesional
				+ ", nombreProfesional=" + nombreProfesional
				+ ", apellidoProfesional=" + apellidoProfesional
				+ ", rutProfesional=" + rutProfesional
				+ ", departamentoProfesional=" + departamentoProfesional
				+ ", telefonoProfesional=" + telefonoProfesional
				+ ", correoProfesional=" + correoProfesional
				+ ", cargoProfesional=" + cargoProfesional
				+ ", profesionProfesional=" + profesionProfesional
				+ ", fechaIngresoP=" + fechaIngresoP + ", usuarioProfesional="
				+ usuarioProfesional + ", claveProfesional=" + claveProfesional
				+ ", rutAdministrador=" + rutAdministrador + "]";
	}
	
	
	
	

	
	
	

}

