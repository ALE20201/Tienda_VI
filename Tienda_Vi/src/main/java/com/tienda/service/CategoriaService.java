
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //se recuperan los registros de la tabla categoria en un 
    //arraylist de objetos Categoria. todos o solo los activos
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public void save(Categoria categoria);
}
