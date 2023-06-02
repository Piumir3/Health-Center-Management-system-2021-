Health Center Management system
Spring boot and MySQL use as technologies for the implementation of this application. In
this project used Thymeleaf as a template for interaction between HTML files and Java Classes.

In source code, there are several

Controller Package
-StudentController
-ResourcesController
-EmployeeController

Model Package
-Student
-Employee
-Resources

Repository Package
-StudentRepository
-EmployeeRepository
-ResourcesRepository

Template folder contains all HTML files show in frontend
-Create_student.html
-Create_resources.html
-edit-student.html
-index.html
-new_employee.html
-resource.html
-staff.html
-student.html
-update_employee.html



application.properties files have all databases details.


spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/studentdb
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.mvc.hindered.filter.enabled=true


