FROM openjdk:21

WORKDIR /app

COPY target/game-service-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "game-service-0.0.1-SNAPSHOT.jar"]