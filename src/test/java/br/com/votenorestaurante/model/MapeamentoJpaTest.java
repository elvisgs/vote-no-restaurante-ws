package br.com.votenorestaurante.model;

import br.com.votenorestaurante.VoteNoRestauranteApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManagerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(VoteNoRestauranteApplication.class)
public class MapeamentoJpaTest {

    @Autowired
    EntityManagerFactory emf;

    @Test
    public void mapeamentoDeveEstarCorreto() {
        assertThat(emf).isNotNull();
    }
}
