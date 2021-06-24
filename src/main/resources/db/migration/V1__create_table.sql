DROP TABLE IF EXISTS game_record;

CREATE TABLE game_record (
    game_id BIGSERIAL NOT NULL,
    game_date DATE NOT NULL,
    team_name VARCHAR(255) NOT NULL,
    opposing_team_name VARCHAR(255) NOT NULL,
    game_result VARCHAR(1) NOT NULL, -- 0: win, 1: lose, 2: draw
    score INTEGER NOT NULL,
    opposing_score INTEGER NOT NULL,
    PRIMARY KEY (game_id)
);