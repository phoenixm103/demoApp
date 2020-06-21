FROM openjdk:8-jdk-alpine
EXPOSE 6090
#WORKDIR 
ENTRYPOINT [ "java", "-jar", "target/demoApp.jar" ]
