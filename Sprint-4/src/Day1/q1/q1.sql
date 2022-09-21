mysql> create database sb101;
Query OK, 1 row affected (0.44 sec)
1)
mysql> use sb101;
Database changed
mysql> create table deposit(actNo varchar(25),cName varchar(20),bName varchar(20),amount int,aDate date);
Query OK, 0 rows affected (0.55 sec)

mysql> create table branch(bName varchar(20),city varchar(20));
Query OK, 0 rows affected (0.14 sec)

mysql> create table customer(cName varchar(20),city varchar(20));
Query OK, 0 rows affected (0.21 sec)

mysql> create table borrow(loanNo varchar(5),cName varchar(20),bName varchar(20),amount int);
Query OK, 0 rows affected (0.09 sec)

----------------------------------------------------------------------------------------------------------------------------
2)
mysql> desc deposit;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| actNo  | varchar(25) | YES  |     | NULL    |       |
| cName  | varchar(20) | YES  |     | NULL    |       |
| bName  | varchar(20) | YES  |     | NULL    |       |
| amount | int         | YES  |     | NULL    |       |
| aDate  | date        | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> desc branch;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| bName | varchar(20) | YES  |     | NULL    |       |
| city  | varchar(20) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> desc customer;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| cName | varchar(20) | YES  |     | NULL    |       |
| city  | varchar(20) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> desc borrow;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| loanNo | varchar(5)  | YES  |     | NULL    |       |
| cName  | varchar(20) | YES  |     | NULL    |       |
| bName  | varchar(20) | YES  |     | NULL    |       |
| amount | int         | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)


---------------------------------------------------------------------------------------------------------------------------------
3)
mysql> insert into deposit values(100,"ANIL","VRCE",1000,"1995-03-01");
Query OK, 1 row affected (0.08 sec)

mysql> insert into deposit values(101,"SUNIL","MGROAD",5000,"1996-01-04");
Query OK, 1 row affected (0.14 sec)

mysql> insert into deposit values(102,"RAHUL","KAROLBAGH",3500,"1995-11-17");
Query OK, 1 row affected (0.49 sec)

mysql> insert into deposit values(103,"MADHURI","CHANDNI",1200,"1995-12-17");
Query OK, 1 row affected (0.04 sec)

mysql> insert into deposit values(104,"PRAMOD","MGROAD",3000,"1996-03-27");
Query OK, 1 row affected (0.13 sec)

mysql> insert into deposit values(105,"SANDIP","KAROLBAGH",2000,"1996-03-31");
Query OK, 1 row affected (0.14 sec)

mysql> insert into branch values("VRCE","NAGPUR");
Query OK, 1 row affected (0.17 sec)

mysql> insert into branch values("KAROLBAGH","DELHI");
Query OK, 1 row affected (0.04 sec)

mysql> insert into branch values("CHANDNI","DELHI");
Query OK, 1 row affected (0.11 sec)

mysql> insert into branch values("MGROAD","BANGLORE");
Query OK, 1 row affected (0.18 sec)

mysql> insert into customer values("ANIL","CALCUTA");
Query OK, 1 row affected (0.14 sec)

mysql> insert into customer values("RAHUL","BARODA");
Query OK, 1 row affected (0.17 sec)

mysql> insert into customer values("MADHURI","NAGPUR");
Query OK, 1 row affected (0.21 sec)

mysql> insert into customer values("PRAMOD","NAGPUR");
Query OK, 1 row affected (0.05 sec)

mysql> insert into customer values("SUNIL","DELHI");
Query OK, 1 row affected (0.13 sec)

mysql> insert into borrow values(201,"ANIL","VRCE",1000);
Query OK, 1 row affected (0.16 sec)

mysql>  insert into borrow values(206,"RAHUL","KAROLBAGH",5000);
Query OK, 1 row affected (0.12 sec)

mysql>  insert into borrow values(311,"SUNIL","MGROAD",3000);
Query OK, 1 row affected (0.13 sec)

mysql>  insert into borrow values(321,"MADHURI","CHANDNI",2000);
Query OK, 1 row affected (0.21 sec)

