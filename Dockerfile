FROM maven:3.8.6-sapmachine-11 as builder
WORKDIR /usr/app
COPY . ./
RUN mvn install

FROM amazoncorretto:11
WORKDIR /usr/app
COPY --from=builder /usr/app/target/*.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]