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

https://youtu.be/63qRzV-ojU4?si=jh-8-5623xTdPkuE&t=2837
bỏ qua việc toàn bộ api phải authen tại gateway
instropect một lần rồi
các services khác thì decode -> role

https://youtu.be/HB222xGqDOg?si=djsrQbgw7CpLH4MR&t=997 - global mọi FeignClient -> gọi ra ngoài thì sao ?
=> không dùng Bean @Component nữa
Dùng interceptor apply header => access token

cd web-app/
npm install
npm start
https://stackoverflow.com/questions/39959900/npm-start-error-with-create-react-app/39960523#39960523
./node_modules/react-scripts/bin/react-scripts.js start


hung@hung:~$ sudo systemctl status mongod
[sudo] password for hung: 
○ mongod.service - MongoDB Database Server
     Loaded: loaded (/lib/systemd/system/mongod.service; disabled; vendor prese>
     Active: inactive (dead)
       Docs: https://docs.mongodb.org/manual

hung@hung:~$ sudo systemctl start mongod
hung@hung:~$ sudo systemctl status mongod
● mongod.service - MongoDB Database Server
     Loaded: loaded (/lib/systemd/system/mongod.service; disabled; vendor prese>
     Active: active (running) since Thu 2024-11-28 23:24:45 +07; 2s ago

https://stackoverflow.com/questions/38921414/mongodb-what-are-the-default-user-and-password

https://yopmail.com/ test by hunglt.ee@yopmail.com
```
