package com.devsuperior.dspesquisa.repositories;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("SELECT record FROM Record record WHERE " +
            "(coalesce(:minDate, null) IS NULL OR record.moment >= :minDate) AND " +
            "(coalesce(:maxDate, null) IS NULL OR record.moment <= :maxDate)")
   Page<Record> finByMoments(Instant minDate, Instant maxDate, Pageable pageable);
}
