package ec.edu.espe.segundoparcial.examenloachamin.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import ec.edu.espe.segundoparcial.examenloachamin.domain.Comentarios.Comentario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Producto")
public class Producto {
    @Id
    private String id;

    @Field("codigo_producto")
    private String codigoProducto;

    @Field("nombre")
    private String nombre;

    @Field("descripcion")
    private String descripcion;


    @Field("precio")
    private Double precio;

    @Field("existencia")
    private Integer existencia;


    @java.lang.Override
    public java.lang.String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }
}
