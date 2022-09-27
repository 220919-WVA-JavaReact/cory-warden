SELECT * FROM crime_scene_report WHERE date = 20180115 AND city = 'SQL City';
-- Retrieve annabel from franklin and 1 on northwestern dr at last house
SELECT * FROM person
WHERE address_street_name = 'Northwestern Dr' ORDER BY address_number; 
-- id	name	license_id	address_number	address_street_name	ssn
--14887	Morty Schapiro	118009	4919	Northwestern Dr	111564949

--id	age	height	eye_color	hair_color	gender	plate_number	car_make	car_model
--118009	64	84	blue	white	male	00NU00	Mercedes-Benz	E-Class

--id	person_id	name	membership_start_date	membership_status
--Morty does not have membership to get_fit_now_member

--person_id	event_id	event_name	date
--14887	4719	The Funky Grooves Tour	20180115

--person_id	transcript
--14887	I heard a gunshot and then saw a man run out. He had a "Get Fit Now Gym" bag. 
--The membership number on the bag started with "48Z". Only gold members have those bags. 
--The man got into a car with a plate that included "H42W".

SELECT * FROM person
WHERE address_street_name = 'Franklin Ave';
-- id	name	license_id	address_number	address_street_name	ssn
--16371	Annabel Miller	490173	103	Franklin Ave	318771143

--id	age	height	eye_color	hair_color	gender	plate_number	car_make	car_model
--490173	35	65	green	brown	female	23AM98	Toyota	Yaris

--id	person_id	name	membership_start_date	membership_status
--90081	16371	Annabel Miller	20160208	gold

--membership_id	check_in_date	check_in_time	check_out_time
--90081	20180109	1600	1700

--person_id	event_id	event_name	date
--16371	4719	The Funky Grooves Tour	20180115

--person_id	transcript
--16371	I saw the murder happen, and I recognized the killer from my gym when I was working out last week on 
--January the 9th


--members with membership_status = 'gold' AND id LIKE '48Z%';
--id	person_id	name	membership_start_date	membership_status
--48Z7A	28819	Joe Germuska	20160305	gold
--48Z55	67318	Jeremy Bowers	20160101	gold

--id	name	license_id	address_number	address_street_name	ssn
--28819	Joe Germuska	173289	111	Fisk Rd	138909730
--67318	Jeremy Bowers	423327	530	Washington Pl, Apt 3A	871539279

--id	age	height	eye_color	hair_color	gender	plate_number	car_make	car_model
--Joe Germuska does not have DL
--423327	30	70	brown	brown	male	0H42W2	Chevrolet	Spark LS -----Jeremy Bowers

--value
--Congrats, you found the murderer! But wait, there's more... 
--If you think you're up for a challenge, try querying the interview transcript of the murderer to find the real villain 
--behind this crime. If you feel especially confident in your SQL skills, try to complete this final step 
--with no more than 2 queries. Use this same INSERT statement with your new suspect to check your answer.

--Jeremy's transcript
--person_id	transcript
--67318	I was hired by a woman with a lot of money. I don't know her name but 
--I know she's around 5'5" (65") or 5'7" (67"). She has red hair and she drives a Tesla Model S. 
--I know that she attended the SQL Symphony Concert 3 times in December 2017.

--searching by SELECT * FROM drivers_license WHERE car_make = 'Tesla' AND car_model = 'Model S';
--id	age	height	eye_color	hair_color	gender	plate_number	car_make	car_model
--202298	68	66	green	red	female	500123	Tesla	Model S - Miranda Priestly
--291182	65	66	blue	red	female	08CM64	Tesla	Model S - Regina George
--918773	48	65	black	red	female	917UU3	Tesla	Model S - Red Korb

--searching for person by SELECT * FROM person WHERE license_id = {id above}; Marked names above for correlation.
--id	name	license_id	address_number	address_street_name	ssn
--99716	Miranda Priestly	202298	1883	Golden Ave	987756388
--90700	Regina George	291182	332	Maple Ave	337169072
--78881	Red Korb	918773	107	Camerata Dr	961388910

--SELECT * FROM facebook_event_checkin WHERE person_id = 99716;
--checking names against facebook checkin, only Miranda had data return with 3x SQL Symphony Concert
