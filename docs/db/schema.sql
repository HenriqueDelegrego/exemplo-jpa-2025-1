CREATE TABLE departamento (
	id_departamento INTEGER AUTO_INCREMENT,
	nm_departamento VARCHAR(50) NOT NULL,
	PRIMARY KEY(id_departamento)
);

CREATE TABLE funcionario (
	id_funcionario INTEGER AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	email VARCHAR(50) NOT NULL UNIQUE,
	senha VARCHAR(50) NOT NULL,
	salario DECIMAL(10, 2),
	id_departamento INTEGER,
	PRIMARY KEY(id_funcionario),
	FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento)
);