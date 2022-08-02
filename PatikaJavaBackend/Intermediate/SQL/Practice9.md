#1
Inner join both table "city" and table "country" by the column "country_id" (I suppose) and show both columns "city" and "country"
```
SELECT city.city, country.country
FROM city
INNER JOIN country
ON city.country_id = country.country_id;
```

#2
Inner join both table "customer" and "payment" by "customer_id" and display it with both columns "first_name" and "last_name" inside table "customer"
```
SELECT first_name, last_name, payment.payment_id
FROM customer
INNER JOIN payment
ON customer.customer_id = payment.customer_id;
```

#3
Inner Join both tables "customer" and "rental" with column "rental_id" and show columns "rental_id" "first_name" and "last_name" in the result
```
SELECT rental.rental_id, first_name, last_name
FROM customer
INNER JOIN rental
ON customer.customer_id = rental.customer_id;
```