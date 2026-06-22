CREATE TABLE investigation_evidence
(
    id UUID PRIMARY KEY,

    investigation_id UUID NOT NULL,

    type VARCHAR(50) NOT NULL,

    content TEXT NOT NULL,

    collected_at TIMESTAMP NOT NULL
);