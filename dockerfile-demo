# Use the official OpenJDK 11 image as base
FROM openjdk
# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container at /app
COPY target/docker-file-0.0.1-SNAPSHOT.jar /app/docker-file-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application uses
# EXPOSE 8080

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "docker-file-0.0.1-SNAPSHOT.jar"]
