CREATE TABLE Membership (
    membership_id INT PRIMARY KEY,
    type VARCHAR(50),
    price DOUBLE
);

CREATE TABLE Member (
    member_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    phone VARCHAR(20),
    membership_id INT,
    FOREIGN KEY (membership_id) REFERENCES Membership(membership_id)
);

CREATE TABLE Trainer (
    trainer_id INT PRIMARY KEY,
    name VARCHAR(100),
    specialty VARCHAR(100)
);

CREATE TABLE TrainingSession (
    session_id INT PRIMARY KEY,
    member_id INT,
    trainer_id INT,
    date DATE,
    FOREIGN KEY (member_id) REFERENCES Member(member_id),
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id)
);
