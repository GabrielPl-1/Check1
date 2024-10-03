package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ClienteRequestUpdateDto {
    private Long id;
    private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;

    public Cliente toModel(Long id){
        Cliente cliente = new ModelMapper().map(this, Cliente.class);
        cliente.setId(id);
        return cliente;
    }
}
