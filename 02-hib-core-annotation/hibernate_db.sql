create database hibernate_db;

use hibernate_db;

create table events (event_id int primary key auto_increment, title varchar(100), event_date datetime);

create table contact (id int primary key auto_increment, name varchar(100));

