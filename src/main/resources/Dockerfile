# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Add Maven to the container and set it up
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

# Copy the rest of the application code to the container
COPY src ./src

# Package the application
RUN ./mvnw clean package -DskipTests

# Run the application
ENTRYPOINT ["java","-jar","target/authentication-server.jar"]

# Expose the port the app runs on
EXPOSE 8080