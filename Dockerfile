FROM eclipse-temurin:25@sha256:3ab7fc8d0b4ade8fef96903fb36767c1dbb4fd1535dcfad85b59c17afbbb5857

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
