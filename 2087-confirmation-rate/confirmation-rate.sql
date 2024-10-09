# Write your MySQL query statement below
select signups.user_id , 
    round(
        sum(if(confirmations.action = 'confirmed', 1, 0)) /
        count(*) 
    , 2) AS confirmation_rate 
from signups
left join confirmations
on confirmations.user_id = signups.user_id
group by signups.user_id