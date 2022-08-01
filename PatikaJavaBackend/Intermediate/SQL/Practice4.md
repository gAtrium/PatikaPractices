#1
List distinct values in replacement_cost inside film table
```
SELECT DISTINCT replacement_cost
from film;
```

#2
How many distinct values are there inside the replacement cost column in the film table?
```
SELECT COUNT(DISTINCT replacement_cost)
from film;
```

#3
How many values inside title column in film table start with 'T' and also has a rating of "G"?
```
SELECT COUNT(title)
FROM film
WHERE title LIKE 'T%' AND rating = 'G';
```

#4
How many values inside country column inside country table is exactly five characters?
```
SELECT COUNT(country)
FROM country
WHERE country LIKE '_____';
```

#5
How many values inside country column inside country table ends with 'r?' (case insensitive)
```
SELECT COUNT(country)
FROM country
WHERE country ILIKE '%r';
```