mysql>  insert into borrow values(375,"PRAMOD","MGROAD",8000);
Query OK, 1 row affected (0.05 sec)

--------------------------------------------------------------------------------------------------------------------------
4)
mysql> select * from borrow where amount>2000 && amount<3000;
Empty set, 1 warning (0.13 sec)

--------------------------------------------------------------------------------------------------------------------------------
5)
mysql> select * from deposit;
+-------+---------+-----------+--------+------------+
| actNo | cName   | bName     | amount | aDate      |
+-------+---------+-----------+--------+------------+
| 100   | ANIL    | VRCE      |   1000 | 1995-03-01 |
| 101   | SUNIL   | MGROAD    |   5000 | 1996-01-04 |
| 102   | RAHUL   | KAROLBAGH |   3500 | 1995-11-17 |
| 103   | MADHURI | CHANDNI   |   1200 | 1995-12-17 |
| 104   | PRAMOD  | MGROAD    |   3000 | 1996-03-27 |
| 105   | SANDIP  | KAROLBAGH |   2000 | 1996-03-31 |
+-------+---------+-----------+--------+------------+
6 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------
6)
mysql> select cName,actNo from deposit;
+---------+-------+
| cName   | actNo |
+---------+-------+
| ANIL    | 100   |
| SUNIL   | 101   |
| RAHUL   | 102   |
| MADHURI | 103   |
| PRAMOD  | 104   |
| SANDIP  | 105   |
+---------+-------+
6 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------
7)
mysql> select cName from customer where city="NAGPUR";
+---------+
| cName   |
+---------+
| MADHURI |
| PRAMOD  |
+---------+
2 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------
8)
mysql> select cName from deposit where aDate>"1995-11-17";
+---------+
| cName   |
+---------+
| SUNIL   |
| MADHURI |
| PRAMOD  |
| SANDIP  |
+---------+
4 rows in set (0.12 sec)

---------------------------------------------------------------------------------------------------------------------------------
9)
mysql> select actNo,amount from deposit where aDate between "1995-12-01" and "1996-06-01";
+-------+--------+
| actNo | amount |
+-------+--------+
| 101   |   5000 |
| 103   |   1200 |
| 104   |   3000 |
| 105   |   2000 |
+-------+--------+
4 rows in set (0.01 sec)

--------------------------------------------------------------------------------------------------------------------------
10)
mysql> select * from deposit where cName like "c%";
Empty set (0.12 sec)

-------------------------------------------------------------------------------------------------------------------------------------
11)
mysql> select * from borrow where cName like "_u%";
+--------+-------+--------+--------+
| loanNo | cName | bName  | amount |
+--------+-------+--------+--------+
| 311    | SUNIL | MGROAD |   3000 |
+--------+-------+--------+--------+
1 row in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------
12)
mysql> select * from deposit where bName="CHANDNI" || bName="MGROAD";
+-------+---------+---------+--------+------------+
| actNo | cName   | bName   | amount | aDate      |
+-------+---------+---------+--------+------------+
| 101   | SUNIL   | MGROAD  |   5000 | 1996-01-04 |
| 103   | MADHURI | CHANDNI |   1200 | 1995-12-17 |
| 104   | PRAMOD  | MGROAD  |   3000 | 1996-03-27 |
+-------+---------+---------+--------+------------+
3 rows in set, 1 warning (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------
13)
mysql> select * from deposit where bName <> "CHANDNI" or bName <> "MGROAD";
+-------+---------+-----------+--------+------------+
| actNo | cName   | bName     | amount | aDate      |
+-------+---------+-----------+--------+------------+
| 100   | ANIL    | VRCE      |   1000 | 1995-03-01 |
| 101   | SUNIL   | MGROAD    |   5000 | 1996-01-04 |
| 102   | RAHUL   | KAROLBAGH |   3500 | 1995-11-17 |
| 103   | MADHURI | CHANDNI   |   1200 | 1995-12-17 |
| 104   | PRAMOD  | MGROAD    |   3000 | 1996-03-27 |
| 105   | SANDIP  | KAROLBAGH |   2000 | 1996-03-31 |
+-------+---------+-----------+--------+------------+
6 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------------------
14)
mysql> select * from deposit where amount > 1000 order by cName;
+-------+---------+-----------+--------+------------+
| actNo | cName   | bName     | amount | aDate      |
+-------+---------+-----------+--------+------------+
| 103   | MADHURI | CHANDNI   |   1200 | 1995-12-17 |
| 104   | PRAMOD  | MGROAD    |   3000 | 1996-03-27 |
| 102   | RAHUL   | KAROLBAGH |   3500 | 1995-11-17 |
| 105   | SANDIP  | KAROLBAGH |   2000 | 1996-03-31 |
| 101   | SUNIL   | MGROAD    |   5000 | 1996-01-04 |
+-------+---------+-----------+--------+------------+
5 rows in set (0.24 sec)

