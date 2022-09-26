mysql> use sb101;
Database changed
mysql> create table student(roll int primary key,name varchar(12) not null,address varchar(12) not null,mobile varchar(10) not null);
Query OK, 0 rows affected (0.55 sec)

mysql> create table course(cid int primary key,cname varchar(12) not null,fee int not null,duration varchar(12) not null);
Query OK, 0 rows affected (0.16 sec)

mysql> create table studentcourse(
-> roll int,
-> cid int,
-> foreign key(roll)
-> references student(roll),
-> foreign key(cid)
-> references course(cid)
-> );
Query OK, 0 rows affected (1.15 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| roll    | int         | NO   | PRI | NULL    |       |
| name    | varchar(12) | NO   |     | NULL    |       |
| address | varchar(12) | NO   |     | NULL    |       |
| mobile  | varchar(10) | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.49 sec)

mysql> desc course;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| cid      | int         | NO   | PRI | NULL    |       |
| cname    | varchar(12) | NO   |     | NULL    |       |
| fee      | int         | NO   |     | NULL    |       |
| duration | varchar(12) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
4 rows in set (0.03 sec)

mysql> desc studentcourse;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| roll  | int  | YES  | MUL | NULL    |       |
| cid   | int  | YES  | MUL | NULL    |       |
+-------+------+------+-----+---------+-------+
2 rows in set (0.00 sec)

----------------------------------------------------------------------------------------------------------------------------------

mysql> insert into student values(4,"amith","chennai","65431351");
Query OK, 1 row affected (0.20 sec)

mysql> insert into studentcourse values(4,101);
Query OK, 1 row affected (0.06 sec)

mysql> insert into studentcourse values(4,102);
Query OK, 1 row affected (0.14 sec)

mysql> select * from student;
+------+-------+------------+------------+
| roll | name  | address    | mobile     |
+------+-------+------------+------------+
|    1 | dev   | davanagere | 8105848723 |
|    2 | raj   | bangalore  | 654135654  |
|    3 | kumar | mumbai     | 468888746  |
|    4 | amith | chennai    | 65431351   |
+------+-------+------------+------------+
4 rows in set (0.00 sec)

mysql> select * from studentcourse;
+------+------+
| roll | cid  |
+------+------+
|    1 |  101 |
|    2 |  102 |
|    3 |  201 |
|    1 |  101 |
|    4 |  101 |
|    4 |  102 |
+------+------+
6 rows in set (0.00 sec)

---------------------------------------------------------------------------------------------------------------------------

mysql>  insert into student values(5,"venkat","mysore","6544564");
Query OK, 1 row affected (0.17 sec)

mysql> insert into studentcourse values(5,101);
Query OK, 1 row affected (0.12 sec)

mysql> insert into studentcourse values(5,201);
Query OK, 1 row affected (0.10 sec)

mysql> select * from student;
+------+--------+------------+------------+
| roll | name   | address    | mobile     |
+------+--------+------------+------------+
|    1 | dev    | davanagere | 8105848723 |
|    2 | raj    | bangalore  | 654135654  |
|    3 | kumar  | mumbai     | 468888746  |
|    4 | amith  | chennai    | 65431351   |
|    5 | venkat | mysore     | 6544564    |
+------+--------+------------+------------+
5 rows in set (0.00 sec)

mysql> select * from studentcourse;
+------+------+
| roll | cid  |
+------+------+
|    1 |  101 |
|    2 |  102 |
|    3 |  201 |
|    1 |  101 |
|    4 |  101 |
|    4 |  102 |
|    5 |  101 |
|    5 |  201 |
+------+------+
8 rows in set (0.00 sec)


--------------------------------------------------------------------------------------------------------------------------------

mysql> insert into studentcourse values(2,333);
Query OK, 1 row affected (0.08 sec)

mysql> select * from studentcourse;
+------+------+
| roll | cid  |
+------+------+
|    1 |  101 |
|    2 |  102 |
|    3 |  201 |
|    1 |  101 |
|    4 |  101 |
|    4 |  102 |
|    5 |  101 |
|    5 |  201 |
|    2 |  333 |
+------+------+
9 rows in set (0.00 sec)

---------------------------------------------------------------------------------------------------------------------------------

mysql> insert into student values(6,"sursh","hubli","12356454");
Query OK, 1 row affected (0.22 sec)

mysql> insert into studentcourse values(6,101);
Query OK, 1 row affected (0.10 sec)

mysql>  insert into studentcourse values(6,103);
Query OK, 1 row affected (0.17 sec)

mysql>  insert into studentcourse values(6,201);
Query OK, 1 row affected (0.16 sec)

mysql> select * from studentcourse;
+------+------+
| roll | cid  |
+------+------+
|    1 |  101 |
|    2 |  102 |
|    3 |  201 |
|    1 |  101 |
|    4 |  101 |
|    4 |  102 |
|    5 |  101 |
|    5 |  201 |
|    2 |  333 |
|    6 |  101 |
|    6 |  103 |
|    6 |  201 |
+------+------+
12 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------

mysql> insert into student values(7,"binay","davanagere","16546451");
Query OK, 1 row affected (0.13 sec)

mysql> insert into studentcourse values(7,201);
Query OK, 1 row affected (0.14 sec)

mysql> select * from student;
+------+--------+------------+------------+
| roll | name   | address    | mobile     |
+------+--------+------------+------------+
|    1 | dev    | davanagere | 8105848723 |
|    2 | raj    | bangalore  | 654135654  |
|    3 | kumar  | mumbai     | 468888746  |
|    4 | amith  | chennai    | 65431351   |
|    5 | venkat | mysore     | 6544564    |
|    6 | sursh  | hubli      | 12356454   |
|    7 | binay  | davanagere | 16546451   |
+------+--------+------------+------------+
7 rows in set (0.00 sec)

mysql> select * from course;j
+-----+-----------+-------+----------+
| cid | cname     | fee   | duration |
+-----+-----------+-------+----------+
| 101 | java      | 50000 | 6        |
| 102 | spring    | 30000 | 5        |
| 103 | hibernate | 70000 | 8        |
| 201 | react     | 30000 | 5        |
| 333 | angular   | 60000 | 7        |
+-----+-----------+-------+----------+
5 rows in set (0.00 sec)

mysql> select * from studentcourse;
+------+------+
| roll | cid  |
+------+------+
|    1 |  101 |
|    2 |  102 |
|    3 |  201 |
|    1 |  101 |
|    4 |  101 |
|    4 |  102 |
|    5 |  101 |
|    5 |  201 |
|    2 |  333 |
|    6 |  101 |
|    6 |  103 |
|    6 |  201 |
|    7 |  201 |
+------+------+
13 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------