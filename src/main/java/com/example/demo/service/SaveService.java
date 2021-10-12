package com.example.demo.service;

import com.example.demo.converter.FountainConverter;
import com.example.demo.domain.dto.InformationDto;
import com.example.demo.domain.repository.InformationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveService {

    private final InformationRepository informationRepository;

    public void save(InformationDto informationDto)
    {
        informationRepository.save(FountainConverter.convert(informationDto));
    }

}
