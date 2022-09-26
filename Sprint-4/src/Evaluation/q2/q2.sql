mysql> use sb101;
Database changed
mysql> create table department(did int primary key,dname varchar(12) not null,location varchar(12) not null);
Query OK, 0 rows affected (1.79 sec)

mysql> create table employee(empid int primary key,ename varchar(12),address varchar(12) not null,mobile varchar(12),salary int not null, deptid int, foreign key(deptid) references department(did));
Query OK, 0 rows affected (0.54 sec)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


mysql> insert into department values(1,"accounts","bangalore");
Query OK, 1 row affected (0.23 sec)

mysql> insert into department values(2,"sales","chennai");
Query OK, 1 row affected (0.10 sec)

mysql> insert into department values(3,"marketing","hyderabad");
Query OK, 1 row affected (0.13 sec)

mysql> insert into department values(4,"hr","kochi");
Query OK, 1 row affected (0.12 sec)

-----------------------------------------------------------------------------------------------------------------------------------------


mysql> insert into employee values(101,"Dev","Davanagere","451285455",30000,1);
Query OK, 1 row affected (0.12 sec)

mysql> insert into employee values(102,"Raj","Shivamogga","5465411",45000,1);
Query OK, 1 row affected (0.05 sec)

------------------------------------------------------------------------------------------------------------------------------------


mysql> insert into employee values(103,"Kumar","Delhi","45421655",50000,2);
Query OK, 1 row affected (0.06 sec)

mysql> insert into employee values(104,"Sourav","haryana","88954155",40000,2);
Query OK, 1 row affected (0.28 sec)

mysql> insert into employee values(105,"dillp","chennai","454511645",32000,2);
Query OK, 1 row affected (0.12 sec)

------------------------------------------------------------------------------------------------------------------------------------

mysql> insert into employee values(106,"adi","panjab","12154845645",35000,3);
Query OK, 1 row affected (0.15 sec)

mysql> insert into employee values(107,"raju","mangalore","6563214565",42000,3);
Query OK, 1 row affected (0.13 sec)

mysql> insert into employee values(108,"mahesh","mysore","15245464",38000,3);
Query OK, 1 row affected (0.04 sec)

-----------------------------------------------------------------------------------------------------------------------------------------

mysql> insert into employee values(109,"suhas","hubli","4565655",45000,4);
Query OK, 1 row affected (0.03 sec)

mysql> insert into employee values(110,"reddy","bellary","78956565",55000,4);
Query OK, 1 row affected (0.13 sec)

-------------------------------------------------------------------------------------------------------------------------------------

mysql> select * from department;
+-----+-----------+-----------+
| did | dname     | location  |
+-----+-----------+-----------+
|   1 | accounts  | bangalore |
|   2 | sales     | chennai   |
|   3 | marketing | hyderabad |
|   4 | hr        | kochi     |
+-----+-----------+-----------+
4 rows in set (0.00 sec)

mysql> select * from employee;
+-------+--------+------------+-------------+--------+--------+
| empid | ename  | address    | mobile      | salary | deptid |
+-------+--------+------------+-------------+--------+--------+
|   101 | Dev    | Davanagere | 451285455   |  30000 |      1 |
|   102 | Raj    | Shivamogga | 5465411     |  45000 |      1 |
|   103 | Kumar  | Delhi      | 45421655    |  50000 |      2 |
|   104 | Sourav | haryana    | 88954155    |  40000 |      2 |
|   105 | dillp  | chennai    | 454511645   |  32000 |      2 |
|   106 | adi    | panjab     | 12154845645 |  35000 |      3 |
|   107 | raju   | mangalore  | 6563214565  |  42000 |      3 |
|   108 | mahesh | mysore     | 15245464    |  38000 |      3 |
|   109 | suhas  | hubli      | 4565655     |  45000 |      4 |
|   110 | reddy  | bellary    | 78956565    |  55000 |      4 |
+-------+--------+------------+-------------+--------+--------+
10 rows in set (0.00 sec)

------------------------------------------------------------------------------------------------------------------------------------

mysql> select sum(salary),dname from department,employee where department.did=employee.deptid group by dname;
+-------------+-----------+
| sum(salary) | dname     |
+-------------+-----------+
|       75000 | accounts  |
|      122000 | sales     |
|      115000 | marketing |
|      100000 | hr        |
+-------------+-----------+
4 rows in set (0.02 sec)

---------------------------------------------------------------------------------------------------------------------------------

mysql> select * from employee,department where employee.deptid=department.did and dname="sales";
+-------+--------+---------+-----------+--------+--------+-----+-------+----------+
| empid | ename  | address | mobile    | salary | deptid | did | dname | location |
+-------+--------+---------+-----------+--------+--------+-----+-------+----------+
|   103 | Kumar  | Delhi   | 45421655  |  50000 |      2 |   2 | sales | chennai  |
|   104 | Sourav | haryana | 88954155  |  40000 |      2 |   2 | sales | chennai  |
|   105 | dillp  | chennai | 454511645 |  32000 |      2 |   2 | sales | chennai  |
+-------+--------+---------+-----------+--------+--------+-----+-------+----------+
3 rows in set (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------

mysql> select empid,did,dname,location from employee ,department where employee.deptid=department.did group by empid;
+-------+-----+-----------+-----------+
| empid | did | dname     | location  |
+-------+-----+-----------+-----------+
|   101 |   1 | accounts  | bangalore |
|   102 |   1 | accounts  | bangalore |
|   103 |   2 | sales     | chennai   |
|   104 |   2 | sales     | chennai   |
|   105 |   2 | sales     | chennai   |
|   106 |   3 | marketing | hyderabad |
|   107 |   3 | marketing | hyderabad |
|   108 |   3 | marketing | hyderabad |
|   109 |   4 | hr        | kochi     |
|   110 |   4 | hr        | kochi     |
+-------+-----+-----------+-----------+
10 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------------

mysql>  select max(salary) secondMax from employee where salary < (select max(salary) from employee);
+-----------+
| secondMax |
+-----------+
|     50000 |
+-----------+
1 row in set (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------