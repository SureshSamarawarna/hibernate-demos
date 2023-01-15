CREATE TABLE Customer(
                         id VARCHAR(5) NOT NULL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         address VARCHAR(500) NOT NULL
);

CREATE TABLE Item(
                     code VARCHAR(5) NOT NULL PRIMARY KEY,
                     description VARCHAR(255) NOT NULL,
                     qty INT NOT NULL,
                     unit_price DECIMAL(10,2) NOT NULL
);