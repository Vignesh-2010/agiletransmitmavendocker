FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar app.jar

CMD ["java", "-cp", "app.jar", "com.example.Server"]