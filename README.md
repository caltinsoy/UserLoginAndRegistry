# UserLoginAndRegistry

Simple UserAndRegister project by using Spring Security and Spring Data.

Note :
You can postgre image  that I described below:

- docker pull postgres
- docker run --name {YOUR_CONTAINER_NAME} -e POSTGRES_PASSWORD={YOUR_PASSWORD}  -p 5432:5432 -d postgres
- And then after that docker exec -it  {CONTAINER_ID} bash
- psql -U postgres
- create database {YOUR_DB_NAME};   
- \l  list exist databases
- you need to connect to db by user
- \c {YOUR_DB_NAME}     when you enter you will get a message like "You are now connected to database "test" as user "postgres" "



** Postgres default user postgres so that it s optional,  but you must specify postgres password when you create container.
