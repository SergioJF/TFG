FROM java:8-jre
MAINTAINER Sergio Jimenez <sergiojimenezfemenia90@gmail.com>

ADD ./target/config-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 8888