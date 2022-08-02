#1
Query the amount of films inside table "film" which are bigger than average 
```
SELECT COUNT(title)
FROM film
WHERE length > (
    SELECT AVG(length)
    FROM film
);
```

#2
How many films inside table "film" have the highest "rental_rate" value?
```
SELECT count(title)
FROM film
WHERE rental_rate = (
    SELECT MAX(rental_rate)
    FROM film
);
```

#3
List all movies that has both lowest "rental_rate" and "replacement_cost" values
```
SELECT title
FROM film
WHERE rental_rate = (
    SELECT MIN(rental_rate)
    FROM film
)
AND replacement_cost = (
    SELECT MIN(replacement_cost)
    FROM film
);
```

#4
List all customers inside payment and order it by the most amount of purchases.
```
SELECT "first_name", "last_name"
FROM customer
WHERE customer_id = ANY(
    SELECT customer_id
    FROM payment
    ORDER BY amount ASC
);
```