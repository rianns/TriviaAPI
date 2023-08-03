-- V1__Create_trivias_table.sql

-- Description: Create the trivias table

-- Up section: Apply the migration

CREATE TABLE trivias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    difficulty VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    question VARCHAR(999) NOT NULL,
    correct_answer VARCHAR(255) NOT NULL,
    incorrect_answers VARCHAR(1000) NOT NULL
);

-- Down section: Rollback the migration

DROP TABLE trivias;
