SELECT
   * 
FROM
   (
      SELECT
         city,
         CHAR_LENGTH(city) 
      FROM
         station 
      ORDER BY
         CHAR_LENGTH(city) ASC,
         city LIMIT 1
   )t1 
UNION ALL
SELECT
   * 
FROM
   (
      SELECT
         city,
         CHAR_LENGTH(city) 
      FROM
         station 
      ORDER BY
         CHAR_LENGTH(city) DESC,
         city LIMIT 1
   )t2;
