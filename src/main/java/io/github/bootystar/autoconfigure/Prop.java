package io.github.bootystar.autoconfigure;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "booty")
@EnableConfigurationProperties({Prop.class})
public class Prop {
    private Minio minio;
    @Data
    @Accessors(chain = true)
    public static class Minio{
        private Boolean enable = false;
        private String endpoint = "localhost:9000";
        private String accessKey = "minioadmin";
        private String secretKey = "minioadmin";
        private String bucketName ;
    }

}
