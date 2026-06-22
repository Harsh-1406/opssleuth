package com.harsh.opssleuth.investigation.evidence.repository;

import com.harsh.opssleuth.investigation.evidence.entity.InvestigationEvidence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface InvestigationEvidenceRepository
        extends JpaRepository<InvestigationEvidence, UUID> {

    List<InvestigationEvidence>
    findByInvestigationId(UUID investigationId);

}