package ec.edu.espe.tercerparcial.examenloachamin.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Venta")
public class Producto {
    @Id
    private String id;

    @Field("codigo_unico")
    private String codigoProducto;

    @Field("nombre")
    private String nombre;

    @Field("precio_unitario")
    private Double precioU;



    @Field("existencia")
    private Integer existencia;

    
    @Field("fecha_venta")
    private LocalDateTime fechaVenta;


    
}
