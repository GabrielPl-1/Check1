package br.com.fiap.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 70,nullable = false)
    private String nome;
    @Column(length = 9,nullable = false)
    private String cep;
    @Column(length = 120,nullable = false)
    private String logradouro;
    @Column(length = 11)
    private String numero;
    @Column(length = 40)
    private String complemento;
    @Column(length = 70,nullable = false)
    private String bairro;
    @Column(length = 70,nullable = false)
    private String municipio;
    @Column(length = 2,nullable = false)
    private String uf;

}
