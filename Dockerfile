FROM openjdk:11
ADD target/*.jar gitlab.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "gitlab.jar"]
