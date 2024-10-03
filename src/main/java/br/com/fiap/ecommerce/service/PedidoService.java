package br.com.fiap.ecommerce.service;

import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository produtoRepository;

    public List<Pedido> list() {
        return produtoRepository.findAll();
    }

    public Pedido save(Pedido produto) {
        return produtoRepository.save(produto);
    }

    public boolean existsById(Long id) {
        return produtoRepository.existsById(id);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    public Optional<Pedido> findById(Long id) {
        return produtoRepository.findById(id);
    }


}
