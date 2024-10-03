package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idCliente;
    private LocalDate dataPedido;
    @Column(length = 60,nullable = false)
    private String status;
    @Column(length = 70,nullable = false)
    private String formaPagamento;
    @Column(precision = 16, scale = 2)
    private BigDecimal valorTotal;

}
