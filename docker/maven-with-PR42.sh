#!/bin/bash -eu

# clone the PR branch of jcabi-maven-plugin to test the fix
wget https://github.com/mgreau/jcabi-maven-plugin/archive/ajc-classpath-issue.zip
unzip ajc-classpath-issue.zip -d .
cd jcabi-maven-plugin-ajc-classpath-issue/
mvn install -DskipTests

# test with jcabi-maven-plugin 1.0-SNAPSHOT with fix
cd ..
mvn clean test -Dversion.jcabi.plugin=1.0-SNAPSHOT
