FROM maven:3.8.2-jdk-17

WORKDIR /suinsias
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run
