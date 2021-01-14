FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD target/phonebook.jar phonebook.jar
ENTRYPOINT ["java","-jar","/phonebook.jar"]