
/* Drop existing tables */
DROP TABLE PRODUCT;


/* Create table 'Product' */
CREATE TABLE PRODUCT (
  id int not null PRIMARY KEY,
  name VARCHAR(255) not null,
  price double not null,
  description TEXT not null,
  category VARCHAR(255) NOT NULL
);


/* Insert dummy data into product*/
INSERT INTO PRODUCT (ID, NAME, DESCRIPTION, CATEGORY, PRICE)
VALUES (1, 'Schnitzel', 'Schnitzel mit Beilagen aus der Region', 'Lebensmittel', 18);
INSERT INTO PRODUCT (ID, NAME, DESCRIPTION, CATEGORY, price)
VALUES (2, 'Hamburger', 'Hamburger mit Beilagen und Rindfleisch aus der Region','Fastfood', 11);
INSERT INTO PRODUCT (ID, NAME, DESCRIPTION, CATEGORY, price)
VALUES (3, 'Pommes', 'Pommes mit Ketchup', 'Fastfood', 13);
