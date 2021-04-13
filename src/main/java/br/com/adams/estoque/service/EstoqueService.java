package br.com.adams.estoque.service;

import br.com.adams.estoque.domain.Estoque;

import java.util.List;

public interface EstoqueService {

  Estoque buscarPorLivroId(Long idLivro);

  List<Estoque> buscarPorLivroIdList(List<Long> idLivrosList);
}
