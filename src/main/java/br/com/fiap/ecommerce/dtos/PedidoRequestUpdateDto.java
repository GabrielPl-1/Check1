package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PedidoRequestUpdateDto {
    private Long id;
    private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;
    public Pedido toModel(Long id){
        Pedido pedido = new ModelMapper().map(this, Pedido.class);
        pedido.setId(id);
        return pedido;
    }
}
