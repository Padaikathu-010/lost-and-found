CREATE DATABASE lost_found_db;
USE lost_found_db;
SHOW TABLES;

CREATE TABLE items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    contact_info VARCHAR(255) NOT NULL
);

SELECT * FROM items;
drop database lost_found_db;