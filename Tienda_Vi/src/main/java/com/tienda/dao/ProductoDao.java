package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao
        extends JpaRepository<Producto, Long> {

    //se define una consulta ampliada considerando los atributos
    public List<Producto> findByPrecioBetweenOrderByDescripcion(
            double precioInf, double precioSup);

    //se define la misma consulta pero en sintaxis JPQL
    @Query(value = "SELECT a FROM Producto a "
            + "WHERE a.precio BETWEEN :precioInf AND :precioSup "
            + "ORDER BY a.descripcion ASC")
    public List<Producto> consulta2(double precioInf, double precioSup);

    //SE DEFINE LA MISMA CONSULTA CON CON SINTAXIS SQL
    @Query(nativeQuery = true,
            value = "SELECT * FROM producto a "
            + "WHERE a.precio BETWEEN :precioInf AND :precioSup "
            + "ORDER BY a.descripcion ASC")
    public List<Producto> consulta3(double precioInf, double precioSup);

}
