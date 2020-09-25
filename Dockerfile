FROM openjdk:8-jdk
WORKDIR /root/anthony-barretti
COPY ./ /root/anthony-barretti

RUN ./gradlew --no-daemon clean build installShadowDist -x test

EXPOSE 8080
ENTRYPOINT java -jar build/install/AnthonyBarretti-shadow/lib/AnthonyBarretti-1.0-SNAPSHOT-all.jar server config/config.yml
