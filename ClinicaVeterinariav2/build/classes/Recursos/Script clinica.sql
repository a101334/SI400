/* 
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
/*
 * Author:  thiag
 * Created: 04/10/2017 */

DROP DATABASE IF EXISTS clinicaVeterinaria;

CREATE DATABASE clinicaVeterinaria;

USE clinicaVeterinaria;

DROP TABLE IF EXISTS pessoa;

#Pessoa: { codPessoa , nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, num_casa, telefone, email , tipoPessoa}
#tipo 0 = Cliente.
#tipo 1 = Secretária.
#tipo 2 = Veterinário

CREATE TABLE pessoa ( 
	codPessoa INT NOT NULL AUTO_INCREMENT, 
	nome VARCHAR(50) NOT NULL, 
	nascimentoPessoa varchar(20) NOT NULL, 
	cep CHAR(8) NOT NULL,
	estado CHAR(2) NOT NULL DEFAULT "SP", 
	cidade VARCHAR(30) NOT NULL, 
	bairro VARCHAR(100) NOT NULL, 
	rua VARCHAR(100) NOT NULL, 
	numCasa INT NOT NULL, 
	telefone VARCHAR(30) NOT NULL, 
	email VARCHAR (100) NOT NULL, 
	tipo INT NOT NULL DEFAULT 0,
        genero CHAR(1) NOT NULL,
	PRIMARY KEY (codPessoa) 
) Engine=InnoDB;

DROP TABLE IF EXISTS secretaria;

#Secretária: { codSecretaria, login, senha, codPessoa}
#codPessoa chave estrangeira referenciando Pessoa

CREATE TABLE secretaria (
	codSecretaria INT NOT NULL AUTO_INCREMENT,
	codPessoa INT NOT NULL,
	login VARCHAR (50) NOT NULL,
	senha VARCHAR(20) NOT NULL,
        salario FLOAT NOT NULL,
	PRIMARY KEY (codSecretaria),
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa),
	UNIQUE (login)
) Engine=InnoDB;


DROP TABLE IF EXISTS veterinario;

#Veterinário: {  codVeterinario , codPessoa}
#codPessoa chave estrangeira referenciando Pessoa

CREATE TABLE veterinario (
	codPessoa INT NOT NULL,
	codVeterinario INT NOT NULL AUTO_INCREMENT,
        salario FLOAT NOT NULL,
	PRIMARY KEY (codPessoa),
        UNIQUE(codVeterinario),
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa)
)Engine=InnoDB;

DROP TABLE IF EXISTS animal;

#Animal: { codAnimal, nome, especie, raca, proprietario }
#proprietário chave estrangeira referenciando Pessoa.

CREATE TABLE animal (
	codAnimal INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nomeAnimal VARCHAR(20),
	nascimentoAnimal varchar(20) NOT NULL, 
	especie VARCHAR(20) DEFAULT 'INDEFINIDO',
	raca VARCHAR(20) DEFAULT 'INDEFINIDO',
	codPessoa INT NOT NULL,
        sexo CHAR(1) NOT NULL,
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa) 
) Engine=InnoDB;        

select*from animal

DROP TABLE IF EXISTS tratamento;

#Tratamento: {codTratamento, historico, codAnimal, codVeterinario }
#codAnimal chave estrangeira referenciando Animal
#codVeterinario chave estrangeira referenciando Veterinario

CREATE TABLE tratamento (
	codTratamento INT NOT NULL AUTO_INCREMENT,
	codAnimal INT NOT NULL,
	codVeterinario INT NOT NULL,
	historico VARCHAR(255) NOT NULL,
	PRIMARY KEY (codTratamento),
	FOREIGN KEY (codAnimal) REFERENCES animal (codAnimal),
	FOREIGN KEY (codVeterinario) REFERENCES veterinario (codVeterinario)
) Engine=InnoDB;

DROP TABLE IF EXISTS consulta;

#Consulta: { codConsulta , codTratamento, dataConsulta }
#codTratamento chave estrangeira referenciando Tratamento

CREATE TABLE consulta (
	codConsulta INT NOT NULL AUTO_INCREMENT,
	codTratamento INT NOT NULL,
	dataConsulta DATE NOT NULL,
	PRIMARY KEY (codConsulta),
        FOREIGN KEY(codTratamento) REFERENCES Tratamento (codTratamento)
) Engine=InnoDB;

DROP TABLE IF EXISTS contaPagar;

#Contas-a-Pagar : { codConta , dataEmissao }

CREATE TABLE contaPagar (
	codConta INT NOT NULL AUTO_INCREMENT,
	valor FLOAT NOT NULL,
	PRIMARY KEY (codConta)
) Engine=InnoDB;

DROP TABLE IF EXISTS emitirNota;
#Emitir : {  veterinario , consulta , conta }
#veterinario chave estrangeira referenciando Veterinario (codVeterinario)
#consulta chave estrangeira referenciando Consuta (codConsulta)
#conta chave estrangeira referenciando Conta-a-Pagar (codConta)


CREATE TABLE emitirNota(
	veterinario INT NOT NULL,
	consulta INT NOT NULL,
	conta INT NOT NULL,
	dataEmissao DATETIME NOT NULL,
        FOREIGN KEY (veterinario) REFERENCES veterinario (codVeterinario),
	FOREIGN KEY (consulta) REFERENCES consulta (codConsulta),
	FOREIGN KEY (conta) REFERENCES contaPagar (codConta)
)Engine=InnoDB;

SHOW TABLES;

USE clinicaVeterinaria;

INSERT INTO pessoa (nome, nascimentoPessoa, cep, cidade, bairro, rua, numCasa, telefone, email, tipo)
VALUES

("Joana", "1980-03-29", "13480173", "Limeira", "Pokã", "Acerola", "885", "9999999999", "Joana@veterinaria.com", 1),

("Margarida", "1989-10-04", "13480113", "Limeira", "Laranja", "Limão", 127, "888888888", "Margarida@veterinaria.com", 2),

("Marcos", "1990-01-01", "13480105", "Limeira", "Maçã", "Banana", 89, "888888888", "Marcos@cliente.com", 0);

SELECT * FROM pessoa;

INSERT INTO secretaria(codPessoa, login, senha)
VALUES (1, "secretaria", 12345);

SELECT * FROM secretaria;

INSERT INTO veterinario (codPessoa)
VALUES (1);

delete from pessoa
where codPessoa = 1

SELECT * FROM veterinario;

INSERT INTO animal (nomeAnimal, nascimentoAnimal, especie, raca, codPessoa)
VALUES("Rex","2017-01-01", "cachorro", "Pastor Alemão", 1);

SELECT * FROM animal;

INSERT INTO tratamento (codAnimal, codVeterinario, historico)
VALUES(1, 1, "O animal está ofegante");

SELECT * FROM tratamento;

INSERT INTO consulta (codTratamento, dataConsulta)
VALUES (1, "2017-09-22");

SELECT * FROM consulta;

INSERT INTO contaPagar(valor)
VALUES (35.50);

SELECT * FROM contaPagar;

INSERT INTO emitirNota (veterinario, consulta, conta, dataEmissao)
VALUES (1, 1, 1, "2017-12-23");

SELECT * FROM emitirNota;