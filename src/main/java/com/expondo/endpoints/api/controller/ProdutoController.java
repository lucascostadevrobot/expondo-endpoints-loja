package com.expondo.endpoints.api.controller;


import com.expondo.endpoints.api.domain.Produto;
import com.expondo.endpoints.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
     private ProdutoService produtoService;
     private Produto produto;

    //1º Metodo é pegar o produto e salvar o mesmo no BD
    @PostMapping(value = "save")
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto){
        produto = produtoService.save(produto);
         return ResponseEntity.ok().body(produto);

    }

    //Metodo para buscar produto por ID
    @GetMapping(value = "{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id){
        Produto produto = produtoService.findById(id);
        return ResponseEntity.ok().body(produto);
    }

    //Metodo para deletar via ID
    @DeleteMapping(path = "{id}")
    public ResponseEntity<Produto> deletaProduto(@PathVariable long id){
        Produto produto = produtoService.deleteById(id);
        return ResponseEntity.ok().body(produto);
    }

    //Metodo para listar todos os produtos
    @GetMapping(value = "/listar-todos")
    public ResponseEntity<List<Produto>> buscarTodos(){
        List<Produto> produtos = produtoService.findAll();
        return ResponseEntity.ok().body(produtos);
    }
}
