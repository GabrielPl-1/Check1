package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PedidoResponseDto {
    private Long id;
    private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;

    public PedidoResponseDto toDto(Pedido pedido){
        return new ModelMapper().map(pedido, PedidoResponseDto.class);
    }
}
