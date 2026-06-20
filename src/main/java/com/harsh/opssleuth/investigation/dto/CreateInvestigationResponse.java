package com.harsh.opssleuth.investigation.dto;

import com.harsh.opssleuth.investigation.entity.InvestigationStatus;

import java.util.UUID;

public record CreateInvestigationResponse(
        UUID investigationId,
        InvestigationStatus status
) {
}
