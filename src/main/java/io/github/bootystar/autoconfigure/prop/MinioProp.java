package io.github.bootystar.autoconfigure.prop;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "booty.minio")
@Data
public class MinioProp {
    private Boolean enable = false;
    private String endpoint = "localhost:9000";
    private String accessKey = "minioadmin";
    private String secretKey = "minioadmin";
    private String bucketName ;

}
