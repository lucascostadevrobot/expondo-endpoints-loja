package com.expondo.endpoints.api.controller;


import com.expondo.endpoints.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
}
