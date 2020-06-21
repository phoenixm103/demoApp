FROM openjdk:8-jdk-alpine
EXPOSE 6090
WORKDIR /app
COPY /target/demoApp.jar .
ENTRYPOINT [ "java", "-jar", "demoApp.jar" ]