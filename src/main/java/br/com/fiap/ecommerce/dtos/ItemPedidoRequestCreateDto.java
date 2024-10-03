package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.ItemPedido;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedidoRequestCreateDto {
    private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;

    public ItemPedido toModel(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return modelMapper.map(this, ItemPedido.class);
    }
}
