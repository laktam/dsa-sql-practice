# Write your MySQL query statement below
select prices.product_id, 
    ifnull(round(
            sum(Unitssold.units * prices.price) / sum(Unitssold.units)
            ,2
        ) , 0) as average_price 
from prices
left join Unitssold
on prices.product_id = Unitssold.product_id 
    and prices.start_date <= Unitssold.purchase_date
    and prices.end_date >= Unitssold.purchase_date
group by prices.product_id
