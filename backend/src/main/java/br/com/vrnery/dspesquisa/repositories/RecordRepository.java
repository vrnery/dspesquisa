package br.com.vrnery.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vrnery.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
