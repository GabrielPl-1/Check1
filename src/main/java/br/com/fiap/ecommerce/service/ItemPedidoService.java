package br.com.fiap.ecommerce.service;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {
    @Autowired
    private ItemPedidoRepository clienteRepository;

    public List<ItemPedido> list() {
        return clienteRepository.findAll();
    }

    public ItemPedido save(ItemPedido produto) {
        return clienteRepository.save(produto);
    }

    public boolean existsById(Long id) {
        return clienteRepository.existsById(id);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    public Optional<ItemPedido> findById(Long id) {
        return clienteRepository.findById(id);
    }

}
