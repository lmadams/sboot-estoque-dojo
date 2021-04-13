package br.com.adams.estoque.service.impl;

import br.com.adams.estoque.domain.Estoque;
import br.com.adams.estoque.repository.EstoqueRepository;
import br.com.adams.estoque.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstoqueServiceImpl implements EstoqueService {

  private final EstoqueRepository estoqueRepository;

  @Override
  public Estoque buscarPorLivroId(final Long idLivro) {
    return estoqueRepository.findByIdLivro(idLivro);
  }

  @Override
  public List<Estoque> buscarPorLivroIdList(final List<Long> idLivrosList) {
    return estoqueRepository.findAllByIdIn(idLivrosList);
  }
}
