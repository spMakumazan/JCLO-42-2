FROM adoptopenjdk/openjdk11

EXPOSE 8080

ADD target/JCLO-42-2-0.0.1-SNAPSHOT.jar jclo422.jar
