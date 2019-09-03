# XCommerce Microservices - Spring
This is the core module of the enterprise-class XCommerce application based on the microservices architecture. It is written in Java and leverages Spring Boot as a highly productive, opinionated enterprise application development and production environment. Spring Boot augmented with Spring Cloud orchestrates several technologies powering XCommerce Microservices, namely JPA (on top of Hibernare and MySQL), MongoDB, Redis, Neo4j, Netty and REST.

The overarching XCommerce project is accessible here: https://github.com/oiraqi/xcommerce. Other sibiling sub-projects are:
- XCommerce Web JSF: https://github.com/oiraqi/xcommerce-monolithic
- XCommerce Web JSF: https://github.com/oiraqi/xcommerce-web-jsf
- XCommerce Web Django: https://github.com/oiraqi/xcommerce-web-django
- XCommerce Web Node/Express: https://github.com/oiraqi/xcommerce-web-node
- XCommerce PWA Angular: https://github.com/oiraqi/xcommerce-web-angular

**You're welcome to contrbute through your favourite monolithic, microservices and/or front-end technology!**

**The *progress* folder**: In every semester, the author rewrites the code with his students. The *progress* folder reflects where they are now. It is reinitialized in the beginning of each Fall (September 1st) and Spring (January 1st).

**Staring point**
- Clone this repository
- Depending on the stage you would like to work on, cd [ *initial* | *progress* | *final* ]
- Depending on the microservice you would like to work on, cd [ *catalog* | *order* | *customer* ]
- ./gradlew build
- There you go!
