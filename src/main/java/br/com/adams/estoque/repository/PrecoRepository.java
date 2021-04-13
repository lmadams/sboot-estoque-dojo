package br.com.adams.estoque.repository;

import br.com.adams.estoque.domain.Preco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Long> {

  Preco findByIdLivro(Long idLivro);

  List<Preco> findAllByIdIn(List<Long> idLivroList);
}
