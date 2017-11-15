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
