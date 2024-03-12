package ec.edu.espe.tercerparcial.examenloachamin.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.segundoparcial.examenloachamin.domain.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {

    Producto findByCodigoProducto(String codigoProducto);


}
