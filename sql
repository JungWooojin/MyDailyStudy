--  05/11

SELECT 1 as num, 'abc' as str
UNION all
SELECT 9 as num, 'xyzaa' as str
UNION all
SELECT 1 AS num , 'abc' AS str;
-- union= 기본적으로 중복제거를 해준다, 컬럼 갯수가 같을 떄 사용가능하다! 
-- 컬럼명은 젤 위에 있는 것 기준으로 작성되므로 밑에는 따로 as를 안해도 된다 

SELECT 'customer' AS typ , FIRST_name,last_name
FROM customer
UNION
SELECT 'actor',first_name,last_name
FROM actor
ORDER BY first_name; 


-- 배우,고객 둘다 이름이 (first_name)  J or D 로 시작하는 사람리스트
SELECT first_name
FROM customer
WHERE LEFT(first_name,1)='J'or LEFT(first_name,1)='D'
UNION 
SELECT first_name
FROM actor
WHERE LEFT(first_name,1)='J'or LEFT(first_name,1)='D';


SELECT a.first_name,a.last_name
from(SELECT 'customer' AS typ,FIRST_name,last_name
FROM customer
WHERE first_name REGEXP '^J' AND last_name REGEXP '^D'
UNION
SELECT 'actor', first_name, last_name
FROM actor
WHERE first_name REGEXP '^J' AND last_name REGEXP '^D') AS a 
GROUP BY a.first_name,a.last_name
HAVING COUNT(1) =1;


CREATE TABLE except_a(
id INT UNSIGNED
);
CREATE TABLE except_b(
id INT UNSIGNED
);


INSERT INTO except_a(id)
VALUES(10),(11),(12),(10),(10);

INSERT INTO except_b(id)
VALUES(10),(10);

-- 10, 11, 12
SELECT id FROM except_a
UNION
SELECT id FROM except_b;

SELECT first_name,last_name
FROM actor
WHERE last_name LIKE 'L%'
UNION
SELECT a.first_name,a.last_name
FROM customer AS a
WHERE a.last_name LIKE 'L%'
ORDER BY last_name;



CREATE TABLE string_tbl(
CHAR_fld CHAR(30),
vchar_fld VARCHaR(30),
text_fld text
);

INSERT INTo string_tbl
(char_fld, vchar_fld, text_fld)
VALUES
(
 	'This is char data',
 	'This is varchar data',
 	'This is text data'
);
 

SELECT *, QUOTE(text_fld) FROM STRING_tbl;

UPDATE string_tbl
SET text_fld = 'This s\'tring didn''t WORK, but it does now';
-- 수정은 안된다 예외 처리 quote(값) 넣으면 \,' 값도 출력가능

SELECT @@SESSION.sql_mode; -- 접속개인저장공간 시간지나면 로그아웃되고 다른사람이 로그인하면 그 세션자리 제공 다시들어오면 새로운 세션자리만들어짐 

SET sql_mode = 'strict'; 

SHOW WARNINGS ;

SELECT lname, fname, CONCAT(lname,' ',fname)
FROM person;

SELECT lname,CHar_LENGTH(lname) -- 문자길이 카운팅할때 쓰는함수 
FROM person;

SELECT lname,POSITION('ur'in lname) -- turner 기준 2번째자리부터시작하므로 값은 2
FROM person;


SELECT text_fld, POSITION('홍' IN text_fld)
FROM string_tbl;


SELECT * FROM string_tbl;

SELECT text_fld, POSITION('n' IN text_fld), LOCATE('n',text_fld,12)  
FROM string_tbl;
-- 첫번째로 n만나는 자리의 숫자칸, 12번째부터 세알렸을 때 처음으로 나오는 n자리수 


SELECT '안녕' = '안녕' 
		, 'abc' = 'ABC'
		, 'abc' ='cba'
		, STRCMP('abc','ABCC')
		, STRCMP('abc','ab');
-- 1이 트루 0이 폴스 

SELECT 
	NAME
	, NAME LIKE '%y' 
	, NAME REGEXP '^[C]'
