
#1.
Get all values inside "film" table where replacement cost is bigger or equal to 12.99 and smaller than 16.99, use BETWEEN - AND operator
```
SELECT *
FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;
```
#2.
Get first\_name and last\_name values in actor table where first_name is either "Penelope", "Nick" or "Ed"
```
SELECT first_name, last_name
FROM actor
WHERE first_name IN ('Penelope', 'Nick", 'Ed');
```
(Don't use double quotes for string types.)

#3.
Get all values in film table where rental\_rate is 0.99 or 2.99 or 4.99 and replacement\_cost is 12.99 or 15.99 or 28.99
```
SELECT *
FROM film
WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99);
```	
