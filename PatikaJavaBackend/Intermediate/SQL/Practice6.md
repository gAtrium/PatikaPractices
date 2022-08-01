#1
What is the average value of "rental_rate" inside table "film"?
```
SELECT AVG(rental_rate)
FROM film;
```

#2
How many film titles inside table "film" start with the letter 'C'?
```
SELECT COUNT(title)
FROM film
WHERE title LIKE 'C%';
```

#3
What is the maximum length of a film which has rental_rate of 0.99
```
SELECT MAX(length)
FROM film
WHERE rental_rate = 0.99;
```

#4
How many distinct replacement_cost values are there for films that are bigger than 150 in length
```
SELECT COUNT(DISTINCT(replacement_cost))
FROM film
WHERE length > 150;
```