-- Create the quiz application database
CREATE DATABASE IF NOT EXISTS quiz_app;
USE quiz_app;

-- Table to store user information
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
    
);
ALTER TABLE users  
-- DROP COLUMN username;
-- -- ADD COLUMN fname VARCHAR(30) DEFAULT NULL ,  
ADD COLUMN dob VARCHAR(30) DEFAULT NULL ;
-- ADD COLUMN lname VARCHAR(30) DEFAULT NULL ,  
-- ADD COLUMN contact VARCHAR(20) DEFAULT NULL ,
-- ADD COLUMN city VARCHAR(20) DEFAULT NULL ,
-- ADD COLUMN state VARCHAR(20) DEFAULT NULL ,
-- ADD COLUMN address VARCHAR(20) DEFAULT NULL ; 

-- Table to store quizzes
CREATE TABLE IF NOT EXISTS quizzes (
    quiz_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    created_by INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (created_by) REFERENCES users(user_id)
);

-- Table to store questions
CREATE TABLE IF NOT EXISTS questions (
    question_id INT AUTO_INCREMENT PRIMARY KEY,
    quiz_id INT,
    question_text TEXT NOT NULL,
    FOREIGN KEY (quiz_id) REFERENCES quizzes(quiz_id)
);

-- Table to store answers
CREATE TABLE IF NOT EXISTS answers (
    answer_id INT AUTO_INCREMENT PRIMARY KEY,
    question_id INT,
    answer_text TEXT NOT NULL,
    is_correct TINYINT(1) DEFAULT 0,
    FOREIGN KEY (question_id) REFERENCES questions(question_id)
);

-- Table to store user quiz attempts
CREATE TABLE IF NOT EXISTS quiz_attempts (
    attempt_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    quiz_id INT,
    score INT,
    started_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    completed_at TIMESTAMP,
    FOREIGN KEY (user_id)
        REFERENCES users (user_id),
    FOREIGN KEY (quiz_id)
        REFERENCES quizzes (quiz_id)
);

-- Table to store user answers for quiz attempts
CREATE TABLE IF NOT EXISTS user_answers (
    user_answer_id INT AUTO_INCREMENT PRIMARY KEY,
    attempt_id INT,
    question_id INT,
    selected_answer_id INT,
    FOREIGN KEY (attempt_id) REFERENCES quiz_attempts(attempt_id),
    FOREIGN KEY (question_id) REFERENCES questions(question_id),
    FOREIGN KEY (selected_answer_id) REFERENCES answers(answer_id)
);

-- Add indexes or constraints as needed

-- Example Index on quiz_attempts table to improve query performance
-- CREATE INDEX idx_attempt_user_quiz ON quiz_attempts(user_id, quiz_id);

-- Example Unique constraint on user_answers to prevent duplicate entries
-- CREATE UNIQUE INDEX idx_attempt_question ON user_answers(attempt_id, question_id);

-- You can add more tables or fields as needed for your specific applic

select *from users;
describe users;
ALTER TABLE users MODIFY COLUMN dob VARCHAR(30) NOT NULL DEFAULT '{}';
ALTER TABLE users;
-- drop table user_answers;
-- drop table quiz_attempts;
-- drop table quizzes;

ALTER TABLE users 
 drop column address;	

