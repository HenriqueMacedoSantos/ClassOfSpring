DROP TABLE IF EXISTS wizards;

CREATE TABLE wizards(
        GWR BIGINT AUTO_INCREMENT NOT NULL,
        name VARCHAR(255) NULL,
        house VARCHAR(255) NULL,
        age INT(50) NULL,
        patron VARCHAR(255) NULL,
        animal VARCHAR(255) NULL,
        wand VARCHAR(255) NULL,
        PRIMARY KEY (GWR)
);