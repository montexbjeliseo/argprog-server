FROM openjdk:8-jdk-alpine
COPY "./.target/*.jar" "server-app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","server-app.jar"]