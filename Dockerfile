FROM eclipse-temurin:17-jre-alpine

LABEL maintainer="samgmi1891@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/portfolio-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} portfolio-sangmi.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/portfolio-sangmi.jar"]