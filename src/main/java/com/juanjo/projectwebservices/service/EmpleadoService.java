/**
 * 
 */
package com.juanjo.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.juanjo.projectwebservices.entity.Empleado;

/**
 * @author Juanjo
 *
 */
public class EmpleadoService {
	
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Juan José");
		empleado.setPrimerApellido("De La Fuente");
		empleado.setSegundoApellido("León");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(37);
		
		return empleado;
	}
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Juan José");
		empleado.setPrimerApellido("De La Fuente");
		empleado.setSegundoApellido("León");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(37);
		
		empleados.add(empleado);
		
		Empleado empleado1 = new Empleado();
		empleado1.setNumeroEmpleado("321654");
		empleado1.setNombre("Luis");
		empleado1.setPrimerApellido("De La Fuente");
		empleado1.setSegundoApellido("León");
		empleado1.setFechaCreacion(LocalDateTime.now());
		empleado1.setEdad(40);
		
		empleados.add(empleado1);
		
		return empleados;
	}

}
