FROM eclipse-temurin:21

COPY target/demo-app.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "demo-app.jar"]
