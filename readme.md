### To start application

mvn spring-boot:run
docker compose -f .\docker-compose.yml up -d
docker exec -it kiwi-kafka-1 /opt/kafka/bin/kafka-topics.sh --create --topic test_topic --bootstrap-server localhost:9092

producer
docker exec -it kiwi-kafka-1 /opt/kafka/bin/kafka-console-producer.sh --topic test_topic --bootstrap-server localhost:9092

consumer
docker exec -it kiwi-kafka-1 /opt/kafka/bin/kafka-console-consumer.sh --topic test_topic --bootstrap-server localhost:9092'

consumer groups
docker exec -it kiwi-kafka-1 /opt/kafka/bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --list
