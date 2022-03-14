FROM openjdk:8u151-jre-slim
ADD  ./target/monitor-0.0.1-SNAPSHOT.jar monitor.jar
ENTRYPOINT ["java", "-jar", "/monitor.jar"]