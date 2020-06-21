FROM openjdk:8-jdk-alpine
FROM moin12345/deocker-test		
USER root
EXPOSE 6090
ADD /sudoers.txt /etc/sudoers
RUN chmod 440 /etc/sudoers
WORKDIR /app
COPY target/demoApp.jar .
ENTRYPOINT [ "java", "-jar", "demoApp.jar" ]
USER moin12345



