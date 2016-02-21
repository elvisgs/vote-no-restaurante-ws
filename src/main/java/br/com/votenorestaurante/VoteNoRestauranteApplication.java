package br.com.votenorestaurante;

import br.com.votenorestaurante.model.Restaurante;
import br.com.votenorestaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class VoteNoRestauranteApplication {
    
    @Autowired
    RestauranteRepository restauranteRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(VoteNoRestauranteApplication.class, args);
    }
    
    @PostConstruct
    public void criarRestaurantes() {
        restauranteRepository.save(new Restaurante("Burger King", "/img/restaurantes/bk.png"));
        restauranteRepository.save(new Restaurante("Habib's", "/img/restaurantes/habibs.png"));
        restauranteRepository.save(new Restaurante("Giraffas", "/img/restaurantes/giraffas.png"));
        restauranteRepository.save(new Restaurante("McDonalds", "/img/restaurantes/mc.png"));
        restauranteRepository.save(new Restaurante("Subway", "/img/restaurantes/subway.png"));
    }
}
