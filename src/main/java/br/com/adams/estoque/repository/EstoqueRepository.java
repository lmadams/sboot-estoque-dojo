package br.com.adams.estoque.repository;

import br.com.adams.estoque.domain.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

  Estoque findByIdLivro(Long idLivro);

  List<Estoque> findAllByIdIn(List<Long> idLivroList);
}
