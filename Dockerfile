FROM openjdk:17-jdk-slim


WORKDIR /app

ARG JAR_FILE=target/players-0.0.1-SNAPSHOT.jar app.jar
COPY ${JAR_FILE} app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]
