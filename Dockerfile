FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim AS runtime
COPY --from=build /target/Sb-1.jar bankapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bankapp.jar"]

