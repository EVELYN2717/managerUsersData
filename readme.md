
# README

depedencies to install

> * Java 11.0.10
> * Apache Maven 3.6.3
> * Spring boot 2.4.2
> * PostgreSQL 4

To deploy and run managerUserData proyect you should type on your terminal:

~~~~
$ git clone https://github.com/EVELYN2717/managerUsersData.git
$ cd managerUsersData
$ mvn clean install
$ mvn spring-boot:run
~~~~

You can find the database script in the follow path /managerUsersData/database/Scripts.sql
Wakeup your local database run this script to create the database and the table.

**Important! set your own password at the properties to build the proyect.** 
