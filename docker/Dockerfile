FROM maven:3.3.3-jdk-7

COPY maven.sh  /usr/share/maven/jcabi-ajc-classpath-issue.sh
RUN chmod u+x  /usr/share/maven/jcabi-ajc-classpath-issue.sh

COPY maven-with-PR42.sh  /usr/share/maven/jcabi-fix42.sh
RUN chmod u+x  /usr/share/maven/jcabi-fix42.sh
