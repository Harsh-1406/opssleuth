package com.harsh.opssleuth.investigation.repository;

import com.harsh.opssleuth.investigation.entity.Investigation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InvestigationRepository
        extends JpaRepository<Investigation, UUID> {
}
