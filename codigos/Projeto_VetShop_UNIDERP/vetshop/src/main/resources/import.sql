INSERT INTO categoria (nome) VALUES ('Medicamentos');
INSERT INTO categoria (nome) VALUES ('Suplementos');
INSERT INTO categoria (nome) VALUES ('Curativos');
INSERT INTO categoria (nome) VALUES ('Rações');
INSERT INTO categoria (nome) VALUES ('Acessórios');

INSERT INTO produto (preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo ABC');
INSERT INTO produto (preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo DEF');
INSERT INTO produto (preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo GHI');
INSERT INTO produto (preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo JKL');
INSERT INTO produto (preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo MNO');

INSERT INTO produto (preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento ABC');
INSERT INTO produto (preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento DEF');
INSERT INTO produto (preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento GHI');
INSERT INTO produto (preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento JKL');
INSERT INTO produto (preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento MNO');

INSERT INTO produto (preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo ABC');
INSERT INTO produto (preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo DEF');
INSERT INTO produto (preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo GHI');
INSERT INTO produto (preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo JKL');
INSERT INTO produto (preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo MNO');

INSERT INTO produto (preco, categoria_id, nome) VALUES (4.0, 4, 'Ração ABC');
INSERT INTO produto (preco, categoria_id, nome) VALUES (4.0, 4, 'Ração DEF');
INSERT INTO produto (preco, categoria_id, nome) VALUES (4.0, 4, 'Ração GHI');
INSERT INTO produto (preco, categoria_id, nome) VALUES (4.0, 4, 'Ração JKL');
INSERT INTO produto (preco, categoria_id, nome) VALUES (4.0, 4, 'Ração MNO');

INSERT INTO produto (preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório ABC');
INSERT INTO produto (preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório DEF');
INSERT INTO produto (preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório GHI');
INSERT INTO produto (preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório JKL');
INSERT INTO produto (preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório MNO');

INSERT INTO veiculo (marca, modelo, placa) VALUES ('Toyota', 'Corolla', 'ABC-1234');
INSERT INTO veiculo (marca, modelo, placa) VALUES ('Honda', 'Civic', 'DEF-5678');
INSERT INTO veiculo (marca, modelo, placa) VALUES ('Ford', 'Focus', 'GHI-9101');

-- Associando ao veículo Toyota Corolla (ID 1)
INSERT INTO proprietario (nome, veiculo_id) VALUES ('Carlos Silva', 1);  

-- Associando ao veículo Honda Civic (ID 2)
INSERT INTO proprietario (nome, veiculo_id) VALUES ('Ana Souza', 2);  

-- Associando ao veículo Ford Focus (ID 3);
INSERT INTO proprietario (nome, veiculo_id) VALUES ('João Pereira', 3);  