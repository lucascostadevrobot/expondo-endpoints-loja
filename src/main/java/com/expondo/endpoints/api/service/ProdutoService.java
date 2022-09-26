package com.expondo.endpoints.api.service;

import com.expondo.endpoints.api.domain.Produto;
import com.expondo.endpoints.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    //Referenciando Repository que faz interações com o nossa BD
    private ProdutoRepository produtoRepository;

    //Criando metodo para salvar no nosso banco de dados.
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
    //Buscar por ID
    public Produto findById (Long id){
        return produtoRepository.findById(id).orElse(null);
    }
    //Lista todinho o Produto com findAll.
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

}
