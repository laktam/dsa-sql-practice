# Write your MySQL query statement below
select query_name, 
    round(
        sum(rating / queries.position) / count(*)
    ,2) as quality, 
    round(
        COUNT(CASE WHEN rating < 3 THEN 1 END) * 100 / 
        count(*)
    ,2) as poor_query_percentage
from queries  
where query_name is not null
group by query_name;