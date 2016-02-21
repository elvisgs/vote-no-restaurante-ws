package br.com.votenorestaurante.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Restaurante extends Entidade {

    private String nome;
    private String imagem;

    @Override
    public String toString() {
        return nome;
    }
}
