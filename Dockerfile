FROM amazoncorretto:11-alpine-jdk
MAINTAINER montexbjeliseo
COPY "target/arg-servr-0.0.1-SNAPSHOT.jar" "server-app.jar"
EXPOSE 10000
ENTRYPOINT ["java","-jar","server-app.jar"]