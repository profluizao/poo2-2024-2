INSERT INTO categoria(nome) VALUES ('Medicamentos');
INSERT INTO categoria(nome) VALUES ('Suplementos');
INSERT INTO categoria(nome) VALUES ('Curativos');
INSERT INTO categoria(nome) VALUES ('Rações');
INSERT INTO categoria(nome) VALUES ('Acessórios');

INSERT INTO produto(preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo GHI');
INSERT INTO produto(preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo JKL');
INSERT INTO produto(preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo DEF');
INSERT INTO produto(preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo MNO');
INSERT INTO produto(preco, categoria_id, nome) VALUES (1.0, 1, 'Vermífugo ABC');

INSERT INTO produto(preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento ABC');
INSERT INTO produto(preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento DEF');
INSERT INTO produto(preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento GHI');
INSERT INTO produto(preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento JKL');
INSERT INTO produto(preco, categoria_id, nome) VALUES (2.0, 2, 'Suplemento MNO');

INSERT INTO produto(preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo ABC');
INSERT INTO produto(preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo DEF');
INSERT INTO produto(preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo GHI');
INSERT INTO produto(preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo JKL');
INSERT INTO produto(preco, categoria_id, nome) VALUES (3.0, 3, 'Curativo MNO');

INSERT INTO produto(preco, categoria_id, nome) VALUES (4.0, 4, 'Ração ABC');
INSERT INTO produto(preco, categoria_id, nome) VALUES (4.0, 4, 'Ração DEF');
INSERT INTO produto(preco, categoria_id, nome) VALUES (4.0, 4, 'Ração GHI');
INSERT INTO produto(preco, categoria_id, nome) VALUES (4.0, 4, 'Ração JKL');
INSERT INTO produto(preco, categoria_id, nome) VALUES (4.0, 4, 'Ração MNO');

INSERT INTO produto(preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório ABC');
INSERT INTO produto(preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório DEF');
INSERT INTO produto(preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório GHI');
INSERT INTO produto(preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório JKL');
INSERT INTO produto(preco, categoria_id, nome) VALUES (5.0, 5, 'Acessório MNO');

INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('João Silva', '123.456.789-00', 'joao.silva@example.com', '11987654321');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Maria Oliveira', '987.654.321-00', 'maria.oliveira@example.com', '11876543210');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Carlos Pereira', '111.222.333-44', 'carlos.pereira@example.com', '11765432109');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Ana Costa', '222.333.444-55', 'ana.costa@example.com', '11654321098');
INSERT INTO cliente (nome, cpf, email, telefone) VALUES ('Luiz Santos', '333.444.555-66', 'luiz.santos@example.com', '11543210987');

INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Distribuidora XYZ', 'XYZ Pets', '12.345.678/0001-90', 'contato@xyzpets.com', '11987654321');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Fornecedora ABC', 'ABC Rações', '98.765.432/0001-01', 'atendimento@abcracoes.com', '11876543210');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Vet Supply Co.', 'Vet Supplies', '33.444.555/0001-02', 'info@vetsupplyco.com', '11765432109');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Pet Produtos Ltda', 'Produtos Pet', '44.555.666/0001-03', 'vendas@petprodutos.com', '11654321098');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Animal Care', 'Cuidados Animais', '55.666.777/0001-04', 'contato@animalcare.com', '11543210987');

INSERT INTO pedido (nome, cliente_id, fornecedor_id, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 1', 1, 1, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, cliente_id, fornecedor_id, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 2', 2, 2, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, cliente_id, fornecedor_id, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 3', 3, 3, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, cliente_id, fornecedor_id, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 4', 4, 4, CURRENT_DATE, CURRENT_DATE);
INSERT INTO pedido (nome, cliente_id, fornecedor_id, data_de_inclusao, data_de_alteracao) VALUES ('Pedido 5', 5, 5, CURRENT_DATE, CURRENT_DATE);

INSERT INTO item_pedido (pedido_id, produto_id) VALUES (1, 1);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (1, 2);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (1, 5);

INSERT INTO item_pedido (pedido_id, produto_id) VALUES (2, 6);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (2, 8);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (2, 12);

INSERT INTO item_pedido (pedido_id, produto_id) VALUES (3, 10);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (3, 15);

INSERT INTO item_pedido (pedido_id, produto_id) VALUES (4, 14);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (4, 16);

INSERT INTO item_pedido (pedido_id, produto_id) VALUES (5, 3);
INSERT INTO item_pedido (pedido_id, produto_id) VALUES (5, 4);
