# XCommerce Microservices - Spring Cloud
This is the core module of the enterprise-class XCommerce application based on the microservices architecture. It is written in Java and leverages Spring Boot as a highly productive, opinionated enterprise application development and production environment. Spring Boot augmented with Spring Cloud orchestrates several technologies powering XCommerce Microservices, namely JPA (on top of Hibernare and PostgreSQL), MongoDB, Redis, Neo4j, Netty and REST.

This is part of the overarching [XCommerce](https://github.com/oiraqi/xcommerce) project. Other sibiling sub-projects are:
- [XCommerce Standalone (C)](https://github.com/oiraqi/xcommerce-standalone-c)
- [XCommerce SOA Monolithic (Spring Boot)](https://github.com/oiraqi/xcommerce-monolithic)
- [XCommerce PWA (Angular)](https://github.com/oiraqi/xcommerce-client-angular)

**You're welcome to contrbute through your favourite monolithic or microservices back-end technology and/or front-end technology!**

**The *progress* folder**: In every semester, the author rewrites the code with his students. The *progress* folder reflects where they are now. It is reinitialized in the beginning of each Fall (September 1st) and Spring (January 1st).

**Staring point**
- Clone this repository
- Depending on the stage you would like to work on, cd [ *initial* | *progress* | *final* ]
- Depending on the microservice you would like to work on, cd [ *catalog* | *order* | *customer* ]
- ./gradlew build
- There you go!

**You need**
- Docker installed
- docker pull postgres
- docker pull redis
- docker run --name postgres-container -e POSTGRES_PASSWORD=postgres -d postgres
- Create a database called *xcommerce* on your *postgres-container*
- docker run --name redis-container -d redis
