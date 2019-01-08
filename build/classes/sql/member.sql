SELECT * FROM member;
-- 계정 생성하기
CREATE USER oracle IDENTIFIED BY password;
oracle/password;

-- 권한 부여
GRANT RESOURCE, CONNECT, DBA TO oracle;

-- 현재 사용자 정보
SHOW USER
 
-- 테이블의 정보를 몽땅 보여줘~
SELECT * FROM TAB;

-- 테이블 생성하기
CREATE TABLE member(
    id VARCHAR2(10),
    name VARCHAR2(10),
    pass VARCHAR2(10),
    ssn VARCHAR2(14)
);

-- 테이블 지우기
DROP TABLE member;

-- 인스턴스 생성 ==> DB에서 한 row를 추가하는것
INSERT INTO member(id,name,pass,ssn)
VALUES('hong','홍길동','1','930605-1234567');

SELECT * FROM member;

