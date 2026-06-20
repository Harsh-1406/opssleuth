package com.harsh.opssleuth.investigation.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateInvestigationRequest(
        @NotBlank(message = "Issue description is required")
        String issueDescription
) {
}
