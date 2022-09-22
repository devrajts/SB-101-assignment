mysql> use sb101;
Database changed
mysql> CREATE TABLE customers (
-> customer_id INT PRIMARY KEY,
-> first_name VARCHAR(255) NOT NULL,
-> last_name VARCHAR(255) NOT NULL,
-> email VARCHAR(255) NOT NULL,
-> address VARCHAR(255) DEFAULT NULL,
-> city VARCHAR(255) DEFAULT NULL,
-> state VARCHAR(2) DEFAULT NULL,
-> zip_code VARCHAR(5) DEFAULT NULL
-> );
Query OK, 0 rows affected (0.18 sec)

mysql> CREATE TABLE orders (
-> order_id INT PRIMARY KEY,
-> customer_id INT NOT NULL,
-> order_placed_date DATE NOT NULL,
-> FOREIGN KEY (customer_id) REFERENCES customers
-> (customer_id)
-> );
Query OK, 0 rows affected (0.18 sec)

mysql> insert into customers values(1,"abc","a","abc@mail.com","1st street","chennai","TN","60001");
Query OK, 1 row affected (0.13 sec)

mysql> insert into customers values(2,"efg","e","efg@mail.com","2st street","bangalore","KA","50002");
Query OK, 1 row affected (0.14 sec)

mysql> insert into customers values(3,"ijk","i","ijk@mail.com","3st street","mumbai","MH","40002");
Query OK, 1 row affected (0.13 sec)

mysql> insert into orders values(1,1,"2016-11-11");
Query OK, 1 row affected (0.15 sec)

mysql> insert into orders values(2,1,"2016-10-01");
Query OK, 1 row affected (0.13 sec)

mysql> insert into orders values(3,2,"2016-06-01");
Query OK, 1 row affected (0.15 sec)

mysql> insert into orders values(4,2,"2015-06-01");
Query OK, 1 row affected (0.09 sec)

mysql> insert into orders values(5,1,"2015-06-01");
Query OK, 1 row affected (0.04 sec)

mysql> select * from customers;
+-------------+------------+-----------+--------------+------------+-----------+-------+----------+
| customer_id | first_name | last_name | email        | address    | city      | state | zip_code |
+-------------+------------+-----------+--------------+------------+-----------+-------+----------+
|           1 | abc        | a         | abc@mail.com | 1st street | chennai   | TN    | 60001    |
|           2 | efg        | e         | efg@mail.com | 2st street | bangalore | KA    | 50002    |
|           3 | ijk        | i         | ijk@mail.com | 3st street | mumbai    | MH    | 40002    |
+-------------+------------+-----------+--------------+------------+-----------+-------+----------+
3 rows in set (0.00 sec)

mysql> select * from orders;
+----------+-------------+-------------------+
| order_id | customer_id | order_placed_date |
+----------+-------------+-------------------+
|        1 |           1 | 2016-11-11        |
|        2 |           1 | 2016-10-01        |
|        3 |           2 | 2016-06-01        |
|        4 |           2 | 2015-06-01        |
|        5 |           1 | 2015-06-01        |
+----------+-------------+-------------------+
5 rows in set (0.00 sec)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

mysql> select email,count(c.customer_id) count from customers c inner join orders o on c.customer_id=o.customer_id where o.order_placed_date > "2016-01-01" group by email;
+--------------+-------+
| email        | count |
+--------------+-------+
| abc@mail.com |     2 |
| efg@mail.com |     1 |
+--------------+-------+
2 rows in set (0.02 sec)