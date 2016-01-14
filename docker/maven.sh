#!/bin/bash -eu

# install JAR in the .m2 local repository
mvn install -DskipTests

# test OK because of commons-1.0-SNAPSHOT.jar available in the classpath
mvn clean test
