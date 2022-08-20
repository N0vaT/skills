DROP TABLE IF EXISTS sk_skill;
DROP TABLE IF EXISTS sk_language;
DROP TABLE IF EXISTS sk_programmer;
DROP TABLE IF EXISTS sk_question;
DROP TABLE IF EXISTS sk_test;

CREATE TABLE sk_programmer
(
    programmer_id serial,
    programmer_name varchar(40) not null,
    PRIMARY KEY (programmer_id)
);
CREATE TABLE sk_language
(
    language_id serial,
    language_title varchar(40) not null,
    language_description varchar(100),
    programmer_id int,
    PRIMARY KEY (language_id),
    FOREIGN KEY (programmer_id) REFERENCES sk_programmer(programmer_id)
);

CREATE TABLE sk_skill
(
    skill_id serial,
    skill_title varchar(40) not null,
    skill_description varchar(100),
    language_id int,
    PRIMARY KEY (skill_id),
    FOREIGN KEY (language_id) REFERENCES sk_language(language_id)
);

CREATE TABLE sk_test
(
    test_id serial,
    percent int not null,
    PRIMARY KEY (test_id)
);

CREATE TABLE sk_question
(
    question_id serial,
    question varchar(500) not null,
    answer varchar(500),
    test_id int,
    PRIMARY KEY (question_id),
    FOREIGN KEY (test_id) REFERENCES sk_test(test_id)
);

