# Spark Streaming: Real-Time Processing

This project features data processing using Spark Streaming, Kafka, and Cassandra. It simulates an IoT data pipeline with batch processing capabilities in a Lambda architecture.

---

## Features

- **Data Ingestion**: Simulates IoT sensor data streams in JSON format.
- **Streaming with Kafka**: Streams data to Apache Kafka topics using a Java-based Kafka Producer.
- **Speed Layer**: Processes real-time data using Spark Streaming and Kafka.
- **Batch Layer**: Implements batch processing with HDFS, Spark, Hive, and Sqoop.
- **Data Persistence**: Stores processed data in Cassandra for low-latency access.
- **Real-Time Analytics**: Enables monitoring and analysis of data streams through custom dashboards and tools.

---

## Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/samiimasmoudii/BigData-Speed-Processing-with-Spark-Streaming.git

cd 
```

### 2. Start the Environment
```bash
docker-compose up -d
```

### 3. Run the Producer
```bash
mvn clean package
//choose a name for the jar you're going to generate
java -cp target/spark-streaming-project-1.0-SNAPSHOT.jar com.example.kafka.producer.KafkaProducerApp
```

### 4. Deploy Real-Time Processing
- **Spark Streaming**: Run Spark jobs for real-time analytics and data transformation.

### 5. Batch Processing
- Implement the pipeline with HDFS, Spark, Hive, and Sqoop for batch data processing and analysis.

### 6. Monitor Data Streams
- Use Kafka tools like `kafka-console-consumer` or dashboards for stream visualization.
- Query Cassandra for real-time and historical insights.

---

## Technologies Used

- **Java & Maven**: For the Kafka Producer and project build.
- **Apache Kafka**: As the core streaming platform.
- **Apache Spark**: For both streaming and batch data processing.
- **Apache Cassandra**: For data persistence.
- **HDFS, Hive, and Sqoop**: For batch layer processing.
- **Docker**: To containerize the environment for deployment.
- **Jackson**: For JSON serialization.

---

## Author

**Sami MASMOUDI**  
Software Engineering Student  
[LinkedIn](https://linkedin.com/in/sami-masmoudi) | [GitHub](https://github.com/samiimasmoudii)

---

Feel free to explore, contribute, or raise issues in this repository!

