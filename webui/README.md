# JSF (Prime Faces 7.0) project

mvn install

mvn package liberty:run

or

mvn package liberty:start

or

mvn package // produces war file 

then

mvn liberty:package -Dinclude=runnable // produces the executable jar file

java -jar webui.jar 

then

hit the url at the browser http://localhost:9080/
