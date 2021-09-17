FROM openjdk:15
VOLUME /tmp
ADD ./target/springboot-parametrizacion-0.0.1-SNAPSHOT.jar parametrizacion.jar
ENTRYPOINT ["java","-jar","/parametrizacion.jar"]