create database db_farmacia_bem_estar;

use db_farmacia_bem_estar;

create table tb_categorias(
id bigint auto_increment,
nome varchar(255),
preco double,
primary key(id)
);


create table tb_produtos(
id bigint auto_increment,
nome varchar(255),
descricao varchar(255),
tipo varchar(255),
promocao varchar(255),
classificacao varchar(255),
primary key(id),
tb_categorias bigint,
foreign key(tb_categorias) references tb_categorias(id)
);

select * from tb_categorias;
insert into tb_categorias (nome,preco) values ('Soro','50.50');
insert into tb_categorias (nome,preco) values ('remedio para gripe e dor','4.50');
insert into tb_categorias (nome,preco) values ('dor de estomago','6.95');
insert into tb_categorias (nome,preco) values ('dor de cabeça e dores no corpo','10.20');
insert into tb_categorias (nome,preco) values ('Anti-alergico','9.90');

select * from tb_produtos;

insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('neosoro','Remedio para dilatação nasal','soro','não','Generico',1);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('dipirona','dor de cabeça ou gripe','comprimido','10%','Generico',2);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('omeprazol','dor de estomago','comprimido','não','Generico',3);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('aciclovir','remedio para gripe','comprimido','não','Generico',4);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('loratadina','para coriza','comprimido','não','Generico',5);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('Dorflex','para dor no corpo','comprimido','não','Generico',4);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('aleatorio','Remedio para dilatação nasal','comprimido','não','Generico',2);
insert into tb_produtos (nome,descricao, tipo, promocao, classificacao, tb_categorias) values ('aleatorio','Remedio para dilatação nasal','comprimido','não','Generico',3);


select * from tb_categorias where preco > 50;
select tb_categorias.preco, tb_categorias.nome, tb_produtos.id  from tb_categorias inner join
tb_produtos on tb_produtos.id = tb_produtos.tb_categorias where tb_categorias.preco between '5.00' and '60.00';
SELECT * FROM tb_produtos WHERE nome LIKE 'C%';
select * from tb_produtos inner join tb_categorias on tb_categorias.id = tb_produtos.tb_categorias;

select tb_produto.nome from tb_produto  inner join 
tb_categoria on tb_categoria.id = tb_produto.tb_categorias where tb_categorias.nome = 'dor de estomago';





