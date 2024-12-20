WITH RECURSIVE HOUR_LIST (HOUR) AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM HOUR_LIST
    WHERE HOUR < 23
)

SELECT T1.HOUR, COALESCE(T2.CNT, 0) as cnt
FROM HOUR_LIST T1
LEFT JOIN (
    SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS CNT
    FROM ANIMAL_OUTS
    GROUP BY HOUR(DATETIME)
) T2
ON T1.HOUR = T2.HOUR
ORDER BY T1.HOUR