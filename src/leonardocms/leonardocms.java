//create database leonardocms;
//
//use leonardocms;
//
//
//create table medico (
//  id int primary key auto_increment,
//  cpf varchar(255),
//  crm int not null,
//  nome varchar(255),
//  especialidade int
//);
//create table paciente (
//  id int primary key auto_increment,
//  idade int,
//  cpf varchar(255),
//  nome varchar(255)
//);
//
//create table consulta (
//  convenio varchar(255),
//  id int primary key auto_increment,
//  idmedico int,
//  idpaciente int,
//  foreign key (idmedico) references medico(id),
//  foreign key (idpaciente) references paciente(id)
//);