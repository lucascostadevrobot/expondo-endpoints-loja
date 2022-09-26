package com.expondo.endpoints.api.controller;


import com.expondo.endpoints.api.domain.Produto;
import com.expondo.endpoints.api.repository.ProdutoRepository;
import com.expondo.endpoints.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    private ProdutoService produtoService;

    /*1º Metodo é pegar o produto e salvar o mesmo no BD
    * 2ºAlisar problema ao persistir BD*/

    @PostMapping(value = "/save")
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto){
        produto = produtoService.save(produto);
         return ResponseEntity.ok().body(produto);

    }
}
