CREATE TABLE investigations (
                                id UUID PRIMARY KEY,
                                issue_description TEXT NOT NULL,
                                status VARCHAR(50) NOT NULL,
                                created_at TIMESTAMP NOT NULL
);