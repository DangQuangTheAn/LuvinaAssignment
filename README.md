# LuvinaAssignment
1.	STEP 1:
Create 2 schemas tenant1 and tenant2 in Mysql DB then run the following 2 queries one after another to create employee table according to tenant schema.

USE tenant1;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

---------------------------------------------------------------------

USE tenant2;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

2.	STEP 2:
Edit Mysql username and password on personal computer in files allTenants/tenant_1.properties and allTenants/tenant_1.properties

![image](https://github.com/DangQuangTheAn/LuvinaAssignment/assets/32431243/9d387e95-8447-4f6d-afff-10b469ecff55)

3.	STEP 3:
Import the Postman file attached to the folder.

![image](https://github.com/DangQuangTheAn/LuvinaAssignment/assets/32431243/9065ccc0-8889-41ce-b250-0125325ba3a3)

4.	STEP 4: 
Test the feature of retrieving tokens from JWT using basic auth

 ![image](https://github.com/DangQuangTheAn/LuvinaAssignment/assets/32431243/5c9bbad2-c39e-4e02-aa4e-b7262beb1ce7)

5.	STEP 5
After obtaining the token, copy and paste it into the Bearer Token of the Home API

![image](https://github.com/DangQuangTheAn/LuvinaAssignment/assets/32431243/fa3729d9-6c37-4a2d-90f3-17652ceb1c3e)


6.	STEP 6: 
After obtaining the token in step 4, copy and paste it into the Bearer Token of the Save Employee API to test the multitenant feature, edit back and forth between tenant_1 and tenant_2 and see the results.
![image](https://github.com/DangQuangTheAn/LuvinaAssignment/assets/32431243/86a576f9-fcc5-4b9e-989c-4b35d49d4369)

