package br.com.votenorestaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
