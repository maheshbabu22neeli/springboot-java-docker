FROM openjdk:11
ADD target/springboot-java-docker.jar springboot-java-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "springboot-java-docker.jar"]