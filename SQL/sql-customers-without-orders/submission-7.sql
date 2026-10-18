-- Write your query below
select c.name 
from customers c 
where c.id NOT IN (
    select o.customer_id
    from orders o
    where o.customer_id IS NOT NULL);