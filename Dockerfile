FROM eclipse-temurin:21-jre
EXPOSE 8080
ADD target/ci-cd-springboot-docker.jar ci-cd-springboot-docker.jar
ENTRYPOINT ["java", "-jar", "/ci-cd-springboot-docker.jar"]