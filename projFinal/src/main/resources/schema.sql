DROP TABLE IF EXISTS wizards;

CREATE TABLE wizards(
        GWR BIGINT AUTO_INCREMENT NOT NULL,
        name VARCHAR(50)NOT NULL,
        house VARCHAR(30) NOT NULL,
        age INT(3) NOT NULL,
        patron VARCHAR(50) NOT NULL,
        animal VARCHAR(20) NOT NULL,
        wand VARCHAR(250) NOT NULL,
        PRIMARY KEY (GWR)
);