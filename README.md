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
          or 
    $ docker build .
    
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
`````
1. $ docker images                     // to display list of docker images 
REPOSITORY               TAG                 IMAGE ID            CREATED             SIZE
springboot-java-docker   latest              b4e803f24d10        12 seconds ago      644MB
openjdk                  11                  22b5134fcd55        3 months ago        627MB

2. $ docker ps -a                       // list the running containers
   CONTAINER ID        IMAGE                    COMMAND                  CREATED             STATUS              PORTS                              NAMES
   7fa7e75cbb4e        springboot-java-docker   "java -jar springboo…"   17 seconds ago      Up 16 seconds       8085/tcp, 0.0.0.0:8085->8082/tcp   practical_euler

3. $ docker container kill 7fa7e75cbb4e // kill the container first
   7fa7e75cbb4e
   
4. $ docker rm practical_euler          // remove the container
   practical_e
   
5. $ docker ps -a                       // check once again the container exists or not
   CONTAINER ID        IMAGE               COMMAND             CREATED             STATUS              PORTS               NAMES

6. $ docker images                      // check the images once again
   REPOSITORY               TAG                 IMAGE ID            CREATED             SIZE
   springboot-java-docker   latest              b4e803f24d10        58 seconds ago      644MB
   openjdk                  11                  22b5134fcd55        3 months ago        627MB

7. $ docker rmi image b4e803f24d10      // remove the image
   Untagged: springboot-java-docker:latest
   Deleted: sha256:b4e803f24d10ad42d98cb99437e3c948b8b15501f917a7addeda02fa70b93675
   Deleted: sha256:e3d1bf5cbdd16539ffe4f1a3de484dcd648e402957f4eaaaabe123cc553c23ff
   Deleted: sha256:f4558efbe2b688b3c03af7917ec8d28eac78b4e2cbaa9636f6acd072a80e877e
   Deleted: sha256:a78197391b860773f74dfa106647c3fa14ddb1163e80e7494326161ce7e5894c
   Error: No such image: image
   
8. $ docker images                       // check the images once again
   REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
   openjdk             11                  22b5134fcd55        3 months ago        627MB
`````