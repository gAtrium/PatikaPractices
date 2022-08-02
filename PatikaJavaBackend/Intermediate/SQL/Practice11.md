#1
List all "first_name" values inside both tables "actor" and "customer"
```
SELECT first_name
FROM actor
UNION
SELECT first_name
FROM customer;
```

#2
List intersecting values on "first_name" files on tables "actor" and "customer"
```
SELECT first_name
FROM actor
INTERSECT
SELECT first_name
FROM customer;
```

#3
List "first_name" values that only exist in table "actor" but not "customer"
```
SELECT first_name
FROM actor
EXCEPT
SELECT first_name
FROM customer;
```

#4
Repeat the first 3 queries but include repeating results.
```
SELECT first_name
FROM actor
UNION ALL
SELECT first_name
FROM customer;
/*-----------------*/
SELECT first_name
FROM actor
INTERSECT ALL
SELECT first_name
FROM customer;
/*-----------------*/
SELECT first_name
FROM actor
EXCEPT ALL
SELECT first_name
FROM customer;
```