package br.com.gestao.produtos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutosController {

    @GetMapping("/produtos")
    public String listarProdutos() {
        // Retorna a página "ListaProdutos" quando a URL "/produtos" é acessada via GET.
        return "ListaProdutos";
    }

    @GetMapping("/cadastrarproduto")
    public String cadastrarProduto() {
        // Retorna a página "InserirProduto" quando a URL "/cadastrarproduto" é acessada via GET.
        return "InserirProduto";
    }

    @PostMapping("/inserirproduto")
    public String inserirProduto() {
        // Lógica de inserção do produto aqui

        // Após a inserção, redireciona para a página "ProdutoInserido".
        return "redirect:/produtoinserido";
    }

    @GetMapping("/produtoinserido")
    public String produtoInserido() {
        // Retorna a página "ProdutoInserido" quando a URL "/produtoinserido" é acessada via GET.
        return "ProdutoInserido";
    }
}