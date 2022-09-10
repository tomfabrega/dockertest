FROM openjdk:20-oracle
WORKDIR /
ADD target/dockertest-1.0-SNAPSHOT-shaded.jar test.jar
EXPOSE 8080
CMD java -jar test.jar
