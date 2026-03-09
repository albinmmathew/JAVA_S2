-- SQL Setup for JDBC Programs (49-53)
-- Target: Oracle Database (FREEPDB1)

-- 0. Cleanup (Run these to drop old objects if they exist)
-- DROP TABLE empl CASCADE CONSTRAINTS;
-- DROP TABLE emp CASCADE CONSTRAINTS;
-- DROP TABLE dept CASCADE CONSTRAINTS;
-- DROP TABLE login CASCADE CONSTRAINTS;
-- DROP PROCEDURE get_emp_name;

-- 1. Create and populate 'empl' table
CREATE TABLE empl (
    eno NUMBER(38) PRIMARY KEY,
    ename VARCHAR2(20),
    esal FLOAT(126),
    dno NUMBER(38)
);

INSERT INTO empl (eno, ename, esal, dno) VALUES (1, 'abc', 10000, 10);
INSERT INTO empl (eno, ename, esal, dno) VALUES (2, 'bcd', 20000, 20);
COMMIT;


-- 2. Create and populate 'dept' table
CREATE TABLE dept (
    dno NUMBER(38) PRIMARY KEY,
    dname VARCHAR2(20),
    dloc VARCHAR2(20)
);

INSERT INTO dept (dno, dname, dloc) VALUES (10, 'MCA', 'MB');
INSERT INTO dept (dno, dname, dloc) VALUES (20, 'MSW', 'OB');
COMMIT;


-- 3. Create and populate 'login' table (for PROGRAM 50)
CREATE TABLE login (
    username VARCHAR2(20) PRIMARY KEY,
    password VARCHAR2(20)
);

INSERT INTO login (username, password) VALUES ('admin', '1234');
INSERT INTO login (username, password) VALUES ('albin', 'albin');
COMMIT;

-- 4. Create procedure for PROGRAM 52 (Callable Statement)
CREATE OR REPLACE PROCEDURE get_emp_name (
    p_eno IN NUMBER,
    p_ename OUT VARCHAR2
) AS
BEGIN
    SELECT ename INTO p_ename FROM empl WHERE eno = p_eno;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        p_ename := 'Not Found';
END;
/

-- Verification Queries
-- SELECT * FROM empl;
-- SELECT * FROM dept;
-- SELECT * FROM login;
-- SELECT e.ename, d.dname FROM empl e JOIN dept d ON e.dno = d.dno;
