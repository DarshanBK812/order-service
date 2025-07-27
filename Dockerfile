FROM openjdk:17

EXPOSE 8082

COPY target/order-service.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]