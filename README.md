# springboot-java-docker

### How to Run in Local
````$xslt
Step 1: Create the Docker Images
    $ docker build -f Dockerfile -t springboot-java-docker .
Step 2 : Check whether the Docker Image Created or Not.
    $ docker images
Step 3: Run Docker Image by specifying port (different or same)
    $ docker run -p 8085:8082 springboot-java-docker
````

### Get End_Point
Method : GET 
URL : http://localhost:8085/employee/001
    : http://localhost:8085/employee/002
    : http://localhost:8085/employee/003
    : http://localhost:8085/employee/001

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

