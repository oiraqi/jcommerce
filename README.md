# XCommerce Core
This is the core module of the enterprise-class XCommerce application. It is written in Java and leverages Spring Boot as a highly productive, opinionated enterprise application development and production environment. Spring Boot orchestrates several technologies adopted by XCommerce Core, namely JPA (on top of Hibernare and MySQL), MongoDB, Redis and REST.

The overarching XCommerce project is accessible here: https://github.com/oiraqi/xcommerce, while sibiling sub-projects are:
- XCommerce Web JSF: https://github.com/oiraqi/xcommerce-web-jsf
- XCommerce Web Django: https://github.com/oiraqi/xcommerce-web-django
- XCommerce Web Node/Express: https://github.com/oiraqi/xcommerce-web-node
- XCommerce PWA Angular: https://github.com/oiraqi/xcommerce-pwa-angular

In every new class, the author rewrites the code with his students. The *progress* folder reflects where they are now. It will be reinitialized by the end of the current class.

**Before You Start**
- Make sure you have a recent version of Docker (docker.io)
- Download the Dockerfile published here
- Use it to build the corresponding Docker Ubuntu-based image
- Run a Docker container based on your newly built Docker image
- From within your Docker container, clone this Git repository
- cd *initial*
- ./gradlew build
- There you go!
