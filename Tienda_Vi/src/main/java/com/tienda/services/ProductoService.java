
package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //se recuperan los registros de la tabla producto en un 
    //arraylist de objetos Producto. todos o solo los activos
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void delete(Producto producto);
    
    public void save(Producto producto);
}
