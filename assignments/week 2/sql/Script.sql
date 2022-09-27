-- This is a comment in SQL;
-- SQL is used to interact with Databases. Define database structure before adding information.;
-- need table name, columns, datatypes;
-- datatypes you need to know: VARCHAR, BOOLEAN, INTEGER, CHAR; 
-- VARCHAR can be up to n chars by doing VARCHAR(n);
-- CHAR must be n characters long CHAR(n);

CREATE TABLE products (
-- All column definitions must fit in brackets
-- columnName dataType,
	productName varchar(255),
	productPrice int,
	department varchar(255),
	quantity int
);

--CTRL + ENTER runs script command.

CREATE TABLE pokemon (
-- specify column name that is also a keyword, best practice to put them in quotes
"number" int,
"name" varchar(20),
type1 varchar(20),
type2 varchar(20),
"level" int,
evolved bool
);

-- 5 sublanguages: 
-- DDL (Data Definition Language)- Defines and manipulates structure/schema for database.
-- DML (Data Manipulation Language)- Ways to manipulate data like CRUD methods
--Create new data --> INSERT 
--Read existing data --> SELECT 
--Update existing data --> UPDATE 
--Delete existing data --> DELETE 

INSERT INTO products VALUES ('Bike', 100, 'Sports', 1);

INSERT INTO products values('Toaster', 40, 'Kitchen', 5);

--adding to specific columns
INSERT INTO products (productname, productprice, department) VALUES ('Tomato', 1, 'Produce');

INSERT INTO pokemon VALUES (006, 'Charizard', 'Fire', 'Flying', 55, TRUE);
INSERT INTO pokemon VALUES (010, 'Caterpie', 'Bug', NULL, 12, FALSE);

CREATE TABLE countries (
"name" varchar(20),
abbreviation varchar(5),
capital varchar(20),
population int,
currency varchar(25),
hdi float
);

INSERT INTO countries VALUES('Hungary', 'HUNG', 'Budapest', 9749763, 'Forint', 0.846);
INSERT INTO countries VALUES('Russia', 'RUS', 'Moscow', 145864296, 'Ruble', 0.824);
INSERT INTO countries VALUES('Netherlands', 'NETH', 'Amsterdam', 17747000, 'Euro', 0.941);
INSERT INTO countries VALUES('Portugal', 'PORT', 'Lisbon', 10352042, 'Euro', 0.866);
INSERT INTO countries VALUES('Morocco', 'MORO', 'Rabat', 36746849, 'Dirham', 0.686);
INSERT INTO countries VALUES('Saudi Arabia', 'SARB', 'Riyadh', 38401000, 'Riyal', 0.875);
INSERT INTO countries VALUES('St Lucia', 'SLCA', 'Castries', 184961, 'East Carribean Dollar', 0.715);