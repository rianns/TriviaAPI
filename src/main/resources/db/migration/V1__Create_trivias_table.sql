-- V1__Create_trivias_table.sql

-- Description: Create the trivias table

-- Up section: Apply the migration

CREATE TABLE trivias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    difficulty VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    question VARCHAR(255) NOT NULL,
    correct_answer VARCHAR(255) NOT NULL,
    incorrect_answers JSON NOT NULL
);

CREATE TABLE incorrect_answers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    answer VARCHAR(255) NOT NULL,
    trivia_id INT,
    FOREIGN KEY (trivia_id) REFERENCES trivias(id)
)

-- Down section: Rollback the migration

DROP TABLE trivias;
