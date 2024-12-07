# Stage 1: Build
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven configuration file and source code
COPY pom.xml .
COPY src ./src

# Build the application and skip tests
RUN mvn clean install -DskipTests

# Stage 2: Run
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8081 for external access
EXPOSE 8081

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
