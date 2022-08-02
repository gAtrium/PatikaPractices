#1
Left join both table "city" and "country" showing both "city" and "country" columns.
```
SELECT city.city, country.country
FROM city
LEFT JOIN country
ON city.country_id = country.country_id;
```

#2
Right join both table "customer" and "payment" and show columns "payment_id", "first_name" and "last_name"
```
SELECT payment.payment_id, first_name, last_name
FROM customer
RIGHT JOIN payment
ON payment.customer_id = customer.customer_id;
```

#3
Full join both tables "customer" and "rental" and show columns "rental_id", "first_name" and "last_name"
```
SELECT rental.rental_id, first_name, last_name
FROM customer
FULL JOIN rental
ON customer.customer_id = rental.customer_id;
```
