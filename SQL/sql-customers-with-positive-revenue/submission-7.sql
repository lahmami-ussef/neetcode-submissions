-- Write your query below
select c.customer_id 
from customers c 
where revenue>0
AND year='2020';
