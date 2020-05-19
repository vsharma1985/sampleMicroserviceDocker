FROM openjdk:8
ADD target/samplemicroservices.jar samplemicroservices.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","samplemicroservices.jar"]