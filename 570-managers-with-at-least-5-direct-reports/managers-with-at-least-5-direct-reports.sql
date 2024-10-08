# Write your MySQL query statement below
select employee.name
from employee
right join (
    select managerId
    from Employee
    group by managerId
    having count(managerId) >= 5
) as managers
on managers.managerId = employee.id
where employee.id is not null;

