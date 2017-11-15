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
	nascimentoPessoa DATE NOT NULL,
        genero VARCHAR(30) NOT NULL DEFAULT 'INDEFINIDO',
	cep CHAR(8) NOT NULL,
	estado CHAR(2) NOT NULL DEFAULT 'SP', 
	cidade VARCHAR(30) NOT NULL, 
	bairro VARCHAR(100) NOT NULL, 
	rua VARCHAR(100) NOT NULL, 
	numCasa INT NOT NULL, 
	telefone VARCHAR(30) NOT NULL, 
	email VARCHAR (100) NOT NULL, 
	tipo INT NOT NULL DEFAULT 0,
	PRIMARY KEY (codPessoa) 
) Engine=InnoDB;

DROP TABLE IF EXISTS secretaria;

#Secretária: { codSecretaria, login, senha, codPessoa}
#codPessoa chave estrangeira referenciando Pessoa

CREATE TABLE secretaria (
	codPessoa INT NOT NULL,
	login VARCHAR (50) NOT NULL,
	senha VARCHAR(20) NOT NULL,
        salario FLOAT NOT NULL,
	PRIMARY KEY (codPessoa),
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa),
	UNIQUE (login)
) Engine=InnoDB;


DROP TABLE IF EXISTS veterinario;

#Veterinário: {  codVeterinario , codPessoa}
#codPessoa chave estrangeira referenciando Pessoa

CREATE TABLE veterinario (
	codVeterinario INT NOT NULL AUTO_INCREMENT,
	codPessoa INT NOT NULL,
        salario FLOAT NOT NULL,
        UNIQUE (codVeterinario),
	PRIMARY KEY (codPessoa),
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa)
)Engine=InnoDB;

DROP TABLE IF EXISTS animal;

#Animal: { codAnimal, nome, especie, raca, proprietario }
#proprietário chave estrangeira referenciando Pessoa.

CREATE TABLE animal (
	codAnimal INT NOT NULL AUTO_INCREMENT,
	nomeAnimal VARCHAR(20),
	nascimentoAnimal DATE NOT NULL,
        sexo VARCHAR(30) NOT NULL,
	especie VARCHAR(20) DEFAULT 'INDEFINIDO',
	raca VARCHAR(20) DEFAULT 'INDEFINIDO',
	codPessoa INT NOT NULL,
	PRIMARY KEY (codAnimal),
	FOREIGN KEY (codPessoa) REFERENCES pessoa (codPessoa)
) Engine=InnoDB;

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
	PRIMARY KEY (codConsulta)
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


