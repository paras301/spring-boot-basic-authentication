FROM openjdk:14-jdk-alpine

COPY build/libs/spring-boot-basic-authentication.jar /spring-boot-basic-authentication.jar

EXPOSE 8080

CMD java -jar /spring-boot-basic-authentication.jar