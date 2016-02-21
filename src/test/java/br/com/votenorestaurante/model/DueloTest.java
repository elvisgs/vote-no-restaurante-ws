package br.com.votenorestaurante.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

public class DueloTest {

    @Test
    public void lancaExcecaoSeRestaurante1ForNulo() {
        try {
            new Duelo(null, new Restaurante());
            failBecauseExceptionWasNotThrown(NullPointerException.class);
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void lancaExcecaoSeRestaurante2ForNulo() {
        try {
            new Duelo(new Restaurante(), null);
            failBecauseExceptionWasNotThrown(NullPointerException.class);
        } catch (NullPointerException e) {
        }
    }
}