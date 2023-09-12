FROM adoptopenjdk/openjdk11:armv7l-ubuntu-jre-11.0.20.1_1
COPY build/libs/spring_boot_opentelemetry-0.0.1-SNAPSHOT.jar spring-boot-opentelemetry-upstream.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-opentelemetry-upstream.jar"]