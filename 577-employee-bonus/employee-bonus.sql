# Write your MySQL query statement below
select employee.name, bonus.bonus
from employee
left join bonus
on bonus.empId = employee.empId
where bonus.bonus < 1000 or bonus.bonus is null;