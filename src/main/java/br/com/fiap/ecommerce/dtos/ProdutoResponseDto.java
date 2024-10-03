package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.Produto;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoResponseDto {
    private Long id;
	private String nome;
    private BigDecimal valor;


    public ProdutoResponseDto toDto(Produto produto) {
        return new ModelMapper().map(produto, ProdutoResponseDto.class);

        // ProdutoResponseDto result = new ProdutoResponseDto();
        // result.setId(produto.getId());
        // result.setNome(produto.getNome());

        // return result;
    }
    


    

}
