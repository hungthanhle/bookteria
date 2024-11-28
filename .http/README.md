```
hung@hung:~$ docker pull neo4j:latest

hung@hung:~$ docker run --publish=7474:7474 --publish=7687:7687 -e 'NEO4J_AUTH=neo4j/12345678' neo4j:latest

http://localhost:7474/

@EnableFeignClients
IdentityServiceApplication

@FeignClient(name = "profile-service", url = "http://locahost:8081/profile")
interface ProfileClient

inject => ProfileClient profileClient;
profileClient.createProfile();

Spring Cloud Gateway: khai báo route - uri

Giới hạn gateway call
/profile/internal/users không thỏa mãn: /profile/users/**
```
