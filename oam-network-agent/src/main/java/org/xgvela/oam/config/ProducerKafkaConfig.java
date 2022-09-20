package org.xgvela.oam.config;

import lombok.Data;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@Data
public class ProducerKafkaConfig {

	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;

	@Value("${spring.kafka.producer.retries}")
	private String retries;

	@Value("${spring.kafka.producer.batch-size}")
	private String batchSize;

	@Value("${spring.kafka.producer.linger-ms}")
	private String lingerms;

	@Value("${spring.kafka.producer.buffer-memory}")
	private String bufferMemory;

	@Value("${spring.kafka.producer.max-block-ms}")
	private String maxBlockMsConfig;

	@Value("${spring.kafka.producer.compression-type}")
	private String compressionType;

	@Value("${spring.kafka.producer.request-timeout-ms}")
	private String requestTimeoutmsConfig;

	@Value("${spring.kafka.producer.max-request-size}")
	private String maxRequestSizeConfig;

	private String keySerializerClass = "org.apache.kafka.common.serialization.StringSerializer";

	private String valueSerializerClass = "org.apache.kafka.common.serialization.StringSerializer";

	@Value("${spring.kafka.producer.acks}")
	private String acks;

	@Value("${spring.kafka.producer.batch-count}")
	public int batchCount;

	@Bean
	public Properties getProducerConfig() {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		props.put(ProducerConfig.ACKS_CONFIG, acks);
		props.put(ProducerConfig.RETRIES_CONFIG, retries);
		props.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
		props.put(ProducerConfig.LINGER_MS_CONFIG, lingerms);
		props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
		props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, compressionType);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializerClass);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializerClass);
		props.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, maxBlockMsConfig);
		props.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, requestTimeoutmsConfig);
		return props;
	}
}
