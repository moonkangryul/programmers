-- 코드를 입력하세요
SELECT 
year(a1.sales_date) as year,
month(a1.sales_date) as month,
a2.gender,
count(distinct(a1.user_id)) as users
from online_sale a1 
left join user_info a2 
on a1.user_id = a2.user_id 
where a2.gender is not null
group by year(a1.sales_date), month(a1.sales_date), a2.gender