package prevreg.model;
/**

 * @author Nice

 */
public class CapacitacionModel {

	private int id_capacitacion;
	private String nombre_capacitacion;
	
	public CapacitacionModel() {
	}

	public CapacitacionModel(int id_capacitacion, String nombre_capacitacion) {
		this.id_capacitacion = id_capacitacion;
		this.nombre_capacitacion = nombre_capacitacion;
	}

	public int getId_capacitacion() {
		return id_capacitacion;
	}

	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
	}

	public String getNombre_capacitacion() {
		return nombre_capacitacion;
	}

	public void setNombre_capacitacion(String nombre_capacitacion) {
		this.nombre_capacitacion = nombre_capacitacion;
	}
	
}
