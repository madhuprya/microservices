FROM openjdk:11.0-jdk
ADD ./target/MuzixTrack-0.0.1-SNAPSHOT.jar /muzix/app/MuzixTrack-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "MuzixTrack-0.0.1-SNAPSHOT.jar"]