FROM category;

SELECT first_name, replace(first_name, 'BA', 'DA')FROM customer; -- 실제값을 바꿔준건아니고 바꿔주려면 update 를 해서 바꿔줘야한다.

-- 이름 에서 PH > TH 바꾸고, NI>NA ====> STETHANAE

SELECT first_name,  replace(REPLACE(first_name, 'PH','TH'),'NI','NA')
FROM customer
WHERE customer_id=41;

SELECT 'goodbye world',INSERT('goodbye world', 9, 0,'cruel ')
,INSERT('goodbye asdf world',
 	POSITION('world' in'goodbye asdf world'),CHAR_LENGTH('world'),'cls');
-- 영화제목 빈칸에 NICE 추가해주세요 

SELECT title, REPLACE(title,' ', 'NICE') FROM film;
SELECT title, INSERT(title,POSITION(' ' IN title ) ,0,' NICE')FROM film;

SELECT email
, substring(email,3)
, SUBSTRING(email,3,6)
, SUBSTR(email,3,3) -- mid랑 똑같다 
FROM customer ;

-- 사용자이메일을 쪼개서 출력@기준으로
SELECT SUBSTR(email,1,POSITION('@' IN email)-1),SUBSTR(email,POSITION('@' IN email)+1) 
from customer;

SELECT (38*59)/(78-(8*6));



SELECT MOD(9,2);

SELECT TRUNCATE(1123.3456,3), ABS(-10),ABS(10);

SELECT NOW(), CURRENT_DATE(), CURRENT_TIME(), CURRENT_TIMESTAMP();

SELECT CAST('2023-05-11 16:46:30' AS DATETIME)
, CONVERT('2023-05-11 16:46:30',DATETIME); -- 형변환해주는 함수  

SELECT date_add(CURRENT_DATE(), INTERVAL 5 DAY)
, DATE_ADD(NOW(),INTERVAL '03:27:11' HOUR_SECOND);



-- 1953-09-02 실행하고나면 1955-10-02
SELECT * FROM employees
WHERE emp_no =10001;

UPDATE employees
SET birth_date = DATE_ADD(birth_Date, interval'2-1' YEAR_MONTH)
WHERE emp_no=10001;

SELECT 
	CURDATE(), 
	SYSDATE(), 
	WEEKDAY(NOW()),-- 월(0),화(1),수(2),목(3),금(4),토(5),일(6)
	DAYNAME(NOW()),
	LAST_DAY(NOW()), -- 그 달의 마지막 일 
	DATE_SUB(NOW(),INTERVAL '2' YEAR)
	,EXTRACT(MONTH FROM NOW())
	,DATEDIFF('2023-09-20', '2023-05-11') 	;



SELECT 'Please find the substring in this string' , MID('Please find the substring in this string',17,9);
SELECT ABS(-25.76823),SIGN(-25.76823),ROUND(-25.76823,2);
SELECT month(NOW());




SELECT customer_id,COUNT(1) FROM rental 
group BY customer_id
ORDER BY COUNT(1) desc;





-- limit(1), limist(1,1)

SELECT * FROM rental
ORDER BY rental_id DESC
LIMIT 2,3; -- 그냥 숫자 하나만적으면 처음부터 숫자 두개적으면 처음  위치 인덱스숫자부터로부터  리미트 개수만 출력

-- join 이용하여 사용자 이름 찍어주세요.
SELECT b.customer_id,b.first_name, b.last_name,COUNT(1) cnt 
FROM rental a
JOIN customer b
ON a.customer_id= b.customer_id
GROUP BY customer_id
ORDER BY COUNT(1) desc
LIMIT 1;

-- 가장 적게 빌린 사람의 pk,이름 ,빌린 수

SELECT b.customer_id,b.first_name,b.last_name,COUNT(1) cnt 
FROM rental a
JOIN customer b
ON a.customer_id= b.customer_id
GROUP BY customer_id
ORDER BY COUNT(1) 
LIMIT 1;


