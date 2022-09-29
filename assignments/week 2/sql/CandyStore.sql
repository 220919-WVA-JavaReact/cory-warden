--1
CREATE TABLE inventory (
id serial PRIMARY KEY,
"name" varchar(50),
price decimal,
description varchar(255),
quantity int
);

--2
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('1001 ', 'Hershey Bar ', '3.45 ', 'A small chocolate bar ', '50');
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('1002 ', 'Skittles ', '3.05 ', 'A bag of rainbow colored candies ', '100');
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('2003 ', 'Gummy Bears ', '5.55 ', 'A large bag of chewy fruit-flavored bears ', '48');
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('2005 ', 'Sour Gummy Worms ', '9.55 ', 'A very large bag of gelatin worms ', '20');
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('3008 ', 'Lollipop ', '2.25 ', 'A hard candy atop a stick ', '268');
INSERT INTO inventory (ID , NAME , PRICE , DESCRIPTION , QUANTITY) VALUES ('9007 ', 'M&Ms ', '1.95 ', 'A bag of small chocolate candies ', '58');
--3
SELECT * FROM inventory;
--4
UPDATE inventory SET quantity = 48 WHERE id = 1001;
--5
SELECT i.description FROM inventory i;
--6
SELECT i."name" , i.price FROM inventory i;
--7
UPDATE inventory SET description = 'A very large, delicious bag of worms' WHERE id = 1002;
--8
UPDATE inventory SET quantity = 100 WHERE id = 9007;
--9
UPDATE inventory SET price = 2.50 WHERE id = 3008;
--10
CREATE TABLE employees (
id int,
"name" varchar(50),
favorite_candy int REFERENCES inventory
);
--1
INSERT INTO employees (ID , Name , favorite_candy) VALUES ('4001 ', 'Willy Wonka ', '2005');
INSERT INTO employees (ID , Name , favorite_candy) VALUES ('4002 ', 'Milton Hershey ', '1001');
INSERT INTO employees (ID , Name , favorite_candy) VALUES ('4003 ', 'Franklin Mars ', '9007');
INSERT INTO employees (ID , Name , favorite_candy) VALUES ('4004 ', 'John Cadbury ', NULL);
--12
SELECT e."name", i."name" 
FROM employees e 
JOIN inventory i ON e.favorite_candy = i.id;
--13
SELECT i."name", e."name" 
FROM inventory i 
LEFT JOIN employees e ON i.id = e.favorite_candy;

------------------------------------bonus questions-------------------------------------------

--total cost for mnms
SELECT i.price * i.quantity  FROM inventory i WHERE i.id = 9007;
--select lowest price
SELECT i."name", i.price FROM inventory i
WHERE price = (SELECT min(price) FROM inventory);
--select highest quantity
SELECT i."name", i.quantity FROM inventory i 
WHERE quantity = (SELECT max(quantity) FROM inventory);
--select 3 most expensive candy items
SELECT * FROM inventory i ORDER BY price DESC LIMIT 3;
--run query for avg cost of all candies
SELECT round(avg(price), 2) FROM inventory i;
--print employee and how much to buy favorite candy stock
SELECT e.name, i.price * i.quantity
FROM employees e 
JOIN inventory i ON e.favorite_candy = i.id;
--print names of employees whose fav candy has 'chocolate' in it, only REQUIRES names, but put inv name and desc to show proper data.
SELECT e."name", i."name", i.description  
FROM employees e 
JOIN inventory i ON e.favorite_candy = i.id WHERE i.description LIKE '%chocolate%';


