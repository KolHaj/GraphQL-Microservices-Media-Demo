# GraphQL Microservices for Media

The application has a main GraphQL java service that holds the media service which allows the user to interact with a GraphQL UI on local.
The user then will need to start the three other microservices which are book, movie, and television. The four microservices interact using 
webClient and Rest API to pass query and mutation data to the main media service. The four microsservices lastly use MongoDB and OracleSQL to store the
individual data and the database properties are located in individual files.

## Getting Started

The project is built using Java so using any IDE that supports Java will work and can be used to create a .jar files to run in the desktop. 
The application is built on four individual microservices which need to all be running for the correct queries and mutations to pull the data.
The application will also need individual MongoDB and OracleSQL databases setup on the machine to create the data needed for the services. The properties files
in each individual file holds the setup that can be used for quick setup of new Databases and initial settings.

### Prerequisites

Java IDE
MongoDB Database
OracleSQL Database
Oracle SQL Developer - Optional

### Installing

Clone the project into your folder, build the project and run.

## Running the tests

No current unit tests exist, will look into adding in the future.

## Built With

* [Java](https://www.java.com/en/) - Main Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [GraphQL](https://graphql.org/) - Query Language for API
* [OracleSQL](https://www.oracle.com/database/technologies/) - Database
* [MongoDb](https://www.mongodb.com/cloud/atlas2) - Database
* [Spring Boot](https://spring.io/projects/spring-boot) - Backend Framework


## Contributing

Contact me if you would like to contribute.

## Versioning

Version 1.0

## Authors

* **Kolger Hajati** - *Initial work* - [KolHaj](https://github.com/KolHaj)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://www.mit.edu/~amini/LICENSE.md) file for details
