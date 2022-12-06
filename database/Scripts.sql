CREATE DATABASE usersDataTools;

CREATE TABLE users(
	id  SERIAL primary key,
	name varchar(40),
	last_name varchar(40),
	id_user varchar(09),
	hobbie int,
	gender int,
	email varchar(80),
	age int
);

select * from users;
