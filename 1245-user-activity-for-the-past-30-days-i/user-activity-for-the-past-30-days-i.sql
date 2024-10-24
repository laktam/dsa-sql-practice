# Write your MySQL query statement below
select  activity_date as `day`, count(distinct user_id) as active_users 
from activity
group by activity_date
having year(activity_date) = 2019 and (
    (day(activity_date) >= 28 and month(activity_date) = 6) 
    or (day(activity_date) <= 27 and month(activity_date) = 7)
    )
     