CREATE TABLE IF NOT EXISTS `quant_ques` (
  `qus_no` varchar(20) NOT NULL,
  `ques` varchar(200) NOT NULL,
  `option_a` varchar(200) NOT NULL,
  `option_b` varchar(200) NOT NULL,
  `option_c` varchar(200) NOT NULL,
  `option_d` varchar(200) NOT NULL,
  `crct_ans` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table `quant_ques`
--

INSERT INTO `quant_ques` (`qus_no`, `ques`, `option_a`, `option_b`, `option_c`, `option_d`, `crct_ans`) VALUES
('1', 'The number are co-prime only iff and only iff their HCF is', '2', '3', '1', 'None of These', '1'),
('2', 'Which of following no''s are prime number', '6,4', '2,3', '8,12', 'None of These', '2,3'),
('3', 'What is the square root of 35', '1445', '1226', '1257', '1225', '1225'),
('4', ' Cube root of 45', '90453', '91125', '92453', 'None of These', '91125'),
('5', 'Which of following no is divisible by 2', '24148', '26143', '27169', '27177', '24148');

-- Table structure for table `logical_ques`
--

CREATE TABLE IF NOT EXISTS `logical_ques` (
  `ques_no` varchar(200) NOT NULL,
  `ques` varchar(200) NOT NULL,
  `option_a` varchar(200) NOT NULL,
  `option_b` varchar(200) NOT NULL,
  `option_c` varchar(200) NOT NULL,
  `option_d` varchar(200) NOT NULL,
  `crct_ans` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `logical_ques`
--

INSERT INTO `logical_ques` (`ques_no`, `ques`, `option_a`, `option_b`, `option_c`, `option_d`, `crct_ans`) VALUES
('1', 'What is the position of alphabet R from Right to left', '21', '17', '9', '14', '9'),
('2', 'IF NEHA s written as AEHN,how HEMA is written', 'ASTC', 'AEMH', 'DBRT', 'HEMA', 'AEMH'),
('3', 'ORANGE is written as QTCPIG,how HOUSE is written', 'PQRST', 'MNOPQ', 'JOWUG', 'ABCDE', 'JOWUG'),
('4', 'SUMMER is written as Runner,how WINTER is written ', 'ABCDEF', 'IJKLMN', 'VIOUER', 'WXYZN', 'VIOUER'),
('5', 'DONKEY is written as ERONFZ,how ZEBRA is written ', 'ZQADY', 'VIOUE', 'SMTPQ', 'AHCUB', 'AHCHB');


--
-- Table structure for table `verbal`
--

CREATE TABLE IF NOT EXISTS `verbal` (
  `ques_no` varchar(200) NOT NULL,
  `ques` varchar(200) NOT NULL,
  `option_a` varchar(200) NOT NULL,
  `option_b` varchar(200) NOT NULL,
  `option_c` varchar(200) NOT NULL,
  `option_d` varchar(200) NOT NULL,
  `crct_ans` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DELETE t1 FROM logical_ques t1
INNER JOIN logical_ques t2 
WHERE 
    t1.ques_no = t2.ques_no AND 
    t1.crct_ans = t2.crct_ans;



INSERT INTO `verbal` (`ques_no`, `ques`, `option_a`, `option_b`, `option_c`, `option_d`, `crct_ans`) VALUES
('1', 'Which of the following has a same meaning as that of word AUDACIOUS', 'Engrave', 'Overconfident', 'Confident', 'Evacuated', 'Overconfident'),
('2', 'Which of following have opposite meaning as that of AGGRESSIVE', 'Peaceful', 'Assertive', 'Provke', 'Obivous', 'Assertive'),
('3', 'The one who is having very Selective taste', 'Incorrigible', 'Accessible', 'Fastidious', 'Exocommunicate', 'Fastidious'),
('4', 'He is not ...... Honourable man', 'who', 'the', 'a', 'an', 'an'),
('5', 'What is the superlative degree of the word SWEET', 'Sweet', 'Sweeter', 'Sweetest', 'Sweetier', 'Sweetest');


CREATE TABLE IF NOT EXISTS `technical` (
  `ques_no` varchar(200) NOT NULL,
  `ques` varchar(200) NOT NULL,
  `option_a` varchar(200) NOT NULL,
  `option_b` varchar(200) NOT NULL,
  `option_c` varchar(200) NOT NULL,
  `option_d` varchar(200) NOT NULL,
  `crct_ans` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `technical`
--

INSERT INTO `technical` (`ques_no`, `ques`, `option_a`, `option_b`, `option_c`, `option_d`, `crct_ans`) VALUES
('1', 'Wrapping up of a data into single unit is known as', 'Polymorphism', 'Data Abstraction', 'Encapsulation', 'Inheritance', 'Encapsulation'),
('2', 'C language is developed by ', 'Martin Richards', 'Ken thompson', 'Dennis Ritche', 'None of the above', 'Dennis Ritche'),
('3', 'C++ is developed by ', 'Dennis Ritche', 'Bjarne Stroustruop', 'Bill Gates', 'Steve Jobs', 'Bjarne Stroustruop'),
('4', 'Divide by Zero is which type of Error', 'Compilation Error', 'Syntax Error', 'Logic Error', 'Runtime Error', 'Logic Error'),
('5', 'Which function is used to hold the output screen till users enter a key ', 'printf()', 'scanf()', 'main()', 'getch()', 'getch()');