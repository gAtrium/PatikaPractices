#1
Group the films in the table "film" by it's rating

```
SELECT COUNT(*), rating
FROM film
GROUP BY rating;
```

#2
Print the "replacement_cost" values bigger than 50 and the amount of films with it after grouping it by "replacement_cost" in table "film"
```
SELECT replacement_cost, COUNT(*)
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;
```

#3
What are the amounts of "customer" entries for each "store_id" value inside table "customer"?
```
SELECT store_id,COUNT(*)
FROM customer
GROUP BY store_id;
```

#4
After grouping the values by country_id in table "city" print the country_id that has the biggest value;
```
SELECT country_id, COUNT(*)
FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
```
