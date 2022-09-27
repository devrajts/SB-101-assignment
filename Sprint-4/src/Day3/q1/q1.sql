mysql> use sb101;
Database changed
mysql> create table programmer(empno int primary key,projid varchar(5),lastname varchar(30),firstname varchar(30),hiredate date,language varchar(15),taskno int,privilege varchar(25));
Query OK, 0 rows affected (0.24 sec)

mysql> insert into programmer values(201,"NPR","Gupta","Saurav","1995-01-01","VB",52,"Secret");
Query OK, 1 row affected (0.04 sec)

mysql> insert into programmer values(390,"KCW","Ghosh","Pinky","1993-05-01","JAVA",11,"TopSecret");
Query OK, 1 row affected (0.14 sec)

mysql> insert into programmer values(789,"VB","Agarwal","Praveen","1998-03-08","VB",11,"Secret");
Query OK, 1 row affected (0.12 sec)

mysql> insert into programmer values(896,"KCW","Jha","Ranjit","1997-06-15","JAVA",10,"TopSecret");
Query OK, 1 row affected (0.12 sec)

mysql> insert into programmer values(345,"TIPPS","John","Peter","1999-11-15","JAVA",52,null);
Query OK, 1 row affected (0.14 sec)

mysql> insert into programmer values(563,"NITTS","Anderson","Andy","1994-08-15","C++",89,"Confidential");
Query OK, 1 row affected (0.12 sec)

mysql> select * from programmer;
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
| empno | projid | lastname  | firstname | hiredate   | language | taskno | privilege    |
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
|   134 | TIPPS  | Chaudhary | Supriyo   | 1995-07-15 | C++      |     52 | Secret       |
|   201 | NPR    | Gupta     | Saurav    | 1995-01-01 | VB       |     52 | Secret       |
|   345 | TIPPS  | John      | Peter     | 1999-11-15 | JAVA     |     52 | NULL         |
|   390 | KCW    | Ghosh     | Pinky     | 1993-05-01 | JAVA     |     11 | TopSecret    |
|   563 | NITTS  | Anderson  | Andy      | 1994-08-15 | C++      |     89 | Confidential |
|   789 | VB     | Agarwal   | Praveen   | 1998-03-08 | VB       |     11 | Secret       |
|   896 | KCW    | Jha       | Ranjit    | 1997-06-15 | JAVA     |     10 | TopSecret    |
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
7 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------------------

mysql> update programmer set projid="NITTS",language="C++" where firstname = "Saurav";
Query OK, 1 row affected (0.14 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from programmer;
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
| empno | projid | lastname  | firstname | hiredate   | language | taskno | privilege    |
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
|   134 | TIPPS  | Chaudhary | Supriyo   | 1995-07-15 | C++      |     52 | Secret       |
|   201 | NITTS  | Gupta     | Saurav    | 1995-01-01 | C++      |     52 | Secret       |
|   345 | TIPPS  | John      | Peter     | 1999-11-15 | JAVA     |     52 | NULL         |
|   390 | KCW    | Ghosh     | Pinky     | 1993-05-01 | JAVA     |     11 | TopSecret    |
|   563 | NITTS  | Anderson  | Andy      | 1994-08-15 | C++      |     89 | Confidential |
|   789 | VB     | Agarwal   | Praveen   | 1998-03-08 | VB       |     11 | Secret       |
|   896 | KCW    | Jha       | Ranjit    | 1997-06-15 | JAVA     |     10 | TopSecret    |
+-------+--------+-----------+-----------+------------+----------+--------+--------------+
7 rows in set (0.00 sec)

------------------------------------------------------------------------------------------------------------------------------------

mysql> delete from programmer where firstname = "Supriyo";
Query OK, 1 row affected (0.12 sec)

mysql> select * from programmer;
+-------+--------+----------+-----------+------------+----------+--------+--------------+
| empno | projid | lastname | firstname | hiredate   | language | taskno | privilege    |
+-------+--------+----------+-----------+------------+----------+--------+--------------+
|   201 | NITTS  | Gupta    | Saurav    | 1995-01-01 | C++      |     52 | Secret       |
|   345 | TIPPS  | John     | Peter     | 1999-11-15 | JAVA     |     52 | NULL         |
|   390 | KCW    | Ghosh    | Pinky     | 1993-05-01 | JAVA     |     11 | TopSecret    |
|   563 | NITTS  | Anderson | Andy      | 1994-08-15 | C++      |     89 | Confidential |
|   789 | VB     | Agarwal  | Praveen   | 1998-03-08 | VB       |     11 | Secret       |
|   896 | KCW    | Jha      | Ranjit    | 1997-06-15 | JAVA     |     10 | TopSecret    |
+-------+--------+----------+-----------+------------+----------+--------+--------------+
6 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------

mysql> alter table programmer drop column Taskno;
Query OK, 0 rows affected (0.21 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from programmer;
+-------+--------+----------+-----------+------------+----------+--------------+
| empno | projid | lastname | firstname | hiredate   | language | privilege    |
+-------+--------+----------+-----------+------------+----------+--------------+
|   201 | NITTS  | Gupta    | Saurav    | 1995-01-01 | C++      | Secret       |
|   345 | TIPPS  | John     | Peter     | 1999-11-15 | JAVA     | NULL         |
|   390 | KCW    | Ghosh    | Pinky     | 1993-05-01 | JAVA     | TopSecret    |
|   563 | NITTS  | Anderson | Andy      | 1994-08-15 | C++      | Confidential |
|   789 | VB     | Agarwal  | Praveen   | 1998-03-08 | VB       | Secret       |
|   896 | KCW    | Jha      | Ranjit    | 1997-06-15 | JAVA     | TopSecret    |
+-------+--------+----------+-----------+------------+----------+--------------+
6 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------

mysql> create table department(deptno int primary key,dname varchar(20) not null,loc varchar(30) not null);
Query OK, 0 rows affected (0.31 sec)

mysql> desc department;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| deptno | int         | NO   | PRI | NULL    |       |
| dname  | varchar(20) | NO   |     | NULL    |       |
| loc    | varchar(30) | NO   |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.17 sec)

-----------------------------------------------------------------------------------------------------------------------------

mysql> alter table department modify column dname varchar(50);
Query OK, 0 rows affected (0.80 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc department;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| deptno | int         | NO   | PRI | NULL    |       |
| dname  | varchar(50) | YES  |     | NULL    |       |
| loc    | varchar(30) | NO   |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------

