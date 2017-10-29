docker run -it --rm \
  -e JPDA_ADDRESS=5551\
  -e JPDA_TRANSPORT=dt_socket \
  -p 8888:8080 \
  -p 9000:8000 \
  -v D:/tc/conf/tomcat-users.xml:/usr/local/tomcat/conf/tomcat-users.xml \
  tomcat:8.0 \
  /usr/local/tomcat/bin/catalina.sh jpda run