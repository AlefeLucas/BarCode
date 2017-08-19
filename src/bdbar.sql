DROP DATABASE IF EXISTS bdbar;

CREATE DATABASE bdbar;

USE bdbar;

CREATE TABLE cliente (
    id_cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) UNIQUE,
    idade INT,
    cpf VARCHAR(15)
);

CREATE TABLE bebida (
    id_bebida INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) UNIQUE,
    preco DOUBLE,
    quantidade INT
);

CREATE TABLE venda (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_bebida INT,
    valor_venda DOUBLE,
    CONSTRAINT fk_venda_cliente FOREIGN KEY (id_cliente)
        REFERENCES cliente (id_cliente)
        ON DELETE CASCADE,
    CONSTRAINT fk_venda_bebida FOREIGN KEY (id_bebida)
        REFERENCES bebida (id_bebida)
        ON DELETE SET NULL
);

INSERT INTO cliente (nome, idade, cpf) VALUES
('Alberto', 18, '123.456.789-09'),
('João', 28, '133.456.789-09'),
('Maria', 38, '143.456.789-09'),
('Roberta', 19, '153.456.789-09');

INSERT INTO bebida (nome, preco, quantidade) VALUES
('Coca-Cola 2L', 7.5, '100'),
('Pepsi 2L', 6.5, '100'),
('Dolly Guaraná 2L', 2.5, '100'),
('Guaraná Jesus 2L', 3.5, '100');



select * from cliente;