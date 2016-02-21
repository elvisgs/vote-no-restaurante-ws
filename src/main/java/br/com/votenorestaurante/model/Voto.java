package br.com.votenorestaurante.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = {"votante", "duelo"}, callSuper = false)
public class Voto extends Entidade {

    @ManyToOne
    private Votante votante;

    @Embedded
    private Duelo duelo;

    @ManyToOne
    private Restaurante vencedor;
}
