FROM 100.125.5.235:20202/cpe/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/

COPY target/*.jar app.jar

RUN sh -c 'touch app.jar'

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]
