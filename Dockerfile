FROM eclipse-temurin:25@sha256:5dcda32b9f2cd09e68f512c37d7e2bc0764ef8fe2bf3d271fd2f1f3f8b0db4d5

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
