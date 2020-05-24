# springboot-java-docker
1. SpringBoot
2. Java 11
3. Run's on Https
4. Running on Docker

### How to Run in Local 
##### One : Individual Commands
````$xslt

Step 1: Create the Docker Image
    $ docker build -f Dockerfile -t springboot-java-docker .
    
Step 2 : Check whether the Docker Image Created or Not.
    $ docker images
    
Step 3: Run Docker Image by specifying port (might be different or same, your wish)
    $ docker run -p 8085:8082 springboot-java-docker
    
````
##### Two : Run with bash file (docker-build.sh)
```$xslt
$ ./docker-build.sh
```



### Get End_Point
```
Method : GET 
URL : https://localhost:8085/employee/001
    : https://localhost:8085/employee/002
    : https://localhost:8085/employee/003
    : https://localhost:8085/employee/004
    
```

### Useful Docker commands
1. $ docker images                    // to display list of docker images 
2. $ docker rm  $(docker ps -q -a)    // to execute below command, first remove the lock between docker images
3. $ docker image rm <IMAGE ID>       // to delete any docker image
