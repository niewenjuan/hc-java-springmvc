FROM 100.125.5.235:20202/cpe/openjdk:8u181-jdk-alpine

WORKDIR /home/apps/

COPY target/*.jar app.jar

RUN sh -c 'touch app.jar'

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar -Xmx256m app.jar" ]
