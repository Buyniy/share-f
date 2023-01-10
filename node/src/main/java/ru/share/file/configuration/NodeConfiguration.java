package ru.share.file.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.share.file.utils.CryptoTool;

@Configuration
public class NodeConfiguration {
    @Value("${salt}")
    private String salt;

    @Bean
    public CryptoTool getCryptoTool() {
        return new CryptoTool(salt);
    }
}
