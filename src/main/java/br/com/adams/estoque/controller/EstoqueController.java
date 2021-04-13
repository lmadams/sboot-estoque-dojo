package br.com.adams.estoque.controller;

import br.com.adams.estoque.domain.Estoque;
import br.com.adams.estoque.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "estoque")
public class EstoqueController {

  private final EstoqueService estoqueService;

  @GetMapping("{id}")
  public Estoque listarPorIdLivro(@PathVariable("id") final Long idLivro) {
    log.info("Endpoint para bucar o estoque do livro com o ID: {}", idLivro);
    return estoqueService.buscarPorLivroId(idLivro);
  }

  @GetMapping
  public List<Estoque> listarPorIdLivroList(@RequestParam("id") List<Long> idLivroList) {
    log.info(
        "Endpoint para buscar todos os estoques de uma lista de livros, List: {}", idLivroList);
    return estoqueService.buscarPorLivroIdList(idLivroList);
  }
}
