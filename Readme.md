
# JWT Authentication Project with Spring Security

## Project Description

This project is an authentication system using Spring Security that enables user authentication through predefined static values.

Access the system at: [http://localhost:8081/home/user](http://localhost:8081/home/user)

---

## Prerequisites

- **JDK 11** or higher
- **Maven** for dependency management
- **Minikube** and **kubectl** for Kubernetes setup

---

## Steps to Set Up the Project

### 1. Clone the Project

First, clone the project from the repository:
```bash
git clone https://github.com/AminDenizer/Auth.git
```

### 2. Configure the `application.properties` File

Enter the following details in the `application.properties` file:
```properties
server.port=8081
spring.security.user.name=Amin
spring.security.user.password=Denizer
```

### 3. Run the Project Locally

Use the following command to run the project:
```bash
mvn spring-boot:run
```

The project will run on port 8081 and will be accessible via the link below:
[http://localhost:8081/home/user](http://localhost:8081/home/user)

---

## Running the Project with Docker

To run the project using Docker, you can use the following image:

[Docker Image Link](https://hub.docker.com/layers/amindenizer/sample-test-auth/latest/images/sha256-d35ec07656008da702334d02efbb2bb15dee7336e9d6e1adeb3f5bf77e4d465e?context=repo)

```bash
docker pull amindenizer/sample-test-auth:latest
docker run -p 8081:8081 amindenizer/sample-test-auth:latest
```

---

## Deploying on Kubernetes with Minikube

Follow these steps to deploy the project on a Kubernetes cluster using Minikube:

1. Start Minikube:
   ```bash
   minikube start
   ```

2. Apply the deployment configuration:
   ```bash
   kubectl apply -f authentication-service-deployment.yaml
   ```

3. Verify that the pods are running:
   ```bash
   kubectl get pods
   ```

4. Check the service details:
   ```bash
   kubectl describe svc authentication-service
   ```

5. Forward the service to access it locally:
   ```bash
   kubectl port-forward svc/authentication-service 8081:80
   ```

The application will now be accessible at:
[http://localhost:8081/home/user](http://localhost:8081/home/user)
