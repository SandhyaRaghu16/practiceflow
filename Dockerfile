FROM eclipse-temurin:17
COPY target/practiceflow.jar practiceflow.jar
CMD ["java","-jar","practiceflow.jar"]