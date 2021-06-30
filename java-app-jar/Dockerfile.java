FROM maven:3.6.3-jdk-8-openj9

ADD ./java-app/target/my-app-1.0-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "app.jar"]

# docker build -t java-app -f Dockerfile.java .
# docker run java-app
# Hello World!

