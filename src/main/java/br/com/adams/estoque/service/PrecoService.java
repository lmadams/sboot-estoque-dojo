package br.com.adams.estoque.service;

import br.com.adams.estoque.domain.Preco;

import java.util.List;

public interface PrecoService {

  Preco buscarPorLivroId(Long idLivro);

  List<Preco> buscarPorLivroIdList(List<Long> idLivrosList);
}
