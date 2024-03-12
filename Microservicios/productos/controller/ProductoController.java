package ec.edu.espe.tercerparcial.examenloachamin.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.segundoparcial.examenloachamin.domain.Producto;
import ec.edu.espe.segundoparcial.examenloachamin.service.ProductosService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private final ProductosService productosService;

    public ProductoController(ProductosService productosService) {
        this.productosService = productosService;
    }

    @PostMapping("/nuevoProducto")
    public ResponseEntity<Void> crearProducto(@RequestBody Producto producto) {
        productosService.crearProducto(producto);
        return ResponseEntity.noContent().build();
    }


}
