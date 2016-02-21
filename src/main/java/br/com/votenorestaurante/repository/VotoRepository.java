package br.com.votenorestaurante.repository;

import br.com.votenorestaurante.model.Votante;
import br.com.votenorestaurante.model.Voto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "votos", path = "votos")
public interface VotoRepository extends CrudRepository<Voto, Long> {

    List<Voto> findByVotante(@Param("votante") Votante votante);
}
