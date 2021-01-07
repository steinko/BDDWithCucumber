FROM openjdk:15
COPY ./build/libs/BDDWithCucumber.jar ./
ENTRYPOINT ["java"]
CMD ["-jar", "/BDDWithCucumber.jar","-Dagentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000"]
EXPOSE 8080