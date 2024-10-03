package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.ItemPedido;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedidoResponseDto {
    private Long id;
    private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    public ItemPedidoResponseDto toDto(ItemPedido itemPedido){
        return new ModelMapper().map(itemPedido, ItemPedidoResponseDto.class);
    }
}
