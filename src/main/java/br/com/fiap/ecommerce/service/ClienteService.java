package br.com.fiap.ecommerce.service;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    public Cliente save(Cliente produto) {
        return clienteRepository.save(produto);
    }

    public boolean existsById(Long id) {
        return clienteRepository.existsById(id);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

}
