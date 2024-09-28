# Use the official OpenJDK image from the Docker Hub
FROM openjdk:17-jdk-slim

# Copy the JAR file from the target folder into the Docker image
COPY target/d387_sample_code-0.0.2-SNAPSHOT.jar app.jar

EXPOSE 8080

# Define the entry point for the Docker container
ENTRYPOINT ["java", "-jar", "/app.jar"]
