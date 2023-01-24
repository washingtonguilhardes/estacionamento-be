create database if not exists `estacionamentodb`;
use `estacionamentodb`;
create table if not exists `carro`
(
    `id`     int        not null primary key auto_increment,
    `placa`  varchar(8) not null,
    `modelo` text,
    `cor`    text
);

create table if not exists `vaga`
(
    `id`             int          not null primary key auto_increment,
    `andar`          varchar(4)   not null,
    `indentificador` varchar(100) not null
);

create table if not exists carro_vaga
(
    `id`               int      not null primary key auto_increment,
    `id_carro`         int      not null,
    `id_vaga`          int      not null,
    `datahora_entrada` datetime not null,
    `datahora_saida`   datetime,
    constraint FK_CARRO
        FOREIGN KEY (id_carro) REFERENCES carro (id),

    constraint FK_VAGA
        FOREIGN KEY (id_vaga) REFERENCES vaga (id)
);