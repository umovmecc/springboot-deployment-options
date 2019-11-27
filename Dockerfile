FROM openjdk:11-jre-slim

WORKDIR /app
COPY ./build/libs .

EXPOSE 8080

CMD ["java", "-jar", "springbootdeployments-0.0.1-SNAPSHOT.jar" ]
