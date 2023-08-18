-- V2__Create_trivias_table.sql

-- Description: Create the trivias table

-- Up section: Apply the migration

CREATE TABLE trivias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    difficulty VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    question VARCHAR(1000) NOT NULL,
    correct_answer VARCHAR(255) NOT NULL,
    incorrect_answers JSON NOT NULL,
    game_id BIGINT,
    CONSTRAINT fk_game_id FOREIGN KEY (game_id) REFERENCES games(id)
);

-- Down section: Rollback the migration

DROP TABLE trivias;
