FROM eclipse-temurin:25@sha256:2ed7aff176420e609546a76378a7dc0f33ddff5b0f9b842d6acc89ce9126d337

WORKDIR /app

COPY ./entrypoint/build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
