FROM amd64/openjdk:11
ADD target/sampleDockerComposeExample-0.0.1-SNAPSHOT.jar  sampleDockerComposeExample-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java -jar sampleDockerComposeExample-0.0.1-SNAPSHOT.jar
