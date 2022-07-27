/*Crie um banco de dados para um serviço de um Games Online. Com o nome db_generation_game_online */
create database db_generation_game_online;

use db_generation_game_online;
/*O sistema trabalhará com 2 tabelas tb_personagens e tb_classe*/
create table tb_classe(
id bigint auto_increment,
nome varchar(255),
arma varchar(255),
descricao varchar(255),
primary key(id)
);

create table tb_personagem(
id bigint auto_increment,
nome varchar(255),
raca varchar(255),
ataque double,
ataqueM double,
defesa double,
hp int,
intt int,
fe int,
primary key(id),
/*criar a Foreign Key da tabela tb_classes na tabela tb_personagens.*/
classe_id bigint,
foreign key(classe_id) references tb_classe(id)
);

/*Insira 5 registros na tabela tb_classes.*/
select * from tb_classe;
insert into tb_classe(nome,arma,descricao) values ('Ladino','adaga','rouba e assassinato');
insert into tb_classe(nome,arma,descricao) values ('mago(a)','cajado','magia');
insert into tb_classe(nome,arma,descricao) values ('Paladino','Maca e escudo','faz tudo pela fé');
insert into tb_classe(nome,arma,descricao) values ('Priest','cajado ou amuleto','Cura e proteção');
insert into tb_classe(nome,arma,descricao) values ('Ranger','Arco e flecha + espada curta','Atirador');

/*Insira 8 registros na tabela tb_personagens*/
select * from tb_personagem;
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						 ('Vagner','HighElf','1000','2700', 700, 1500, 3000, 1000,2);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values
						('Bruna','HighElf','1000','2700','1700', '2000', '1500', '2000',4);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values
						('Cinthia','DarkElf','2700','1000','700', '1500','2000','400',5);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						('Jeffão','Humano','2000','1900','2500','3000','2000','2000',3);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						('Pajtak','DarkElf','2000','1900','700','1000','2000','500',1);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						('João','Humano','2000','2500','2500','3000','2000','2500',3);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						('Daniel','DarkElf','3000','1000','700', '1800','2500','400',5);
insert into tb_personagem(nome,raca,ataque, ataquem, defesa, hp, intt, fe, classe_id) values 
						('Igor','Humano','1000','3000','700', '1800','3000','1400',2);
                        
/*Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000*/
select * from tb_personagem where ataque > '2000';
select * from tb_personagem where ataque >= '2000';
/*Faça um SELECT que retorne todes os personagens cujo poder de ataque magico seja maior do que 2000*/
select * from tb_personagem where ataquem > '2000';
select * from tb_personagem where ataquem >= '2000';
/*Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.*/
select tb_personagem.defesa, tb_classe.nome, tb_classe.descricao from tb_personagem inner join 
tb_classe on tb_classe.id = tb_personagem.classe_id where tb_personagem.defesa between '1000' and '2000';
/*Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.*/
SELECT * FROM tb_personagem WHERE nome LIKE 'C%';
/*Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classe*/
select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;
/*Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).*/
select tb_personagem.nome, tb_classe.nome, tb_classe.descricao from tb_personagem inner join 
tb_classe on tb_classe.id = tb_personagem.classe_id where tb_classe.nome = 'Paladino';



                        










