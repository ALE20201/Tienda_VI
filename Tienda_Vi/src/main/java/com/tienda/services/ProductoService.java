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

    //SE UTILIZA LA CONSULTA 1 CONSULTA AMPLIADA
    public List<Producto> consulta1(double precioInf, double precioSup);
    
        //SE UTILIZA LA CONSULTA 2 CONSULTA JPQL
    public List<Producto> consulta2(double precioInf, double precioSup);
    
       //SE UTILIZA LA CONSULTA 3 CONSULTA SQL
    public List<Producto> consulta3(double precioInf, double precioSup);
    
        //SE UTILIZA LA SONCULTA 4 TAREA
    public List<Producto> findByPrecioGreaterThanEqual(double precioSelect);
}
