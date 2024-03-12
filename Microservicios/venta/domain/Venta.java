package ec.edu.espe.tercerparcial.examenloachamin.domain;

import org.springframework.data.annotation.Id;

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

    @Field("fecha_venta")
    private LocalDateTime fechaVenta;

    @Field("nombre")
    private String nombre;

    @Field("precio_unitario")
    private Double precioUnitario;

    @Field("cantidad")
    private Integer cantidad;

    @Field("valor_total")
    private Double valorTotal;



    
}
