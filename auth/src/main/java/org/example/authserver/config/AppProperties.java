package org.example.authserver.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {
  private boolean testMode;
  private String jwtParam;
  private boolean jwtParamEnabled;
}
