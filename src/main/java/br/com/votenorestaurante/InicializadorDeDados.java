package br.com.votenorestaurante;

import br.com.votenorestaurante.model.Restaurante;
import br.com.votenorestaurante.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InicializadorDeDados {

    private final RestauranteRepository restauranteRepository;

    @PostConstruct
    public void criarRestaurantes() {
        restauranteRepository.save(new Restaurante("Burger King", "/img/restaurantes/bk.png"));
        restauranteRepository.save(new Restaurante("Habib's", "/img/restaurantes/habibs.png"));
        restauranteRepository.save(new Restaurante("Giraffas", "/img/restaurantes/giraffas.png"));
        restauranteRepository.save(new Restaurante("McDonalds", "/img/restaurantes/mc.png"));
        restauranteRepository.save(new Restaurante("Subway", "/img/restaurantes/subway.png"));
    }
}
