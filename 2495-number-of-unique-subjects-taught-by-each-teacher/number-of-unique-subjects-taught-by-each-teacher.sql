# Write your MySQL query statement below
select t2.teacher_id, count(distinct t2.subject_id) as cnt
    from teacher t2
    group by t2.teacher_id