FROM adoptopenjdk/openjdk11:armv7l-ubuntu-jre-11.0.20.1_1
COPY build/libs/spring_boot_opentelemetry-0.0.1-SNAPSHOT.jar spring-boot-opentelemetry-downstream.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/spring-boot-opentelemetry-downstream.jar"]