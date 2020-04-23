DROP TABLE  IF EXISTS clients;

CREATE TABLE client(
    id_client INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    income DOUBLE NOT NULL,
    PRIMARY KEY (id_client));