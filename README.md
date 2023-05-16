CREATE TABLE t_deal (
	id INT UNSIGNED AUTO_INCREMENT,
	deal_date DATE NOT NULL,
	price INT UNSIGNED NOT NULL,
	PRIMARY KEY (id)
);
ALTER TABLE t_deal MODIFY price INT NOT NULL DEFAULT 0;
-- 테이블 수정(ALTER)


SELECT *
FROM normal.t_deal_sub;  -- 다른 db에 있는 테이블 조회 가능  ~~.


DROP TABLE t_deal_sub;

CREATE TABLE t_deal_sub(
	deal_id INT UNSIGNED,
	seq INT UNSIGNED,
	provider_cd CHAR(1) NOT NULL,
	parts_id INT UNSIGNED NOT NULL,
	quantity INT UNSIGNED NOT NULL,
	PRIMARY KEY(deal_id, seq),
	FOREIGN KEY (provider_cd) REFERENCES t_provider(cd),
	FOREIGN KEY (parts_id) REFERENCES t_parts(id),
	FOREIGN KEY (deal_id) REFERENCES t_deal(id)
);



CREATE TABLE t_provider(
	cd CHAR(1) PRIMARY KEY,
	nm VARCHAR(10) NOT NULL
);


CREATE TABLE t_parts(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nm VARCHAR(10) NOT NULL,
	price INT UNSIGNED NOT NULL
);



INSERT INTO t_provider (cd, nm)
VALUES ('A', '알파'),
		 ('B', '브라보'),
		 ('C', '찰리');


INSERT INTO t_parts (nm, price)
VALUES ('모니터', 200000),
		 ('마우스', 10000),
		 ('키보드', 30000);



INSERT INTO t_deal 
	(deal_date)
VALUES
	('2023-10-20')
	,('2023-10-20')
	,('2023-10-22')
;


-- provider_cd, parts_id, deal_id,
INSERT INTO t_deal_sub
	(deal_id, seq, provider_cd, parts_id, quantity) -- seq = 일련번호
VALUES
	(1, 1, 'A', 1, 10)
	,(1, 2, 'B', 2, 10)
	,(1, 3, 'C', 3, 10)
	,(2, 1, 'A', 1, 20)
	,(2, 2, 'B', 2, 10)
	,(3, 1, 'A', 2, 30)
	,(3, 2, 'C', 3, 5)
;



UPDATE t_deal a
JOIN(
	SELECT deal_id, SUM(a.quantity * c.price)total_price
	FROM t_deal_sub a
	JOIN t_parts c
	ON a.parts_id = c.id
	GROUP BY deal_id
	) b
ON a.id= b.deal_id
SET a.price = b.total_price; -- 안해주면 노가다로 하나씩 입력해주어야 함.





SELECT *
FROM t_deal_sub;




SELECT A.deal_id AS '전표번호', date_format(B.deal_date,'%m/%d') AS '날짜', C.cd AS'공급자', C.nm AS '공급자명', D.nm AS '부품명', D.price AS '단가', A.quantity '수량',
D.price * A.quantity AS '금액'
FROM t_deal_sub A
INNER JOIN t_deal B
ON A.deal_id = B.id
INNER JOIN t_provider C
ON A.provider_cd = C.cd
INNER JOIN t_parts D
ON A.parts_id = D.id 
ORDER BY A.deal_id , c.cd ;
