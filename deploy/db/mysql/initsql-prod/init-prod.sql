CREATE DATABASE `bot` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER 'bot'@'%' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON `bot`.* TO 'bot'@'%';
FLUSH PRIVILEGES;