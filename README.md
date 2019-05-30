# spring-war-contexts

Issue repository. More at: https://stackoverflow.com/questions/55259383/spring-boot-tries-to-run-an-embedded-tomcat-when-deployed-as-traditional-war

Build the project
```
mvn clean install
```

Run the application using docker
```
cd docker
docker-compose up
```
Receive an error:
```
Caused by: java.lang.ClassNotFoundException: org.springframework.boot.web.embedded.tomcat.TomcatEmbeddedWebappClassLoader
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:471)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:588)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:315)
  ...
```
