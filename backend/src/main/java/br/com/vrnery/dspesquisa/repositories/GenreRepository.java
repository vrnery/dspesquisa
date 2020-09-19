package br.com.vrnery.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vrnery.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
