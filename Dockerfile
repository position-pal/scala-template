FROM eclipse-temurin:25@sha256:e0143c01b14e3bcece2c6cd003d676b9d934dd0adec0712475d87c207e491629

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
