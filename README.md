# XCommerce Core
This is the core module of the enterprise-class XCommerce application. It is written in Java and leverages Spring Boot as an excellent (opinionated) enterprise application development and production environment. Spring Boot orchestrates in an elegant and highly productive manner several technologies adopted by XCommerce Core, namely JPA (on top of Hibernare and MySQL), MongoDB, Redis and REST.

**Before You Start**
- Make sure you have a recent version of Docker (docker.io)
- Download the Dockerfile published here
- Use it to build the corresponding Docker Ubuntu-based image
- Run a Docker container based on your newly built Docker image
- From within your Docker container, clone this Git repository
- cd *initial*
- ./gradlew build
- There you go!
