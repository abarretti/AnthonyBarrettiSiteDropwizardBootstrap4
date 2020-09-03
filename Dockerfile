FROM alpine
WORKDIR /root/anthony-barretti
COPY src/main/java/AnthonyBarrettiApplication.java /root/anthony-barretti

RUN apk add openjdk11
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

RUN javac src/main/java/AnthonyBarrettiApplication.java

ENTRYPOINT java /src/main/java/AnthonyBarrettiApplication
