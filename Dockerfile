
FROM frolvlad/alpine-oraclejdk8:slim
ENV MONGO_URL mongodb://localhost/boot-mongo-docker
EXPOSE 8086
EXPOSE 5551
RUN mkdir -p /app/
ADD build/libs/boot-mongo-docker-0.0.1-SNAPSHOT.jar /app/boot-mongo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,address=5551,server=y,suspend=n", "-jar", "/app/boot-mongo-docker-0.0.1-SNAPSHOT.jar"]
