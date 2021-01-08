FROM openjdk:15
ARG JAR_FILE
COPY  ${JAR_FILE} /BDDWithCucumber.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/BDDWithCucumber.jar","-Dagentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000"]
EXPOSE 8080