FROM eclipse-temurin:25@sha256:317010528a5eafaa13a1ea9fa194fae3959c57646306972391bc785cd3acd91b

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