--------------------------------------------------------------------------------------------------------------------------
15)
mysql> select * from deposit where amount >1000 order by cName desc;
+-------+---------+-----------+--------+------------+
| actNo | cName   | bName     | amount | aDate      |
+-------+---------+-----------+--------+------------+
| 101   | SUNIL   | MGROAD    |   5000 | 1996-01-04 |
| 105   | SANDIP  | KAROLBAGH |   2000 | 1996-03-31 |
| 102   | RAHUL   | KAROLBAGH |   3500 | 1995-11-17 |
| 104   | PRAMOD  | MGROAD    |   3000 | 1996-03-27 |
| 103   | MADHURI | CHANDNI   |   1200 | 1995-12-17 |
+-------+---------+-----------+--------+------------+
5 rows in set (0.00 sec)

----------------------------------------------------------------------------------------------------------------------------------
16)
mysql> select * from borrow where cName like "__A%" or cName like "__D%";
+--------+---------+---------+--------+
| loanNo | cName   | bName   | amount |
+--------+---------+---------+--------+
| 321    | MADHURI | CHANDNI |   2000 |
| 375    | PRAMOD  | MGROAD  |   8000 |
+--------+---------+---------+--------+
2 rows in set (0.00 sec)

---------------------------------------------------------------------------------------------------------------------------
17)
mysql> select * from borrow where amount not between 2000 and 8000;
+--------+-------+-------+--------+
| loanNo | cName | bName | amount |
+--------+-------+-------+--------+
| 201    | ANIL  | VRCE  |   1000 |
+--------+-------+-------+--------+
1 row in set (0.02 sec)

--------------------------------------------------------------------------------------------------------------------------------
18)
mysql> select distinct * from deposit;
+-------+---------+-----------+--------+------------+
| actNo | cName   | bName     | amount | aDate      |
+-------+---------+-----------+--------+------------+
| 100   | ANIL    | VRCE      |   1000 | 1995-03-01 |
| 101   | SUNIL   | MGROAD    |   5000 | 1996-01-04 |
| 102   | RAHUL   | KAROLBAGH |   3500 | 1995-11-17 |
| 103   | MADHURI | CHANDNI   |   1200 | 1995-12-17 |
| 104   | PRAMOD  | MGROAD    |   3000 | 1996-03-27 |
| 105   | SANDIP  | KAROLBAGH |   2000 | 1996-03-31 |
+-------+---------+-----------+--------+------------+
6 rows in set (0.20 sec)

----------------------------------------------------------------------------------------------------------------------------------
19)
mysql>  update deposit set amount = amount+amount*0.1 where bName = "VRCE";
Query OK, 1 row affected (0.22 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from deposit where bName = "VRCE";
+-------+-------+-------+--------+------------+
| actNo | cName | bName | amount | aDate      |
+-------+-------+-------+--------+------------+
| 100   | ANIL  | VRCE  |   1100 | 1995-03-01 |
+-------+-------+-------+--------+------------+
1 row in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------
20)
mysql> update deposit set amount = amount+amount*0.1 where bName = "VRCE" and cName = "ANIL";
Query OK, 1 row affected (0.07 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from deposit where bName = "VRCE" and cName = "ANIL";
+-------+-------+-------+--------+------------+
| actNo | cName | bName | amount | aDate      |
+-------+-------+-------+--------+------------+
| 100   | ANIL  | VRCE  |   1210 | 1995-03-01 |
+-------+-------+-------+--------+------------+
1 row in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------


