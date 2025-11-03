package com.yourcompany.facturacion.modelo;

import lombok.*;

public class Incidencia {
	
	// Propiedad persistente
	@Getter @Setter // Tiene getter y setter
	int cantidad; // Tiene un campo, por tanto es persistente
	
	@Getter @Setter // Tiene getter y setter
	int precio;
	 
	// Propiedad calculada
	public int getImporte() { // No tiene campo, ni setter, solo un getter
	    return cantidad * precio; // con un cálculo
	}
}
