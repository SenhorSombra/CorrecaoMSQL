/*Crie um banco de dados para um serviço de uma Pizzaria,  O nome deverá ser nome db_pizzaria_legal */
create database db_pizzaria_legal;

use db_pizzaria_legal;
/*Crie a tabela tb_categorias e determine pelo menos 2 atributos,
 além da Chave Primária, relevantes para classificar as pizzas.*/
create table tb_categorias(
id bigint auto_increment,
nome varchar(255),
sabor varchar(255),
primary key(id)
);

/*Crie a tabela tb_pizzas e determine 4 atributos, 
além da Chave Primária, relevantes aos produtos da pizzaria.*/
create table tb_pizzas(
id bigint auto_increment,
nome varchar(255),
ingredientes varchar(255),
preco double,
adicionais varchar(255),
primary key(id),
/*criar a Foreign Key da tabela tb_classes na tabela tb_personagens.*/
tb_categorias bigint,
foreign key(tb_categorias) references tb_categorias(id)
);


select * from tb_categorias;
insert into tb_categorias(nome,sabor) values ('Pizza', 'Salgada');
insert into tb_categorias(nome,sabor) values ('Pizza', 'doce');
insert into tb_categorias(nome,sabor) values ('Esfiha', 'Salgada');
insert into tb_categorias(nome,sabor) values ('Esfiha', 'doce');
insert into tb_categorias(nome,sabor) values ('Pizza brotinho', 'Salgada');
insert into tb_categorias(nome,sabor) values ('Pizza brotinho', 'doce');

/*Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.*/
select * from tb_pizzas;
insert into tb_pizzas(nome,ingredientes, preco, adicionais,tb_categorias) values
					('Mista', 'Calabresa e mussarela','38.00','sem adicionais',1);
insert into tb_pizzas(nome,ingredientes, preco, adicionais, tb_categorias) values 
					('Pizzaiolo', 'Frango, Calabresa, milho, cebola e mussarela','53.00','bacon',1);
insert into tb_pizzas(nome,ingredientes, preco, adicionais, tb_categorias) values 
					('banana com chocolate', 'banana, chocolate e canela','40.00','sem adicionais',2);
insert into tb_pizzas(nome,ingredientes, preco, adicionais,tb_categorias) values 
					('Choco-Mix', 'chocolate ao leite e chocolate branco','39.00','sem adicionais',2);
insert into tb_pizzas(nome,ingredientes, preco, adicionais,tb_categorias) values
					('Pacote 1', 'Calabresa, mussarela, carne e mista','40.00','5 itens de cada',3);
insert into tb_pizzas(nome,ingredientes, preco, adicionais, tb_categorias) values 
					('Pacote especial', 'Chocolate com banana, choco-mix','35.00','5 itens de cada',4);
insert into tb_pizzas(nome,ingredientes, preco, adicionais, tb_categorias) values 
					('bacon', 'Bacon, mussarela, ovos','30.00','sem adicionais',5);
insert into tb_pizzas(nome,ingredientes, preco, adicionais, tb_categorias) values 
					('Banana com chocolate', 'banana, chocolate e canela','30.00','sem adicionais',6);


                        
/*Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.*/
select * from  tb_pizzas where preco > '40';

/*Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00*/
select tb_pizzas.preco from tb_pizzas inner join
tb_categorias on tb_categorias.id = tb_pizzas.tb_categorias where tb_pizzas.preco between '50.00' and '100.00';

/*Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.*/
SELECT * FROM tb_pizzas WHERE nome LIKE 'M%';

/*Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias*/
select * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.tb_categorias;

/*Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias,
 onde traga apenas as pizzas que pertençam a uma categoria específica.*/
select tb_categorias.sabor, tb_categorias.nome, tb_pizzas.nome from tb_categorias  inner join 
tb_pizzas on tb_categorias.id = tb_pizzas.tb_categorias where tb_categorias.sabor = 'doce';