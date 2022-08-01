#1
List countries inside the country table where value starts with 'A' and ends with 'a'
```
SELECT country
FROM country
WHERE country LIKE 'A%a';
```

#2
List countries inside the country table where value is at least 6 characters and ends with 'a'
```
SELECT country
FROM country
WHERE country LIKE '_____%a';
```

#3
Select names inside the film table where the title contains at least 4 T's (case insensitive)
```
SELECT title
FROM film
WHERE title ILIKE '%t%t%t%t%t%';
```

#4
Get all values inside film table where title starts with 'C' and length is bigger than 90 and rental rate is 2.99
```
SELECT *
FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
```
