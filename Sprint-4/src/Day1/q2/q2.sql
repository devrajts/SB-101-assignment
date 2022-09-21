mysql> create table student(name varchar(20),rollNo int,branch varchar(20),city varchar(20));
Query OK, 0 rows affected (0.31 sec)

mysql> insert into student values("VIJAYA",150,"CSE","CHENNAI");
Query OK, 1 row affected (0.05 sec)

mysql> insert into student values("SITA",202,"ETC","KOKATA");
Query OK, 1 row affected (0.21 sec)

mysql> insert into student values("RAVI",300,"EEE","DELHI");
Query OK, 1 row affected (0.04 sec)

mysql> insert into student values("BASU",165,"ETC","CHENNAI");
Query OK, 1 row affected (0.06 sec)

mysql> insert into student values("RASMI",107,"ETC","RKL");
Query OK, 1 row affected (0.05 sec)

mysql> insert into student values("KARAN",111,"CSE","CTC");
Query OK, 1 row affected (0.05 sec)

mysql> insert into student values("REKHA",117,"BME","BBSR");
Query OK, 1 row affected (0.04 sec)

mysql> select * from student;
+--------+--------+--------+---------+
| name   | rollNo | branch | city    |
+--------+--------+--------+---------+
| VIJAYA |    150 | CSE    | CHENNAI |
| SITA   |    202 | ETC    | KOKATA  |
| RAVI   |    300 | EEE    | DELHI   |
| BASU   |    165 | ETC    | CHENNAI |
| RASMI  |    107 | ETC    | RKL     |
| KARAN  |    111 | CSE    | CTC     |
| REKHA  |    117 | BME    | BBSR    |
+--------+--------+--------+---------+
7 rows in set (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------------
1)
mysql>  select count(*) number,branch from student group by branch;
+--------+--------+
| number | branch |
+--------+--------+
|      2 | CSE    |
|      3 | ETC    |
|      1 | EEE    |
|      1 | BME    |
+--------+--------+
4 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------
2)
mysql> select count(*),branch from student where branch like "E%" group by branch;
+----------+--------+
| count(*) | branch |
+----------+--------+
|        3 | ETC    |
|        1 | EEE    |
+----------+--------+
2 rows in set (0.00 sec)

---------------------------------------------------------------------------------------------------------------------------------------
3)
mysql> alter table student add marks int;
Query OK, 0 rows affected (0.26 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from student;
+--------+--------+--------+---------+-------+
| name   | rollNo | branch | city    | marks |
+--------+--------+--------+---------+-------+
| VIJAYA |    150 | CSE    | CHENNAI |  NULL |
| SITA   |    202 | ETC    | KOKATA  |  NULL |
| RAVI   |    300 | EEE    | DELHI   |  NULL |
| BASU   |    165 | ETC    | CHENNAI |  NULL |
| RASMI  |    107 | ETC    | RKL     |  NULL |
| KARAN  |    111 | CSE    | CTC     |  NULL |
| REKHA  |    117 | BME    | BBSR    |  NULL |
+--------+--------+--------+---------+-------+
7 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------
4)
mysql> alter table student modify name varchar(25);
Query OK, 0 rows affected (0.19 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc student;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| name   | varchar(25) | YES  |     | NULL    |       |
| rollNo | int         | YES  |     | NULL    |       |
| branch | varchar(20) | YES  |     | NULL    |       |
| city   | varchar(20) | YES  |     | NULL    |       |
| marks  | int         | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
5 rows in set (0.29 sec)

-----------------------------------------------------------------------------------------------------------------------------------
5)
mysql> delete from student where branch = "ETC";
Query OK, 3 rows affected (0.15 sec)

mysql> select * from student ;
+--------+--------+--------+---------+-------+
| name   | rollNo | branch | city    | marks |
+--------+--------+--------+---------+-------+
| VIJAYA |    150 | CSE    | CHENNAI |  NULL |
| RAVI   |    300 | EEE    | DELHI   |  NULL |
| KARAN  |    111 | CSE    | CTC     |  NULL |
| REKHA  |    117 | BME    | BBSR    |  NULL |
+--------+--------+--------+---------+-------+
4 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------
6)
mysql> alter table student rename to studinformation;
Query OK, 0 rows affected (0.54 sec)

mysql> select * from studinformation;
+--------+--------+--------+---------+-------+
| name   | rollNo | branch | city    | marks |
+--------+--------+--------+---------+-------+
| VIJAYA |    150 | CSE    | CHENNAI |  NULL |
| RAVI   |    300 | EEE    | DELHI   |  NULL |
| KARAN  |    111 | CSE    | CTC     |  NULL |
| REKHA  |    117 | BME    | BBSR    |  NULL |
+--------+--------+--------+---------+-------+
4 rows in set (0.12 sec)

-------------------------------------------------------------------------------------------------------------------------------
7)
mysql> truncate table studinformation;
Query OK, 0 rows affected (0.65 sec)

mysql> select * from studinformation;
Empty set (0.00 sec)

---------------------------------------------------------------------------------------------------------------------------------
8)
mysql> drop table studinformation;
Query OK, 0 rows affected (0.09 sec)

mysql> select * from studinformation;
ERROR 1146 (42S02): Table 'sb101.studinformation' doesn't exist

-------------------------------------------------------------------------------------------------------------------------------------
