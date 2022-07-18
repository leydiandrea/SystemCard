package com.credibanco.assessment.card.repository;

import com.credibanco.assessment.card.model.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<TransaccionEntity, Long> {

}
