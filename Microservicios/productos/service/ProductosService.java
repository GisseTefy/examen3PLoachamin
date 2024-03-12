package ec.edu.espe.tercerparcial.examenloachamin.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import ec.edu.espe.segundoparcial.examenloachamin.dao.ProductoRepository;
import ec.edu.espe.segundoparcial.examenloachamin.domain.Producto;

public class ProductosService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    public Producto obtenerProducto(String codigoProducto) {
        return productoRepository.findByCodigoProducto(codigoProducto).orElse(null);
    }

    
    @Transactional
    public void crearProducto(Producto producto) {
        producto.setId(UUID.randomUUID().toString());
        productoRepository.save(producto);
    }


}
