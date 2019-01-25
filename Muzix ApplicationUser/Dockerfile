FROM openjdk:11.0-jdk
ADD ./target/MuzixUser-0.0.1-SNAPSHOT.jar /muzix/app/MuzixUser-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "MuzixUser-0.0.1-SNAPSHOT.jar"]

