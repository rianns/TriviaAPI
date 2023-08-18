-- V1__Create_games_table.sql

-- Description: Create the game table

-- Up section: Apply the migration

CREATE TABLE games (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  userAnswers JSON,
  score INT,
  date DATE,
  correctAnswers JSON,
  failed BOOLEAN
);

-- Down section: Rollback the migration

DROP TABLE games;

