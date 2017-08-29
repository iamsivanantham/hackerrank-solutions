SELECT DISTINCT
   city 
FROM
   station 
WHERE
   city regexp '^[^aeiou](.*)[^aeiou]$';
