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


missed message (update topics) và khởi động lại - https://youtu.be/rnvdPp6CzXs?si=yoLy9MieYih5sakx&t=1575
chọn group mới

kafka sử dụng value json
topic: notification-delivery

2024-11-29T12:45:38.012+07:00  INFO 34653 --- [notification-service] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.2
2024-11-29T12:45:38.014+07:00  INFO 34653 --- [notification-service] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: c4deed513057c94e
2024-11-29T12:45:38.014+07:00  INFO 34653 --- [notification-service] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1732859138010
2024-11-29T12:45:38.018+07:00  INFO 34653 --- [notification-service] [           main] fkaConsumerFactory$ExtendedKafkaConsumer : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Subscribed to topic(s): notification-delivery
2024-11-29T12:45:38.045+07:00  INFO 34653 --- [notification-service] [           main] c.d.n.NotificationServiceApplication     : Started NotificationServiceApplication in 5.194 seconds (process running for 5.702)
2024-11-29T12:45:38.644+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Cluster ID: q_zYMQ_sQ4uLNU5JsAsk1Q
2024-11-29T12:45:38.645+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Discovered group coordinator localhost:9094 (id: 2147483647 rack: null)
2024-11-29T12:45:38.648+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] (Re-)joining group
2024-11-29T12:45:38.665+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Request joining group due to: need to re-join with the given member-id: consumer-notification-group-1-baddb674-35eb-461a-9645-79ad62b4d53b
2024-11-29T12:45:38.665+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Request joining group due to: rebalance failed due to 'The group member needs to have a valid member id before actually entering a consumer group.' (MemberIdRequiredException)
2024-11-29T12:45:38.665+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] (Re-)joining group
2024-11-29T12:45:41.669+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Successfully joined group with generation Generation{generationId=13, memberId='consumer-notification-group-1-baddb674-35eb-461a-9645-79ad62b4d53b', protocol='range'}
2024-11-29T12:45:41.682+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Finished assignment for group at generation 13: {consumer-notification-group-1-baddb674-35eb-461a-9645-79ad62b4d53b=Assignment(partitions=[notification-delivery-0])}
2024-11-29T12:45:41.692+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Successfully synced group in generation Generation{generationId=13, memberId='consumer-notification-group-1-baddb674-35eb-461a-9645-79ad62b4d53b', protocol='range'}
2024-11-29T12:45:41.693+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Notifying assignor about the new Assignment(partitions=[notification-delivery-0])
2024-11-29T12:45:41.698+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Adding newly assigned partitions: notification-delivery-0
2024-11-29T12:45:41.714+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-notification-group-1, groupId=notification-group] Setting offset for partition notification-delivery-0 to the committed offset FetchPosition{offset=6, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9094 (id: 0 rack: null)], epoch=0}}
2024-11-29T12:45:41.715+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : notification-group: partitions assigned: [notification-delivery-0]
2024-11-29T12:45:59.399+07:00  INFO 34653 --- [notification-service] [ntainer#0-0-C-1] c.d.n.controller.NotificationController  : Message received: NotificationEvent(channel=EMAIL, recipient=hunglt.ee@yopmail.com, templateCode=null, param=null, subject=Welcome to bookteria, body=Hello, hung_account+1)
```
