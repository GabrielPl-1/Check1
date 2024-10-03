package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.ItemPedido;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedidoRequestUpdateDto {
    private Long id;
    private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    public ItemPedido toModel(Long id){
        ItemPedido itemPedido = new ModelMapper().map(this, ItemPedido.class);
        itemPedido.setId(id);
        return itemPedido;
    }
}
