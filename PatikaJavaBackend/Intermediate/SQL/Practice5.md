#1
List longest 5 films from table "film" where title ends with 'n'
```
SELECT *
FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;
```

#2
List 5 shortest films from table "film" where title ends with 'n' with an offset of five.
```
SELECT *
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
OFFSET 5
LIMIT 5;
```

#3
List all values inside first 4 rows in customer table where store_id is 1 in a descending order in relation to last_name
```
SELECT *
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 5;
```