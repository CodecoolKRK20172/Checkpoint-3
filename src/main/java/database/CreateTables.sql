CREATE TABLE Authors (
  author_id INTEGER PRIMARY KEY,
  name TEXT,
  surname TEXT,
  brith_year TEXT,
  city TEXT,
  country TEXT
);


CREATE TABLE Publishers (
  publisher_id TEXT PRIMARY KEY,
  name TEXT,
  city TEXT,
  country TEXT
);


CREATE TABLE TypeBook (
  type_id INTEGER PRIMARY KEY,
  type TEXT
);


CREATE TABLE Books (
  ISBN INTEGER PRIMARY KEY,
  author INTEGER,
  title TEXT,
  publisher INTEGER,
  publication_year TEXT,
  price INTEGER,
  type INTEGER,
  FOREIGN KEY (type) REFERENCES TypeBook(type_id),
  FOREIGN KEY (author) REFERENCES Authors(author_id),
  FOREIGN KEY (publisher) REFERENCES Publishers(publisher_id)
);