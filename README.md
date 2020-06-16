# spring-boot-kafka-producer

## Setup Apache Kafka in Windows 10

- Download the latest version of Apache Kafka from [here](https://kafka.apache.org/downloads).
- Unzip the file to C drive
- go inside Kafka directory in C drive
- Create two folders 'kafka-logs' and 'zookeeper-data'
- Open config/server.properties and modify `log.dirs=C:/kafka_2.13-2.5.0/kafka-logs`
- Open config/zookeeper.properties and modify `dataDir=C:/kafka_2.13-2.5.0/zookeeper-data`
- Start Zookeeper `bin/windows/zookeeper-server-start.bat config/zookeeper.properties`
- Start Apache Kafka `bin/windows/kafka-server-start.bat config/server.properties`
- View Kafka Topic List `bin/windows/kafka-topics.bat --list --bootstrap-server localhost:9092`
- Create Kafka Topics

	`bin/windows/kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic simple-topic`
                       
	`bin/windows/kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic json-topic`

For full set of Kafka CLI instructions, view https://kafka.apache.org/quickstart