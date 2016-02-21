package br.com.votenorestaurante.repository;

import br.com.votenorestaurante.model.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestauranteRepository extends CrudRepository<Restaurante, Long> {
}
