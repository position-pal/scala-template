FROM eclipse-temurin:25@sha256:010ab2b79329b951bf052dbf515843ab345ae4e4f0ef72287d85c9fa54da275f

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
