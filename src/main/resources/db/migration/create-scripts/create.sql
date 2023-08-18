CREATE TABLE trivias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    difficulty VARCHAR(255),
    category VARCHAR(255),
    question VARCHAR(1000),
    correct_answer VARCHAR(255),
    incorrect_answers TEXT, 
    game_id BIGINT NOT NULL,
    PRIMARY KEY (id)
)

CREATE TABLE games (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_answers TEXT,
    score INT,
    date DATETIME,
    correct_answers TEXT,
    failed BOOLEAN, 
    PRIMARY KEY (id)
)

ALTER TABLE trivias (
    ADD CONSTRAINT fk_game_id FOREIGN KEY (game_id) REFERENCES games(id)
)