package br.com.votenorestaurante.model;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Duelo {

    @ManyToOne
    private @NonNull Restaurante restaurante1;

    @ManyToOne
    private @NonNull Restaurante restaurante2;

    protected Duelo() {}

    @Override
    public String toString() {
        return String.format("%s X %s", restaurante1.getNome(), restaurante2.getNome());
    }
}
