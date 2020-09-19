package br.com.vrnery.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vrnery.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
