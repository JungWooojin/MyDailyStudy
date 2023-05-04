-- DDL
CREATE TABLE t_test(
 id BIGINT UNSIGNED AUTO_INCREMENT
 , nm VARCHAR(100) NOT NULL
 , jumin CHAR(9) NOT null
 ,age INT NOT NULL
 ,addr VARCHAR(200)
 ,created_at DATETIME DEFAULT NOW()
 ,PRIMARY KEY(id)
);


DROP TABLE t_test;

-- DML
-- CRUD

INSERT INTO t_test
(nm,jumin,age,addr)
VALUES
('신사임당','901211112',30,'대구시');
INSERT INTO t_test
(nm,jumin,age,addr)
VALUES
('홍 길 동','951211112',25,'서울시');

insert t_test
SET nm = '강감찬'
,jumin = '971211212'
,age = 21
,addr = '경 북';

-- Read (Select문)

SELECT * FROM t_test;

SELECT nm, jumin FROM t_test;

SELECT nm, jumin AS '주 민 번 호'FROM t_test;

SELECT * 
FROM t_test
WHERE nm = '홍 길 동';

SELECT * FROM t_test
WHERE nm='신사임당'
AND age >27;

SELECT *FROM t_test
WHERE age = 25 OR age = 27;

SELECT * FROM t_test
WHERE age IN (25,27);

SELECT * FROM t_test
WHERE age BETWEEN 27 AND 30;

SELECT * from t_test
WHERE nm LIKE '%사임%';

-- U (update문)

UPDATE t_test
SET nm = '유관순'
WHERE id = 2;

UPDATE t_test
SET age = 22
,addr = '부산시'
WHERE id = 3;

-- delete

DELETE FROM t_test
WHERE id =4;




