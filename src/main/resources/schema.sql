-- src/main/resources/data.sql

-- Exemplo de criação de tabela
CREATE TABLE IF NOT EXISTS entidadenovolattes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    texto VARCHAR(255)
);

-- Exemplo de inserção de dados
INSERT INTO entidadenovolattes (nome) VALUES ('José da Silva');
INSERT INTO entidadenovolattes (texto) VALUES ('Exemplo Descrição antigo Lattes!');

-- Exemplo de criação de tabela
CREATE TABLE IF NOT EXISTS entidadeantigolattes (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(255) NOT NULL,
    descricao VARCHAR(255)
);

-- Exemplo de inserção de dados
INSERT INTO entidadeantigolattes (usuario) VALUES ('José da Silva');
INSERT INTO entidadeantigolattes (descricao) VALUES ('Exemplo Descrição antigo Lattes!');