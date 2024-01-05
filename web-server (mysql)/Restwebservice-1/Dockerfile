# Use the official OpenJDK 17 image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/springboot-mysql-docker.jar /app/springboot-mysql-docker.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "springboot-mysql-docker.jar"]