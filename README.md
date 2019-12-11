# Description

The purpose of this project is to show how Wiremock could be used to mock API and run Wiremock in Docker container.

# Compiling

To compile the project, type:

```bash
$ java -jar target/wiremock-on-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
```

# Running

To run the project on your computer, type:

```bash
$ java -jar target/wiremock-on-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
```

To run the project on Docker, type:

```bash
$ docker build . -t wiremock-on-docker
$ docker run -p 8089:8089 -it wiremock-on-docker
```

# Testing
To test the project, type:

```bash
$ curl localhost:8089/api/name
```