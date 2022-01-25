FROM amd64/openjdk:11
COPY target/userservice-0.0.1-SNAPSHOT.jar  userservice-0.0.1-SNAPSHOT.jar
EXPOSE 8081
CMD java -jar userservice-0.0.1-SNAPSHOT.jar
