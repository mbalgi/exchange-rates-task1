FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/exchange-rates-task1*.jar exchange-rates-task1.jar
CMD java ${JAVA_OPTS} -jar exchange-rates-task1.jar