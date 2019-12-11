FROM openjdk:11.0.5-jre
COPY target/wiremock-on-docker-1.0-SNAPSHOT-jar-with-dependencies.jar /app.jar
CMD ["java", "-jar", "/app.jar"]