SELECT customer_id, COUNT(1)
FROM rental
GROUP BY customer_id
ORDER BY 2 DESC; -- select의 2번째의 컬럼으로 내림차순을 해주어라 

-- 렌탈횟수가 40회 이상인 사람들 pk, 이름,성 , 빌린수

SELECT b.customer_id, b.first_name,b.last_name,COUNT(1) cnt
FROM rental a
JOIN customer b
ON a.customer_id= b.customer_id
GROUP BY customer_id 
HAVING cnt >= 40 -- group by의 짝궁 
ORDER BY cnt ;

-- max, min, avg, count, sum

SELECT customer_id
, MAX(amount), MIN(amount)
,AVG(amount),SUM(amount) / COUNT(amount) 
FROM payment
GROUP BY customer_id;

SELECT COUNT(customer_id)
, COUNT(DISTINCT customer_id) -- 셀렉트 뒤뿐만이 아니라 카운트 안에도 입력가능하다.
FROM payment;

SELECT COUNT(1)
FROM customer;

--  빌리고나서  제일늦게 반납한사람


SELECT B.last_name, B.first_name, B.customer_id
FROM (
   SELECT DISTINCT customer_id
   FROM rental
   WHERE DATEDIFF(return_date, rental_date) =
      (
         SELECT MAX(DATEDIFF(return_date, rental_date))
         FROM rental
      )
)A
INNER JOIN customer B
ON A.customer_id = B.customer_id
ORDER BY B.customer_id;
						
						
						

-- where 절에 레코드값은 각절에 적용이 된다.

-- 배우의 등급별 출연횟수

SELECT a.actor_id,b.rating,COUNT(10) cnt
FROM film_actor a
INNER JOIN film b
ON a.film_id=b.film_id
GROUP BY a.actor_id,b.rating -- 다중열 그룹화 id값과 등급을 pk로 잡음
ORDER BY cnt desc;

-- 배우의 카테고리별 출연횟수 
SELECT y.actor_id , y.first_name,y.last_name, x.category_id,x.name,z.cnt
FROM(
	SELECT a.actor_id,c.category_id,COUNT(1) cnt
	FROM film_actor a
	JOIN film_category c
	ON a.film_id = c.film_id
	GROUP BY a.actor_id,c.category_id
)z
JOIN actor y
ON y.actor_id = z.actor_id
JOIN category X
ON z.category_id = x.category_id
ORDER BY y.actor_id;

-- 연도별 렌탈 횟수 궁금쓰..

SELECT CONCAT(YEAR(rental_date),'년')  yy, COUNT(1)
 FROM rental
 GROUP BY yy;

-- 롤업 생성

SELECT a.actor_id, f.rating, COUNT(1) 
FROM film_actor a
JOIN film f
ON a.film_id = f.film_id
GROUP BY a.actor_id, f.rating WITH ROLLUP; -- order by와 함께 쓰일수 없다. 

-- 배우의 등급(G,PG)별 출연횟수 궁금함 , 출연횟수가 9초과 인 actor_id 궁금

SELECT b.actor_id, COUNT(1) cnt,a.rating 
FROM film a
JOIN film_actor b
ON a.film_id = b.film_id
WHERE a.rating IN ('G','PG')
GROUP BY a.rating, b.actor_id 
HAVING cnt > 9;



-- 8-1,2,3 실습

SELECT COUNT(1)
FROM payment;

SELECT customer_id,sum(amount),COUNT(1)
FROM payment
GROUP BY customer_id;

SELECT customer_id,COUNT(1)
FROM payment
GROUP BY customer_id
HAVING COUNT(1)>= 40;





-- 배우의 등급(G,PG)별 출연횟수 궁금함 , 출연횟수가 9초과 인 actor_id 궁금



SELECT b.actor_id,a.rating, COUNT(1)
FROM film a
JOIN film_actor b
ON a.film_id=b.film_id
WHERE a.rating IN ('G','PG')
GROUP BY a.rating,b.actor_id
HAVING COUNT(1) > 9;
