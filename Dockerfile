FROM eclipse-temurin:21@sha256:2d101f7d06beedb058a34ddd75a8da0784c998d584d1ef78471dd8294bd9a77c

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
