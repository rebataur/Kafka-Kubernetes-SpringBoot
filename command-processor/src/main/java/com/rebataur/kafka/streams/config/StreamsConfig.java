package com.rebataur.kafka.streams.config;

import com.rebataur.kafka.streams.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
    
}
