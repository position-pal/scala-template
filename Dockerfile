FROM eclipse-temurin:21@sha256:7c723cbc707da35a2e1e721952c923dcec8a9d5363bfa611b506aff93346427f

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
