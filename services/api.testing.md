## Http Requests 

### Get All
```
curl \
--request GET \
http://localhost:9081/api/students | json_pp 
```

### Get By Id
```
curl \
--request GET \
http://localhost:9081/api/students/1 | json_pp 
```

### Get By Id and Name

```
curl --request GET \
http://localhost:9081/api/students/1/name | json_pp 
```

### Post Request
```
curl --request POST \
  --header "Content-type: application/json" \
  --data '{"name": "New Name", "address": "New Address"}' \
  http://localhost:9081/api/students | json_pp
  
```

### Put Request 

```
curl --request PUT \
  --header "Content-type: application/json" \
  --data '{"id": "1", "name": "Sunil", "address": "Lucknow"}' \
  http://localhost:9081/api/students/1 | json_pp 

curl --request PUT \
  --header "Content-type: application/json" \
  --data '{"id": "1", "name": "Sunil", "address": "Lucknow"}' \
  http://localhost:9081/api/students/1/sunil | json_pp 
```
### Delete Request 

```
curl \
  --header "Content-type: application/json" \
  --request DELETE \
  http://localhost:9081/api/students/1 | json_pp 
```
