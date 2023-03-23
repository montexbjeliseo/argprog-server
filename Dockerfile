FROM amazoncorretto:11-alpine-jdk
MAINTAINER montexbjeliseo
COPY "target/arg-servr-0.0.1-SNAPSHOT.jar" "server-app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","server-app.jar"]