# Write your MySQL query statement below
select employee_id, name, (
    select count(*)
    from employees e2
    where e2.reports_to = e1.employee_id
) as reports_count ,
(
    select round(avg(e2.age))
    from employees e2
    where e2.reports_to = e1.employee_id
) as average_age 
from employees e1
where employee_id in (select reports_to from employees where reports_to is not null)
order by employee_id