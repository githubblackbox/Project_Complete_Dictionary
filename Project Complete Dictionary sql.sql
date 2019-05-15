create database uni;
use uni;

create table unicode(id int primary key auto_increment,english varchar(80),tamil varchar(80));

insert into unicode(english,tamil) values('english','ஆங்கிலம்');

create database etotcust;
use etotcust;

create table etotm(id int primary key auto_increment,username varchar(80),password varchar(80),email varchar(80));

insert into etotm(username,password,email) values('rajasekar','Rajasekar@2018','rajasekar@gmail.com');