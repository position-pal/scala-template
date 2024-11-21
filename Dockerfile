FROM openjdk:21-slim

RUN apt-get update && apt-get install -y findutils && rm -rf /var/lib/apt/lists/*

WORKDIR /service
COPY ./ /service

# Set permissions to gradlew
RUN chmod +x gradlew
RUN ./gradlew

CMD ["./gradlew", "run"]
