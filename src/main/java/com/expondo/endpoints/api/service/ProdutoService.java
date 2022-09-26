package com.expondo.endpoints.api.service;

import com.expondo.endpoints.api.domain.Produto;
import com.expondo.endpoints.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    //Referenciando Repository que faz interações com nosso BD
    private ProdutoRepository produtoRepository;

    //Criando metodo para salvar em nosso banco de dados.
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
    //Buscar por di
    public Produto findById (Long id){
        return produtoRepository.findById(id).orElse(null);
    }
    //Lista todos os Produto com findAll.
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

}
