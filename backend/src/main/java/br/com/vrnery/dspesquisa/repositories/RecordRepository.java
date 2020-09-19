package br.com.vrnery.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.vrnery.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

	@Query("SELECT obj FROM Record obj "
			+ "WHERE ((coalesce(:min, null) IS NULL) OR "
			+ "(coalesce(:max, null) IS NULL) OR "
			+ "obj.moment BETWEEN :min AND :max)")
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);

}
