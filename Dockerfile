FROM openjdk:17-jre-slim

WORKDIR /app

ARG JAR_FILE=target/football-microservice.jar
COPY ${JAR_FILE} app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]
