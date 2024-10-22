# Write your MySQL query statement below
select round(
        (select count(*)
        from activity a1
        join (
            select a2.player_id, min(a2.event_date) as min_event_date
            from activity a2
            group by a2.player_id
        ) as minA
        on a1.player_id = minA.player_id 
            and datediff(a1.event_date, minA.min_event_date)=1
        )
    / count(distinct player_id)
, 2) as fraction
from activity