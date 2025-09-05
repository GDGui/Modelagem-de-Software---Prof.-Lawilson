create database db_projetoA3;
use db_projetoA3;
create table tb_usuario (
	nome varchar(40) not null primary key,
    senha varchar(10) not null,
    tipo varchar(20)
);

insert into tb_usuario (nome, senha, tipo)
	values ('admin', 'admin', 'admin');
insert into tb_usuario (nome, senha)
	values ('user', '123');
select * from tb_usuario;
select * from tb_filme;
CREATE TABLE tb_filme (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    ano VARCHAR(100) DEFAULT NULL,
    categoria VARCHAR(100) DEFAULT NULL,
    sinopse VARCHAR(500) NOT NULL
);
CREATE TABLE tb_avaliacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50),
    autor VARCHAR(100),
    tipo VARCHAR(20),
    nota TINYINT CHECK (nota BETWEEN 1 AND 5),
    comentario TEXT
);
ALTER TABLE tb_filme ADD COLUMN usuario_cadastro VARCHAR(100);

show tables;
select * from tb_avaliacao;
select * from tb_usuario;select * from tb_filme;