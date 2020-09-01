# Pet Clinic

CRUD application that provides a scheduling interface for a small business that takes care of animals. The app allows users to create pets, owners, and employees, and then schedule events for employees to provide services for pets. This project is an implementation based on the original Spring Pet Clinic project and uses its resources for the front-end part of the project.

# Running the application using IntelliJ

## Prerequisites:

The following items should be installed in your system:
* Java 14
* git command line tool
* IntelliJ

## Steps:

1) On the command line
   ```
   git clone https://github.com/effr2/sfg-pet-clinic.git
   ```
2) Inside IntelliJ IDEA In the main menu, choose File -> Open and select the parent directory. Click on the Open button.

3) Navigate to Petclinic
   Visit http://localhost:8080 in your browser.

## Database configuration

Currently this app is using an in-memory database (H2) which gets populated at startup with data. The h2 console is 
automatically exposed at `http://localhost:8080/h2-console`and it is possible to inspect the content of the database 
using the `jdbc:h2:mem:testdb` 
