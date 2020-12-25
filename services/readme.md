# Opern Liberty project for Jax-RS + JPA(H2 Database)

### run these
```bash
mvn install 
```

### console mode (Hotswap Enabled)

```
mvn package liberty:run
```

### use ctrl+c to exit

### run the server in background

```
mvn liberty:start
```

### stop the server running in background
```
mvn liberty:stop 
```

### creating fat jar(Uberjar)
```
mvn liberty:package -Dinclude=runnable 
```

This will create an executable jar file **services.jar** within the _target_ maven folder. This can be started by executing the following command

### Run the executable jar
```
java -jar target/services.jar
```

To launch the test page, open your browser at the following URL

    http://localhost:9080/index.html

**Note**: 
 change the database settings in server.xml(According to your database values















