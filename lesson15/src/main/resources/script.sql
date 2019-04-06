CREATE TABLE "poll"
(
    id    SERIAL,
    title TEXT
);

CREATE TABLE "option"
(
    id      SERIAL,
    text    TEXT,
    votes   INTEGER,
    poll_id INTEGER
);

INSERT INTO poll(title)
VALUES ('Ваш возраст?'),
       ('Ваше образование?');

INSERT INTO option(text, votes, poll_id)
VALUES ('>30', 0, 1),
       ('от 18 до 30', 0, 1),
       ('младше 18', 0, 1);












