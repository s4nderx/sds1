package com.devsuperior.dspesquisa.services;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.repositories.GameRepository;
import com.devsuperior.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO recordInsertDTO){
        Record record = new Record();
        record.setName(recordInsertDTO.getName());
        record.setAge(recordInsertDTO.getAge());
        record.setMoment(Instant.now());
        record.setGame(gameRepository.getOne(recordInsertDTO.getGameId()));
        return new RecordDTO(recordRepository.save(record));
    }

    @Transactional
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return recordRepository.finByMoments(minDate, maxDate, pageRequest).map(RecordDTO::new);
    }


}
