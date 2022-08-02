#1
Create a table named "Employee" with id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) columns in "test" database

```
/*Create our imaginary "test" database and switch to it*/
CREATE DATABASE test;
\c test;
CREATE TABLE Employee (
    id INT,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
```

#2
Insert 50 entries inside the newly created table
```
insert into Employee (id, name, birthday, email) values (1, 'Kimbra Dougary', '11/17/1978', 'kdougary0@businessweek.com');
insert into Employee (id, name, birthday, email) values (2, 'Leeland Rockwell', '4/19/1984', 'lrockwell1@washington.edu');
insert into Employee (id, name, birthday, email) values (3, 'Gertrudis Filewood', '9/5/1987', 'gfilewood2@imgur.com');
insert into Employee (id, name, birthday, email) values (4, 'Odessa Dakhno', '1/25/1977', 'odakhno3@tumblr.com');
insert into Employee (id, name, birthday, email) values (5, 'Marja Sneezem', '3/18/1995', 'msneezem4@columbia.edu');
insert into Employee (id, name, birthday, email) values (6, 'Ewen Sorey', '8/29/1966', 'esorey5@macromedia.com');
insert into Employee (id, name, birthday, email) values (7, 'Jocelyne Duplock', '4/12/1981', 'jduplock6@eventbrite.com');
insert into Employee (id, name, birthday, email) values (8, 'Tracie Scardafield', '12/1/1988', 'tscardafield7@i2i.jp');
insert into Employee (id, name, birthday, email) values (9, 'Padget Cossington', '10/23/1989', 'pcossington8@google.es');
insert into Employee (id, name, birthday, email) values (10, 'Rochelle Zamorrano', '12/1/1977', 'rzamorrano9@indiatimes.com');
insert into Employee (id, name, birthday, email) values (11, 'Farlay Petre', '8/22/1964', 'fpetrea@statcounter.com');
insert into Employee (id, name, birthday, email) values (12, 'Sunshine Arnoult', '3/18/1994', 'sarnoultb@desdev.cn');
insert into Employee (id, name, birthday, email) values (13, 'Denni Dabs', '12/2/1991', 'ddabsc@spiegel.de');
insert into Employee (id, name, birthday, email) values (14, 'Nalani Crosetto', '10/13/1961', 'ncrosettod@guardian.co.uk');
insert into Employee (id, name, birthday, email) values (15, 'Madlin Trubshawe', '3/15/2000', 'mtrubshawee@lulu.com');
insert into Employee (id, name, birthday, email) values (16, 'Reina Faithfull', '12/6/1962', 'rfaithfullf@devhub.com');
insert into Employee (id, name, birthday, email) values (17, 'Jobye Axcel', '6/29/1995', 'jaxcelg@surveymonkey.com');
insert into Employee (id, name, birthday, email) values (18, 'Felix Lackemann', '8/28/1980', 'flackemannh@live.com');
insert into Employee (id, name, birthday, email) values (19, 'Erik Dohr', '11/15/1995', 'edohri@wp.com');
insert into Employee (id, name, birthday, email) values (20, 'Addie Hannaby', '6/16/1963', 'ahannabyj@oracle.com');
insert into Employee (id, name, birthday, email) values (21, 'Fanni Lednor', '9/27/1982', 'flednork@chron.com');
insert into Employee (id, name, birthday, email) values (22, 'Marleen Linstead', '9/1/2000', 'mlinsteadl@mapy.cz');
insert into Employee (id, name, birthday, email) values (23, 'Tedman Waliszek', '6/8/1972', 'twaliszekm@sciencedaily.com');
insert into Employee (id, name, birthday, email) values (24, 'Daniela Shimmings', '3/16/2003', 'dshimmingsn@netlog.com');
insert into Employee (id, name, birthday, email) values (25, 'Clarine Ravens', '12/2/1993', 'cravenso@theguardian.com');
insert into Employee (id, name, birthday, email) values (26, 'Thorvald Iddison', '12/15/1975', 'tiddisonp@1688.com');
insert into Employee (id, name, birthday, email) values (27, 'Cosetta Budden', '6/23/2002', 'cbuddenq@wp.com');
insert into Employee (id, name, birthday, email) values (28, 'Kirstin Newburn', '8/28/2004', 'knewburnr@gov.uk');
insert into Employee (id, name, birthday, email) values (29, 'Stanfield Bottinelli', '8/15/1976', 'sbottinellis@goodreads.com');
insert into Employee (id, name, birthday, email) values (30, 'Lonna Beecraft', '7/11/2000', 'lbeecraftt@tripadvisor.com');
insert into Employee (id, name, birthday, email) values (31, 'Jacky Flewitt', '4/17/1995', 'jflewittu@simplemachines.org');
insert into Employee (id, name, birthday, email) values (32, 'Aldon Bing', '8/1/1971', 'abingv@pagesperso-orange.fr');
insert into Employee (id, name, birthday, email) values (33, 'Kristen Dowey', '12/5/1983', 'kdoweyw@qq.com');
insert into Employee (id, name, birthday, email) values (34, 'Kimmi Shelbourne', '10/30/1996', 'kshelbournex@360.cn');
insert into Employee (id, name, birthday, email) values (35, 'Cole Craddock', '7/24/1991', 'ccraddocky@youtu.be');
insert into Employee (id, name, birthday, email) values (36, 'Charis Lauxmann', '6/13/2006', 'clauxmannz@nbcnews.com');
insert into Employee (id, name, birthday, email) values (37, 'Brett Jorcke', '4/11/1980', 'bjorcke10@facebook.com');
insert into Employee (id, name, birthday, email) values (38, 'Garwood Tankin', '5/3/2006', 'gtankin11@soundcloud.com');
insert into Employee (id, name, birthday, email) values (39, 'Ulla Castelijn', '3/19/2001', 'ucastelijn12@tumblr.com');
insert into Employee (id, name, birthday, email) values (40, 'Petey Crunkhorn', '10/22/2001', 'pcrunkhorn13@oaic.gov.au');
insert into Employee (id, name, birthday, email) values (41, 'Lonnie Kermath', '6/17/1983', 'lkermath14@networkadvertising.org');
insert into Employee (id, name, birthday, email) values (42, 'Helen-elizabeth Wibberley', '1/18/1990', 'hwibberley15@dedecms.com');
insert into Employee (id, name, birthday, email) values (43, 'Killy Mantione', '4/16/1992', 'kmantione16@baidu.com');
insert into Employee (id, name, birthday, email) values (44, 'Mirabel Rraundl', '5/9/1985', 'mrraundl17@bing.com');
insert into Employee (id, name, birthday, email) values (45, 'Ursa D''Ambrogi', '1/29/1966', 'udambrogi18@mashable.com');
insert into Employee (id, name, birthday, email) values (46, 'Glendon Beane', '9/13/1989', 'gbeane19@foxnews.com');
insert into Employee (id, name, birthday, email) values (47, 'Shay Biggerstaff', '8/22/2001', 'sbiggerstaff1a@jalbum.net');
insert into Employee (id, name, birthday, email) values (48, 'Wilmar Davey', '8/9/2000', 'wdavey1b@issuu.com');
insert into Employee (id, name, birthday, email) values (49, 'Constance Matthewman', '6/21/1989', 'cmatthewman1c@disqus.com');
insert into Employee (id, name, birthday, email) values (50, 'Lindsey Flippen', '8/9/1991', 'lflippen1d@paypal.com');
```

