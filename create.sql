CREATE TABLE authors
(
  author_id  INTEGER PRIMARY KEY AUTOINCREMENT,
  name       VARCHAR(255) NOT NULL,
  surname    VARCHAR(255) NOT NULL,
  birth_year INTEGER,
  city       VARCHAR(255),
  country    VARCHAR(255)
);

CREATE TABLE publishers
(
  publisher_id VARCHAR(255) PRIMARY KEY,
  name         VARCHAR(255) NOT NULL,
  city         VARCHAR(255),
  country      VARCHAR(255)
);

CREATE TABLE typebook
(
  type_id INTEGER PRIMARY KEY AUTOINCREMENT,
  type    VARCHAR(255)
);

CREATE TABLE books
(
  isbn             INTEGER PRIMARY KEY,
  author           INTEGER,
  title            VARCHAR(255),
  publisher        VARCHAR(255),
  publication_year INTEGER,
  price            DOUBLE,
  type             INTEGER,
  FOREIGN KEY (author) REFERENCES authors (author_id),
  FOREIGN KEY (publisher) REFERENCES publishers (publisher_id),
  FOREIGN KEY (type) REFERENCES typebook (type_id)
);