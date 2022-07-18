package com.credibanco.assessment.card.repository;

import com.credibanco.assessment.card.model.TarjetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends JpaRepository<TarjetaEntity, String> {

}