#3
Do five UPDATE operations that updates other columns based on one.
```
UPDATE Employee
SET name = 'Gabe Newell',
    birthday = '3/11/1962',
    email = 'gaben@valvesoftware.com'
WHERE id = 1;
/*-----------------------------------------------*/
BEGIN;
UPDATE Employee
SET name = 'I did a bit of trolling',
    email = 'le trole';
ROLLBACK; /*Revert the trolling*/
/*-----------------------------------------------*/
UPDATE Employee
SET name = 'Mr. Smith'
WHERE email = 'clauxmannz@nbcnews.com';
/*-----------------------------------------------*/
UPDATE Employee
SET name = 'Mr. Andreson',
    email = ' ',
    birthday = '1/1/0' /*He's Jesus*/
WHERE id = 45;
/*-----------------------------------------------*/
UPDATE Employee
SET name = 'asian'
WHERE email LIKE '%cn' OR email LIKE '%jp' OR email LIKE '%hk' OR email LIKE '%kr' OR email LIKE '%tw' OR email LIKE '%ph';
```

#4
Do five DELETE operations that deletes rows based on one column.

```
DELETE FROM Employee
WHERE name = 'asian'; /*racism*/
/*-----------------------------------------------*/
DELETE FROM Employee
WHERE MOD(id, 2) = 1; /*Half the db, MOD is %*/
/*-----------------------------------------------*/
DELETE FROM Employee
WHERE id = 2; /*I can't find anything to delete*/
/*-----------------------------------------------*/
DELETE FROM Employee
WHERE date_part('year', birthday) > 2000; /*Why is this function snake_case*/
/*-----------------------------------------------*/
DELETE FROM Employee
WHERE MOD(id,2) = 0 AND email ILIKE '%fr'; /*french*/

```