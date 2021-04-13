package br.com.adams.estoque.service.impl;

import br.com.adams.estoque.domain.Preco;
import br.com.adams.estoque.repository.PrecoRepository;
import br.com.adams.estoque.service.PrecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrecoServiceImpl implements PrecoService {

  private final PrecoRepository precoRepository;

  @Override
  public Preco buscarPorLivroId(final Long idLivro) {
    return precoRepository.findByIdLivro(idLivro);
  }

  @Override
  public List<Preco> buscarPorLivroIdList(final List<Long> idLivrosList) {
    return precoRepository.findAllByIdIn(idLivrosList);
  }
}
