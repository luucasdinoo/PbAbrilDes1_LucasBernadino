CREATE TABLE Person{

    id INT PRIMARY KEY NOT NULL,
    name VARCHAR(100),
    age INT(3)

};

CREATE TABLE Waggon{

    number INT PRIMARY KEY NOT NULL,
    seat1 INT,
    seat2 INT,
    FOREIGN KEY (seat1) REFERENCES Person(id),
    FOREIGN KEY (seat2) REFERENCES Person(id)

};