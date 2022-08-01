#1.
List "title" and "description" columns inside the table "film"
```
SELECT title, description
FROM film;
```

#2.
List all columns inside film table where film length is bigger than 60 and smaller than 75
```
SELECT *
FROM film
WHERE length > 60 AND length < 75;
```

#3.
List all columns inside film table where rental_rate is 0.99 and replacement_cost is 12.99 or 28.99
```
SELECT *
FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99)
```

#4.
What is the last_name value of a row which has "Mary" as it's first_name value inside "customer" table?

```
SELECT last_name
FROM customer
WHERE first_name = "Mary";
```
#5.
List all columns inside film table where rental_rate isn't 2.99 or 4.99 and length is over 50
```
SELECT *
FROM film
WHERE NOT length > 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);
```
