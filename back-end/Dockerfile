# Étape 1 : Construire l'application
FROM maven:3.8.8-eclipse-temurin-17 AS build
WORKDIR /app


COPY ./back-end/pom.xml .
COPY ./back-end/src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 9090
CMD ["java", "-jar", "app.jar"]

