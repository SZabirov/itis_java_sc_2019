--SQL - язык структурированных запросов

--для создания таблицы с тремя колонками:
CREATE TABLE "user"
(
	id INT,
	username TEXT,
	password TEXT
);

--для вставки в таблицу:
INSERT INTO "user"(id, username, password)
VALUES (1, 'salavat', 'qwerty123');

--получить все данные из таблицы
SELECT * FROM "user";


INSERT INTO "user"(id, username, password)
VALUES (2, 'petya', 'asdfasdf');

--выборка данных с условием
SELECT password FROM "user" WHERE username = 'petya';

SELECT username FROM "user" WHERE id = 1;

--удаление из user'a строк, в который id равен 2
DELETE FROM "user" WHERE id = 2;

SELECT * FROM "user" where id = 2;

--обновление имеющихся записей
UPDATE "user" SET username = 'SuperSalavat'
WHERE id = 1;

select * from "user";


CREATE TABLE product
(
	id SERIAL,
	name TEXT,
	cost INTEGER
);

INSERT INTO product(name, cost)
VALUES('TV', 20000);

select * from product;

--удаление таблицы
DROP TABLE product;

UPDATE product SET name = 'Multivarka' WHERE id = 1;

INSERT INTO product(name, cost)
VALUES('PC', 220000);

--order by - упорядочить по 
--desc - по убыванию
--asc - по возрастанию
select * from product order by name desc;

--Таблица, хранящая заказы: какой пользователь заказал
--какой товар
CREATE TABLE "order"
(
	id serial,
	user_id INTEGER,
	product_id INTEGER
);
