package br.com.votenorestaurante.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Votante extends Entidade {

    private String nome;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @Setter(AccessLevel.PACKAGE)
    private Set<Voto> votos;

    public Votante() {
        votos = new HashSet<>();
    }

    public Set<Voto> getVotos() {
        return Collections.unmodifiableSet(votos);
    }

    public void addVoto(@NonNull Voto voto) {
        voto.setVotante(this);
        votos.add(voto);
    }
}
