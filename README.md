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
```
Method : GET 
URL : http://localhost:8085/employee/001
    : http://localhost:8085/employee/002
    : http://localhost:8085/employee/003
    : http://localhost:8085/employee/001
```


