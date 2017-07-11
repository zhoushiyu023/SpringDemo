use mavenspringdemo;

CREATE TABLE zsy_user (
	user_id INT UNSIGNED AUTO_INCREMENT,
	user_name VARCHAR(100) DEFAULT '',
	user_password VARCHAR(100) DEFAULT '',
	has_number INT UNSIGNED DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    primary key (user_id)
)COMMENT '用户表';

CREATE TABLE zsy_book (
	book_id INT UNSIGNED AUTO_INCREMENT,
	book_name VARCHAR(100) DEFAULT '',
    author_Name VARCHAR(100) DEFAULT '',
	has_number INT UNSIGNED DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    primary key (book_id) 
)COMMENT '书表';

CREATE TABLE zsy_book_order(
	order_id INT UNSIGNED AUTO_INCREMENT,
	book_id INT UNSIGNED DEFAULT 0,
    user_id INT UNSIGNED DEFAULT 0,
	state INT(1) UNSIGNED DEFAULT 0 COMMENT '0表示未还，1表示已还，2表示丢失，3表示损坏，4其他情况',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    primary key (order_id) 
)COMMENT '借阅表';