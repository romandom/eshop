package com.example.demo.domain.repository;

import com.example.demo.domain.entity.InformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<InformationEntity, Integer> {
}
