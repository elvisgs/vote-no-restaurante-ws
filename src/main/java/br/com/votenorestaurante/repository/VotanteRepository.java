package br.com.votenorestaurante.repository;

import br.com.votenorestaurante.model.Votante;
import org.springframework.data.repository.CrudRepository;

public interface VotanteRepository extends CrudRepository<Votante, Long> {
}
