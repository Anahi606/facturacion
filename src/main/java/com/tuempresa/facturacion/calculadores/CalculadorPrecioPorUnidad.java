package com.tuempresa.facturacion.calculadores;

import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

import com.yourcompany.facturacion.modelo.*;

import lombok.*;

public class CalculadorPrecioPorUnidad implements ICalculator {
 
    @Getter @Setter
    int numeroProducto;
 
    @Override
    public Object calculate() throws Exception {
        Producto producto = getManager() // getManager() de XPersistence
            .find(Producto.class, numeroProducto); // Busca el producto
        return producto.getPrecio();    // Retorna su precio
    }
}
