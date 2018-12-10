
/* Drop existing tables */
DROP TABLE PRODUCT, BOOKING;


/* Create table 'Product' */
CREATE TABLE PRODUCT (
  id int not null AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) not null,
  description TEXT not null,
  price double not null,
  category VARCHAR(255) not null,
  creationdate TIMESTAMP
);

/* Create table 'Booking' */
CREATE TABLE BOOKING (
  id int not null AUTO_INCREMENT PRIMARY KEY,
  tablenumber int not null
);


/* Insert dummy data into product*/
INSERT INTO PRODUCT (ID, NAME, DESCRIPTION, PRICE, CATEGORY, CREATIONDATE)
VALUES (1, 'Schnitzel', 'Schnitzel mit Beilagen aus der Region', 10, 'Classik', CURRENT_TIMESTAMP),
 	   (2, 'Schnitzel', 'Schnitzel mit Beilagen aus der Region', 10, 'Classik', CURRENT_TIMESTAMP),
       (3, 'Schnitzel', 'Schnitzel mit Beilagen aus der Region', 10, 'Classik', CURRENT_TIMESTAMP),
       (4, 'Schnitzel', 'Schnitzel mit Beilagen aus der Region', 10, 'Classik', CURRENT_TIMESTAMP);


/* Insert dummy data into product*/
INSERT INTO BOOKING (id, tablenumber)
VALUES (1, 1),
 	   (2, 2),
       (3, 3);
