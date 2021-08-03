# Xpensetrail
This is an expense tracker project to manage transactions &amp; expenses, I used it to learn Spring Boot - and added a React client.

# Xpensetrail API (Sprint Boot)
A RESTful API created using Java Spring Boot. I have used PostgreSQL as the relational database running in a docker container and JdbcTemplate to interact with it. Apart from this, we have used JSON Web Token (JWT) to add authentication and Bcrypt for passwords encryption on the database. 

# Setup and Installation

1. **Clone the repo from GitHub and cd into the API**
   ```sh
   git clone https://github.com/lerato1ofone/xpensetrail.git
   cd xpensetrail-api
   ```
2. **Run or spin-up PostgreSQL database instance**
   You can use one of the below 2 options:
   - one option is by running a postgres docker container: (reccommended)
     ```sh
     docker container run --name postgresdb -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres
     ```
   - another way is to download postgres from [here](https://www.postgresql.org/download) and install locally on the machine. 
3. **Create the database and it's objects/tables**
   In the root application directory (xpensetrail-api), there is SQL script file (expensetracker_db.sql) available for creating all database objects
   - if using docker (else skip this step), first copy this file to the running container using below command and then exec into the running container:
     ```
     docker container cp xpensetrail_db.sql postgresdb:/
     docker container exec -it postgresdb bash
     ```
   - run the script using psql client:
     ```
     psql -U postgres --file xpensetrail_db.sql
     ```
4. **(Optional) Update database configurations in application.properties**
   
   If your database is hosted at some cloud platform or if you have modified the SQL script file with some different username and password, update the src/main/resources/application.properties file accordingly:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/expensetrackerdb
   spring.datasource.username=expensetracker
   spring.datasource.password=password
   ```
5. **Run the spring boot application**
   ```sh
   ./mvnw spring-boot:run
   ```
   this runs at port 8080 and hence all enpoints can be accessed starting from http://localhost:8080
