FROM openjdk:17
EXPOSE 9090
ADD target/spring-product-docker.jar spring-product-docker.jar
ENTRYPOINT [ "java","-jar","/spring-product-docker.jar"]