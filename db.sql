show databases ;
create database mydb1;
use mydb1;
select database();
create user 'wangbq'@'localhost' identified by '123456';
grant all on mydb1.* to 'wangbq'@'localhost' identified by '123456';
create table users(
    id int primary key auto_increment,
    usercode varchar(20) not null ,
    username varchar(20) not null ,
    age int not null ,
    borndate date,
    address varchar(30)
)charset =utf8;